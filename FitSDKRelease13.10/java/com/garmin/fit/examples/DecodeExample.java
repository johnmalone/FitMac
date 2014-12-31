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


package com.garmin.fit.examples;

import com.garmin.fit.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class DecodeExample {
   private static class Listener implements FileIdMesgListener, UserProfileMesgListener {
      public void onMesg(FileIdMesg mesg) {
         System.out.println("File ID:");

         if ((mesg.getType() != null) && (mesg.getType() != File.INVALID)) {
            System.out.print("   Type: ");
            System.out.println(mesg.getType().getValue());
         }

         if ((mesg.getManufacturer() != null) && (!mesg.getManufacturer().equals(Manufacturer.INVALID))) {
            System.out.print("   Manufacturer: ");
            System.out.println(mesg.getManufacturer());
         }

         if ((mesg.getProduct() != null) && (!mesg.getProduct().equals(Fit.UINT16_INVALID))) {
            System.out.print("   Product: ");
            System.out.println(mesg.getProduct());
         }

         if ((mesg.getSerialNumber() != null) && (!mesg.getSerialNumber().equals(Fit.UINT32Z_INVALID))) {
            System.out.print("   Serial Number: ");
            System.out.println(mesg.getSerialNumber());
         }

         if ((mesg.getNumber() != null) && (!mesg.getNumber().equals(Fit.UINT16_INVALID))) {
            System.out.print("   Number: ");
            System.out.println(mesg.getNumber());
         }
      }

      public void onMesg(UserProfileMesg mesg) {
         System.out.println("User profile:");

         if ((mesg.getFriendlyName() != null) && (!mesg.getFriendlyName().equals(Fit.STRING_INVALID))) {
            System.out.print("   Friendly Name: ");
            System.out.println(mesg.getFriendlyName());
         }

         if (mesg.getGender() != null) {
            if (mesg.getGender() == Gender.MALE)
               System.out.println("   Gender: Male");
            else if (mesg.getGender() == Gender.FEMALE)
               System.out.println("   Gender: Female");
         }

         if ((mesg.getAge() != null) && (!mesg.getAge().equals(Fit.UINT8_INVALID))) {
            System.out.print("   Age [years]: ");
            System.out.println(mesg.getAge());
         }

         if ((mesg.getWeight() != null) && (!mesg.getWeight().equals(Fit.FLOAT32_INVALID))) {
            System.out.print("   Weight [kg]: ");
            System.out.println(mesg.getWeight());
         }
      }
   }

   public static void main(String[] args) {
      Decode decode = new Decode();
      //decode.skipHeader();        // Use on streams with no header and footer (stream contains FIT defn and data messages only)
      //decode.incompleteStream();  // This suppresses exceptions with unexpected eof (also incorrect crc)
      MesgBroadcaster mesgBroadcaster = new MesgBroadcaster(decode);
      Listener listener = new Listener();
      FileInputStream in;

      System.out.println("FIT Decode Example Application");

      if (args.length != 1) {
         System.out.println("Usage: java -jar DecodeExample.jar <filename>");
         return;
      }

      try {
         in = new FileInputStream(args[0]);
      } catch (java.io.IOException e) {
         throw new RuntimeException("Error opening file " + args[0] + " [1]");
      }

      try {
         if (!Decode.checkIntegrity((InputStream) in))
            throw new RuntimeException("FIT file integrity failed.");
      }  catch (RuntimeException e) {
         System.err.print("Exception Checking File Integrity: ");
         System.err.println(e.getMessage());
         System.err.println("Trying to continue...");
      }
      finally {
         try {
            in.close();
         } catch (java.io.IOException e) {
            throw new RuntimeException(e);
         }
      }

      try {
         in = new FileInputStream(args[0]);
      } catch (java.io.IOException e) {
         throw new RuntimeException("Error opening file " + args[0] + " [2]");
      }

      mesgBroadcaster.addListener((FileIdMesgListener) listener);
      mesgBroadcaster.addListener((UserProfileMesgListener) listener);

      try {
         mesgBroadcaster.run(in);
      } catch (FitRuntimeException e) {
         System.err.print("Exception decoding file: ");
         System.err.println(e.getMessage());

         try {
            in.close();
         } catch (java.io.IOException f) {
            throw new RuntimeException(f);
         }

         return;
      }

      try {
         in.close();
      } catch (java.io.IOException e) {
         throw new RuntimeException(e);
      }

      System.out.println("Decoded FIT file " + args[0] + ".");
   }
}
