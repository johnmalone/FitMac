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


public class MonitoringMesg extends Mesg {

   protected static final	Mesg monitoringMesg;
   static {            
      int field_index = 0;
      int subfield_index = 0;         
      // monitoring   
      monitoringMesg = new Mesg("monitoring", MesgNum.MONITORING);
      monitoringMesg.addField(new Field("timestamp", 253, 134, 1, 0, "s", false));
      field_index++;
      monitoringMesg.addField(new Field("device_index", 0, 2, 1, 0, "", false));
      field_index++;
      monitoringMesg.addField(new Field("calories", 1, 132, 1, 0, "kcal", false));
      field_index++;
      monitoringMesg.addField(new Field("distance", 2, 134, 100, 0, "m", false));
      field_index++;
      monitoringMesg.addField(new Field("cycles", 3, 134, 2, 0, "cycles", false));
      subfield_index = 0;
      monitoringMesg.fields.get(field_index).subFields.add(new SubField("steps", 134, 1, 0, "steps"));
      monitoringMesg.fields.get(field_index).subFields.get(subfield_index).addMap(5, 6);
      monitoringMesg.fields.get(field_index).subFields.get(subfield_index).addMap(5, 1);
      subfield_index++;
      monitoringMesg.fields.get(field_index).subFields.add(new SubField("strokes", 134, 2, 0, "strokes"));
      monitoringMesg.fields.get(field_index).subFields.get(subfield_index).addMap(5, 2);
      monitoringMesg.fields.get(field_index).subFields.get(subfield_index).addMap(5, 5);
      subfield_index++;
      field_index++;
      monitoringMesg.addField(new Field("active_time", 4, 134, 1000, 0, "s", false));
      field_index++;
      monitoringMesg.addField(new Field("activity_type", 5, 0, 1, 0, "", false));
      field_index++;
      monitoringMesg.addField(new Field("activity_subtype", 6, 0, 1, 0, "", false));
      field_index++;
      monitoringMesg.addField(new Field("activity_level", 7, 0, 1, 0, "", false));
      field_index++;
      monitoringMesg.addField(new Field("distance_16", 8, 132, 1, 0, "100 * m", false));
      field_index++;
      monitoringMesg.addField(new Field("cycles_16", 9, 132, 1, 0, "2 * cycles (steps)", false));
      field_index++;
      monitoringMesg.addField(new Field("active_time_16", 10, 132, 1, 0, "s", false));
      field_index++;
      monitoringMesg.addField(new Field("local_timestamp", 11, 134, 1, 0, "", false));
      field_index++;
      monitoringMesg.addField(new Field("temperature", 12, 131, 100, 0, "C", false));
      field_index++;
      monitoringMesg.addField(new Field("temperature_min", 14, 131, 100, 0, "C", false));
      field_index++;
      monitoringMesg.addField(new Field("temperature_max", 15, 131, 100, 0, "C", false));
      field_index++;
      monitoringMesg.addField(new Field("activity_time", 16, 132, 1, 0, "minutes", false));
      field_index++;
      monitoringMesg.addField(new Field("active_calories", 19, 132, 1, 0, "kcal", false));
      field_index++;
      monitoringMesg.addField(new Field("current_activity_type_intensity", 24, 13, 1, 0, "", false)); 
      monitoringMesg.fields.get(field_index).components.add(new FieldComponent(5, false, 5, 1, 0)); // activity_type 
      monitoringMesg.fields.get(field_index).components.add(new FieldComponent(28, false, 3, 1, 0)); // intensity
      field_index++;
      monitoringMesg.addField(new Field("timestamp_min_8", 25, 2, 1, 0, "min", false));
      field_index++;
      monitoringMesg.addField(new Field("timestamp_16", 26, 132, 1, 0, "s", false));
      field_index++;
      monitoringMesg.addField(new Field("heart_rate", 27, 2, 1, 0, "bpm", false));
      field_index++;
      monitoringMesg.addField(new Field("intensity", 28, 2, 10, 0, "", false));
      field_index++;
      monitoringMesg.addField(new Field("duration_min", 29, 132, 1, 0, "min", false));
      field_index++;
      monitoringMesg.addField(new Field("duration", 30, 134, 1, 0, "s", false));
      field_index++;
   }

