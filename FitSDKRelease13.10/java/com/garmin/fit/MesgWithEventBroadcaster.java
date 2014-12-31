////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Dynastream Innovations Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2014 Dynastream Innovations Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 13.10Release
// Tag = $Name$
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;

import java.util.LinkedList;
import java.util.ArrayList;

public class MesgWithEventBroadcaster implements MesgWithEventListener {
   private int MAX_GROUPS = 256;
   private int DEFAULT_GROUP = 255;
   private int BEGIN_END_GROUP = 254;

   private ArrayList<MesgWithEventListener> listeners;
   private ArrayList<LinkedList<MesgWithEvent>> startedEvents;

   public MesgWithEventBroadcaster() {
      listeners = new ArrayList<MesgWithEventListener>();
      startedEvents = new ArrayList<LinkedList<MesgWithEvent>>();

      for (int i = 0; i < MAX_GROUPS; i++) {
         startedEvents.add(new LinkedList<MesgWithEvent>());
      }
   }

   public void addListener(MesgWithEventListener mesgObserver) {
      listeners.add(mesgObserver);
   }

   public void onMesg(final MesgWithEvent mesg) {
      MesgWithEvent broadcastMesg = (MesgWithEvent)Factory.createMesg((Mesg)mesg);
      int group = DEFAULT_GROUP;

      if (broadcastMesg.getEventGroup() != null) {
         group = broadcastMesg.getEventGroup();
      }

      if (broadcastMesg.getEventType() == null)
         return; // Invalid so ignore.
      
      // Convert depreciated events types for backwards compatibility.
      switch (broadcastMesg.getEventType()) {
         case BEGIN_DEPRECIATED:
            group = BEGIN_END_GROUP;
            broadcastMesg.setEventType(EventType.START);
            break;

         case END_DEPRECIATED:
            group = BEGIN_END_GROUP;
            broadcastMesg.setEventType(EventType.STOP);
            break;

         case CONSECUTIVE_DEPRECIATED:
            broadcastMesg.setEventType(EventType.STOP);
            break;

         case END_ALL_DEPRECIATED:
            group = BEGIN_END_GROUP;
            broadcastMesg.setEventType(EventType.STOP_ALL);
            break;

         default:
            break;
      }
      
      switch (broadcastMesg.getEventType()) {
         case START:
            for (int i = 0; i < startedEvents.get(group).size(); i++) {
               if (startedEvents.get(group).get(i).getEvent() == broadcastMesg.getEvent()) {
                  MesgWithEvent stopEvent = (MesgWithEvent)Factory.createMesg((Mesg)startedEvents.get(group).get(i));
                  DateTime timestamp = broadcastMesg.getTimestamp();
                  stopEvent.setEventType(EventType.STOP);
            	  if (timestamp != null)
                     stopEvent.setTimestamp(timestamp);
            	  broadcast(stopEvent);
            	  startedEvents.get(group).remove(i);
               }
            }
            
            startedEvents.get(group).add((MesgWithEvent)Factory.createMesg((Mesg)broadcastMesg));
            break;

         case STOP:
         case STOP_DISABLE:
            for (int i = 0; i < startedEvents.get(group).size(); i++) {
               if (startedEvents.get(group).get(i).getEvent() == broadcastMesg.getEvent()) {
                  startedEvents.get(group).remove(i);
               }
            }
            break;

         case STOP_ALL:
            for (int i = 0; i < startedEvents.get(group).size(); i++) {
               if (startedEvents.get(group).get(i).getEvent() != broadcastMesg.getEvent()) {
            	   MesgWithEvent stopEvent = (MesgWithEvent)Factory.createMesg((Mesg)startedEvents.get(group).get(i));
            	   DateTime timestamp = broadcastMesg.getTimestamp();
                   stopEvent.setEventType(EventType.STOP);
                   if (timestamp != null)
                      stopEvent.setTimestamp(timestamp);
                   broadcast(stopEvent);
               }
            }

            startedEvents.get(group).clear();
            broadcastMesg.setEventType(EventType.STOP);
            break;

         case STOP_DISABLE_ALL:
            for (int i = 0; i < startedEvents.get(group).size(); i++) {
               if (startedEvents.get(group).get(i).getEvent() != broadcastMesg.getEvent()) {
                  MesgWithEvent stopEvent = (MesgWithEvent)Factory.createMesg((Mesg)startedEvents.get(group).get(i));
                  DateTime timestamp = broadcastMesg.getTimestamp();
                  stopEvent.setEventType(EventType.STOP_DISABLE);
                  if (timestamp != null)
                     stopEvent.setTimestamp(timestamp);
                  broadcast(stopEvent);
               }
            }

            startedEvents.get(group).clear();
            broadcastMesg.setEventType(EventType.STOP_DISABLE);
            break;

         case MARKER:
         default:
            break;
      }

      broadcast(broadcastMesg);
   }

   private void broadcast(final MesgWithEvent mesg) {
      for (final MesgWithEventListener listener : listeners) {
         listener.onMesg(mesg);
      }
   }
}