   public MonitoringMesg() {
      super(Factory.createMesg(MesgNum.MONITORING));
   }

   public MonitoringMesg(final Mesg mesg) {
      super(mesg);
   }


   /**
    * Get timestamp field
    * Units: s
    * Comment: Must align to logging interval, for example, time must be 00:00:00 for daily log.
    *
    * @return timestamp
    */
   public DateTime getTimestamp() {
      return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
   }

   /**
    * Set timestamp field
    * Units: s
    * Comment: Must align to logging interval, for example, time must be 00:00:00 for daily log.
    *
    * @param timestamp
    */
   public void setTimestamp(DateTime timestamp) {
      setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get device_index field
    * Comment: Associates this data to device_info message.  Not required for file with single device (sensor).
    *
    * @return device_index
    */
   public Short getDeviceIndex() {
      return getFieldShortValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set device_index field
    * Comment: Associates this data to device_info message.  Not required for file with single device (sensor).
    *
    * @param deviceIndex
    */
   public void setDeviceIndex(Short deviceIndex) {
      setFieldValue(0, 0, deviceIndex, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get calories field
    * Units: kcal
    * Comment: Accumulated total calories.  Maintained by MonitoringReader for each activity_type.  See SDK documentation
    *
    * @return calories
    */
   public Integer getCalories() {
      return getFieldIntegerValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set calories field
    * Units: kcal
    * Comment: Accumulated total calories.  Maintained by MonitoringReader for each activity_type.  See SDK documentation
    *
    * @param calories
    */
   public void setCalories(Integer calories) {
      setFieldValue(1, 0, calories, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get distance field
    * Units: m
    * Comment: Accumulated distance.  Maintained by MonitoringReader for each activity_type.  See SDK documentation.
    *
    * @return distance
    */
   public Float getDistance() {
      return getFieldFloatValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set distance field
    * Units: m
    * Comment: Accumulated distance.  Maintained by MonitoringReader for each activity_type.  See SDK documentation.
    *
    * @param distance
    */
   public void setDistance(Float distance) {
      setFieldValue(2, 0, distance, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get cycles field
    * Units: cycles
    * Comment: Accumulated cycles.  Maintained by MonitoringReader for each activity_type.  See SDK documentation.
    *
    * @return cycles
    */
   public Float getCycles() {
      return getFieldFloatValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set cycles field
    * Units: cycles
    * Comment: Accumulated cycles.  Maintained by MonitoringReader for each activity_type.  See SDK documentation.
    *
    * @param cycles
    */
   public void setCycles(Float cycles) {
      setFieldValue(3, 0, cycles, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get steps field
    * Units: steps
    *
    * @return steps
    */
   public Long getSteps() {
      return getFieldLongValue(3, 0, Profile.SubFields.MONITORING_MESG_CYCLES_FIELD_STEPS);
   }

   /**
    * Set steps field
    * Units: steps
    *
    * @param steps
    */
   public void setSteps(Long steps) {
      setFieldValue(3, 0, steps, Profile.SubFields.MONITORING_MESG_CYCLES_FIELD_STEPS);
   }

   /**
    * Get strokes field
    * Units: strokes
    *
    * @return strokes
    */
   public Float getStrokes() {
      return getFieldFloatValue(3, 0, Profile.SubFields.MONITORING_MESG_CYCLES_FIELD_STROKES);
   }

   /**
    * Set strokes field
    * Units: strokes
    *
    * @param strokes
    */
   public void setStrokes(Float strokes) {
      setFieldValue(3, 0, strokes, Profile.SubFields.MONITORING_MESG_CYCLES_FIELD_STROKES);
   }

   /**
    * Get active_time field
    * Units: s
    *
    * @return active_time
    */
   public Float getActiveTime() {
      return getFieldFloatValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set active_time field
    * Units: s
    *
    * @param activeTime
    */
   public void setActiveTime(Float activeTime) {
      setFieldValue(4, 0, activeTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get activity_type field
    *
    * @return activity_type
    */
   public ActivityType getActivityType() {
      Short value = getFieldShortValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
      if (value == null)
         return null;
      return ActivityType.getByValue(value);
   }

   /**
    * Set activity_type field
    *
    * @param activityType
    */
   public void setActivityType(ActivityType activityType) {
      setFieldValue(5, 0, activityType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get activity_subtype field
    *
    * @return activity_subtype
    */
   public ActivitySubtype getActivitySubtype() {
      Short value = getFieldShortValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
      if (value == null)
         return null;
      return ActivitySubtype.getByValue(value);
   }

   /**
    * Set activity_subtype field
    *
    * @param activitySubtype
    */
   public void setActivitySubtype(ActivitySubtype activitySubtype) {
      setFieldValue(6, 0, activitySubtype.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get activity_level field
    *
    * @return activity_level
    */
   public ActivityLevel getActivityLevel() {
      Short value = getFieldShortValue(7, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
      if (value == null)
         return null;
      return ActivityLevel.getByValue(value);
   }

   /**
    * Set activity_level field
    *
    * @param activityLevel
    */
   public void setActivityLevel(ActivityLevel activityLevel) {
      setFieldValue(7, 0, activityLevel.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get distance_16 field
    * Units: 100 * m
    *
    * @return distance_16
    */
   public Integer getDistance16() {
      return getFieldIntegerValue(8, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set distance_16 field
    * Units: 100 * m
    *
    * @param distance16
    */
   public void setDistance16(Integer distance16) {
      setFieldValue(8, 0, distance16, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get cycles_16 field
    * Units: 2 * cycles (steps)
    *
    * @return cycles_16
    */
   public Integer getCycles16() {
      return getFieldIntegerValue(9, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set cycles_16 field
    * Units: 2 * cycles (steps)
    *
    * @param cycles16
    */
   public void setCycles16(Integer cycles16) {
      setFieldValue(9, 0, cycles16, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get active_time_16 field
    * Units: s
    *
    * @return active_time_16
    */
   public Integer getActiveTime16() {
      return getFieldIntegerValue(10, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set active_time_16 field
    * Units: s
    *
    * @param activeTime16
    */
   public void setActiveTime16(Integer activeTime16) {
      setFieldValue(10, 0, activeTime16, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get local_timestamp field
    * Comment: Must align to logging interval, for example, time must be 00:00:00 for daily log.
    *
    * @return local_timestamp
    */
   public Long getLocalTimestamp() {
      return getFieldLongValue(11, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set local_timestamp field
    * Comment: Must align to logging interval, for example, time must be 00:00:00 for daily log.
    *
    * @param localTimestamp
    */
   public void setLocalTimestamp(Long localTimestamp) {
      setFieldValue(11, 0, localTimestamp, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get temperature field
    * Units: C
    * Comment: Avg temperature during the logging interval ended at timestamp
    *
    * @return temperature
    */
   public Float getTemperature() {
      return getFieldFloatValue(12, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set temperature field
    * Units: C
    * Comment: Avg temperature during the logging interval ended at timestamp
    *
    * @param temperature
    */
   public void setTemperature(Float temperature) {
      setFieldValue(12, 0, temperature, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get temperature_min field
    * Units: C
    * Comment: Min temperature during the logging interval ended at timestamp
    *
    * @return temperature_min
    */
   public Float getTemperatureMin() {
      return getFieldFloatValue(14, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set temperature_min field
    * Units: C
    * Comment: Min temperature during the logging interval ended at timestamp
    *
    * @param temperatureMin
    */
   public void setTemperatureMin(Float temperatureMin) {
      setFieldValue(14, 0, temperatureMin, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get temperature_max field
    * Units: C
    * Comment: Max temperature during the logging interval ended at timestamp
    *
    * @return temperature_max
    */
   public Float getTemperatureMax() {
      return getFieldFloatValue(15, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set temperature_max field
    * Units: C
    * Comment: Max temperature during the logging interval ended at timestamp
    *
    * @param temperatureMax
    */
   public void setTemperatureMax(Float temperatureMax) {
      setFieldValue(15, 0, temperatureMax, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * @return number of activity_time
    */
   public int getNumActivityTime() {
      return getNumFieldValues(16, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get activity_time field
    * Units: minutes
    * Comment: Indexed using minute_activity_level enum
    *
    * @param index of activity_time
    * @return activity_time
    */
   public Integer getActivityTime(int index) {
      return getFieldIntegerValue(16, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set activity_time field
    * Units: minutes
    * Comment: Indexed using minute_activity_level enum
    *
    * @param index of activity_time
    * @param activityTime
    */
   public void setActivityTime(int index, Integer activityTime) {
      setFieldValue(16, index, activityTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get active_calories field
    * Units: kcal
    *
    * @return active_calories
    */
   public Integer getActiveCalories() {
      return getFieldIntegerValue(19, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set active_calories field
    * Units: kcal
    *
    * @param activeCalories
    */
   public void setActiveCalories(Integer activeCalories) {
      setFieldValue(19, 0, activeCalories, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get current_activity_type_intensity field
    * Comment: Indicates single type / intensity for duration since last monitoring message.
    *
    * @return current_activity_type_intensity
    */
   public Byte getCurrentActivityTypeIntensity() {
      return getFieldByteValue(24, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set current_activity_type_intensity field
    * Comment: Indicates single type / intensity for duration since last monitoring message.
    *
    * @param currentActivityTypeIntensity
    */
   public void setCurrentActivityTypeIntensity(Byte currentActivityTypeIntensity) {
      setFieldValue(24, 0, currentActivityTypeIntensity, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get timestamp_min_8 field
    * Units: min
    *
    * @return timestamp_min_8
    */
   public Short getTimestampMin8() {
      return getFieldShortValue(25, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set timestamp_min_8 field
    * Units: min
    *
    * @param timestampMin8
    */
   public void setTimestampMin8(Short timestampMin8) {
      setFieldValue(25, 0, timestampMin8, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get timestamp_16 field
    * Units: s
    *
    * @return timestamp_16
    */
   public Integer getTimestamp16() {
      return getFieldIntegerValue(26, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set timestamp_16 field
    * Units: s
    *
    * @param timestamp16
    */
   public void setTimestamp16(Integer timestamp16) {
      setFieldValue(26, 0, timestamp16, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get heart_rate field
    * Units: bpm
    *
    * @return heart_rate
    */
   public Short getHeartRate() {
      return getFieldShortValue(27, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set heart_rate field
    * Units: bpm
    *
    * @param heartRate
    */
   public void setHeartRate(Short heartRate) {
      setFieldValue(27, 0, heartRate, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get intensity field
    *
    * @return intensity
    */
   public Float getIntensity() {
      return getFieldFloatValue(28, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set intensity field
    *
    * @param intensity
    */
   public void setIntensity(Float intensity) {
      setFieldValue(28, 0, intensity, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get duration_min field
    * Units: min
    *
    * @return duration_min
    */
   public Integer getDurationMin() {
      return getFieldIntegerValue(29, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set duration_min field
    * Units: min
    *
    * @param durationMin
    */
   public void setDurationMin(Integer durationMin) {
      setFieldValue(29, 0, durationMin, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get duration field
    * Units: s
    *
    * @return duration
    */
   public Long getDuration() {
      return getFieldLongValue(30, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set duration field
    * Units: s
    *
    * @param duration
    */
   public void setDuration(Long duration) {
      setFieldValue(30, 0, duration, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

}
