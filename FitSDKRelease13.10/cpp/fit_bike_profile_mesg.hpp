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


#if !defined(FIT_BIKE_PROFILE_MESG_HPP)
#define FIT_BIKE_PROFILE_MESG_HPP

#include "fit_mesg.hpp"

namespace fit
{

class BikeProfileMesg : public Mesg
{
   public:
      BikeProfileMesg(void) : Mesg(Profile::MESG_BIKE_PROFILE)
      {
      }

      BikeProfileMesg(const Mesg &mesg) : Mesg(mesg)
      {
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns message_index field
      ///////////////////////////////////////////////////////////////////////
      FIT_MESSAGE_INDEX GetMessageIndex(void) const
      {
         return GetFieldUINT16Value(254, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set message_index field
      ///////////////////////////////////////////////////////////////////////
      void SetMessageIndex(FIT_MESSAGE_INDEX messageIndex)
      {
         SetFieldUINT16Value(254, messageIndex, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns name field
      ///////////////////////////////////////////////////////////////////////
      FIT_WSTRING GetName(void) const
      {
         return GetFieldSTRINGValue(0, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set name field
      ///////////////////////////////////////////////////////////////////////
      void SetName(FIT_WSTRING name)
      {
         SetFieldSTRINGValue(0, name, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns sport field
      ///////////////////////////////////////////////////////////////////////
      FIT_SPORT GetSport(void) const
      {
         return GetFieldENUMValue(1, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set sport field
      ///////////////////////////////////////////////////////////////////////
      void SetSport(FIT_SPORT sport)
      {
         SetFieldENUMValue(1, sport, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns sub_sport field
      ///////////////////////////////////////////////////////////////////////
      FIT_SUB_SPORT GetSubSport(void) const
      {
         return GetFieldENUMValue(2, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set sub_sport field
      ///////////////////////////////////////////////////////////////////////
      void SetSubSport(FIT_SUB_SPORT subSport)
      {
         SetFieldENUMValue(2, subSport, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns odometer field
      // Units: m
      ///////////////////////////////////////////////////////////////////////
      FIT_FLOAT32 GetOdometer(void) const
      {
         return GetFieldFLOAT32Value(3, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set odometer field
      // Units: m
      ///////////////////////////////////////////////////////////////////////
      void SetOdometer(FIT_FLOAT32 odometer)
      {
         SetFieldFLOAT32Value(3, odometer, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns bike_spd_ant_id field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT16Z GetBikeSpdAntId(void) const
      {
         return GetFieldUINT16ZValue(4, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set bike_spd_ant_id field
      ///////////////////////////////////////////////////////////////////////
      void SetBikeSpdAntId(FIT_UINT16Z bikeSpdAntId)
      {
         SetFieldUINT16ZValue(4, bikeSpdAntId, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns bike_cad_ant_id field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT16Z GetBikeCadAntId(void) const
      {
         return GetFieldUINT16ZValue(5, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set bike_cad_ant_id field
      ///////////////////////////////////////////////////////////////////////
      void SetBikeCadAntId(FIT_UINT16Z bikeCadAntId)
      {
         SetFieldUINT16ZValue(5, bikeCadAntId, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns bike_spdcad_ant_id field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT16Z GetBikeSpdcadAntId(void) const
      {
         return GetFieldUINT16ZValue(6, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set bike_spdcad_ant_id field
      ///////////////////////////////////////////////////////////////////////
      void SetBikeSpdcadAntId(FIT_UINT16Z bikeSpdcadAntId)
      {
         SetFieldUINT16ZValue(6, bikeSpdcadAntId, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns bike_power_ant_id field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT16Z GetBikePowerAntId(void) const
      {
         return GetFieldUINT16ZValue(7, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set bike_power_ant_id field
      ///////////////////////////////////////////////////////////////////////
      void SetBikePowerAntId(FIT_UINT16Z bikePowerAntId)
      {
         SetFieldUINT16ZValue(7, bikePowerAntId, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns custom_wheelsize field
      // Units: m
      ///////////////////////////////////////////////////////////////////////
      FIT_FLOAT32 GetCustomWheelsize(void) const
      {
         return GetFieldFLOAT32Value(8, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set custom_wheelsize field
      // Units: m
      ///////////////////////////////////////////////////////////////////////
      void SetCustomWheelsize(FIT_FLOAT32 customWheelsize)
      {
         SetFieldFLOAT32Value(8, customWheelsize, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns auto_wheelsize field
      // Units: m
      ///////////////////////////////////////////////////////////////////////
      FIT_FLOAT32 GetAutoWheelsize(void) const
      {
         return GetFieldFLOAT32Value(9, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set auto_wheelsize field
      // Units: m
      ///////////////////////////////////////////////////////////////////////
      void SetAutoWheelsize(FIT_FLOAT32 autoWheelsize)
      {
         SetFieldFLOAT32Value(9, autoWheelsize, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns bike_weight field
      // Units: kg
      ///////////////////////////////////////////////////////////////////////
      FIT_FLOAT32 GetBikeWeight(void) const
      {
         return GetFieldFLOAT32Value(10, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set bike_weight field
      // Units: kg
      ///////////////////////////////////////////////////////////////////////
      void SetBikeWeight(FIT_FLOAT32 bikeWeight)
      {
         SetFieldFLOAT32Value(10, bikeWeight, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns power_cal_factor field
      // Units: %
      ///////////////////////////////////////////////////////////////////////
      FIT_FLOAT32 GetPowerCalFactor(void) const
      {
         return GetFieldFLOAT32Value(11, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set power_cal_factor field
      // Units: %
      ///////////////////////////////////////////////////////////////////////
      void SetPowerCalFactor(FIT_FLOAT32 powerCalFactor)
      {
         SetFieldFLOAT32Value(11, powerCalFactor, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns auto_wheel_cal field
      ///////////////////////////////////////////////////////////////////////
      FIT_BOOL GetAutoWheelCal(void) const
      {
         return GetFieldENUMValue(12, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set auto_wheel_cal field
      ///////////////////////////////////////////////////////////////////////
      void SetAutoWheelCal(FIT_BOOL autoWheelCal)
      {
         SetFieldENUMValue(12, autoWheelCal, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns auto_power_zero field
      ///////////////////////////////////////////////////////////////////////
      FIT_BOOL GetAutoPowerZero(void) const
      {
         return GetFieldENUMValue(13, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set auto_power_zero field
      ///////////////////////////////////////////////////////////////////////
      void SetAutoPowerZero(FIT_BOOL autoPowerZero)
      {
         SetFieldENUMValue(13, autoPowerZero, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns id field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8 GetId(void) const
      {
         return GetFieldUINT8Value(14, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set id field
      ///////////////////////////////////////////////////////////////////////
      void SetId(FIT_UINT8 id)
      {
         SetFieldUINT8Value(14, id, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns spd_enabled field
      ///////////////////////////////////////////////////////////////////////
      FIT_BOOL GetSpdEnabled(void) const
      {
         return GetFieldENUMValue(15, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set spd_enabled field
      ///////////////////////////////////////////////////////////////////////
      void SetSpdEnabled(FIT_BOOL spdEnabled)
      {
         SetFieldENUMValue(15, spdEnabled, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns cad_enabled field
      ///////////////////////////////////////////////////////////////////////
      FIT_BOOL GetCadEnabled(void) const
      {
         return GetFieldENUMValue(16, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set cad_enabled field
      ///////////////////////////////////////////////////////////////////////
      void SetCadEnabled(FIT_BOOL cadEnabled)
      {
         SetFieldENUMValue(16, cadEnabled, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns spdcad_enabled field
      ///////////////////////////////////////////////////////////////////////
      FIT_BOOL GetSpdcadEnabled(void) const
      {
         return GetFieldENUMValue(17, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set spdcad_enabled field
      ///////////////////////////////////////////////////////////////////////
      void SetSpdcadEnabled(FIT_BOOL spdcadEnabled)
      {
         SetFieldENUMValue(17, spdcadEnabled, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns power_enabled field
      ///////////////////////////////////////////////////////////////////////
      FIT_BOOL GetPowerEnabled(void) const
      {
         return GetFieldENUMValue(18, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set power_enabled field
      ///////////////////////////////////////////////////////////////////////
      void SetPowerEnabled(FIT_BOOL powerEnabled)
      {
         SetFieldENUMValue(18, powerEnabled, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns crank_length field
      // Units: mm
      ///////////////////////////////////////////////////////////////////////
      FIT_FLOAT32 GetCrankLength(void) const
      {
         return GetFieldFLOAT32Value(19, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set crank_length field
      // Units: mm
      ///////////////////////////////////////////////////////////////////////
      void SetCrankLength(FIT_FLOAT32 crankLength)
      {
         SetFieldFLOAT32Value(19, crankLength, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns enabled field
      ///////////////////////////////////////////////////////////////////////
      FIT_BOOL GetEnabled(void) const
      {
         return GetFieldENUMValue(20, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set enabled field
      ///////////////////////////////////////////////////////////////////////
      void SetEnabled(FIT_BOOL enabled)
      {
         SetFieldENUMValue(20, enabled, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns bike_spd_ant_id_trans_type field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8Z GetBikeSpdAntIdTransType(void) const
      {
         return GetFieldUINT8ZValue(21, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set bike_spd_ant_id_trans_type field
      ///////////////////////////////////////////////////////////////////////
      void SetBikeSpdAntIdTransType(FIT_UINT8Z bikeSpdAntIdTransType)
      {
         SetFieldUINT8ZValue(21, bikeSpdAntIdTransType, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns bike_cad_ant_id_trans_type field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8Z GetBikeCadAntIdTransType(void) const
      {
         return GetFieldUINT8ZValue(22, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set bike_cad_ant_id_trans_type field
      ///////////////////////////////////////////////////////////////////////
      void SetBikeCadAntIdTransType(FIT_UINT8Z bikeCadAntIdTransType)
      {
         SetFieldUINT8ZValue(22, bikeCadAntIdTransType, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns bike_spdcad_ant_id_trans_type field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8Z GetBikeSpdcadAntIdTransType(void) const
      {
         return GetFieldUINT8ZValue(23, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set bike_spdcad_ant_id_trans_type field
      ///////////////////////////////////////////////////////////////////////
      void SetBikeSpdcadAntIdTransType(FIT_UINT8Z bikeSpdcadAntIdTransType)
      {
         SetFieldUINT8ZValue(23, bikeSpdcadAntIdTransType, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns bike_power_ant_id_trans_type field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8Z GetBikePowerAntIdTransType(void) const
      {
         return GetFieldUINT8ZValue(24, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set bike_power_ant_id_trans_type field
      ///////////////////////////////////////////////////////////////////////
      void SetBikePowerAntIdTransType(FIT_UINT8Z bikePowerAntIdTransType)
      {
         SetFieldUINT8ZValue(24, bikePowerAntIdTransType, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns odometer_rollover field
      // Comment: Rollover counter that can be used to extend the odometer
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8 GetOdometerRollover(void) const
      {
         return GetFieldUINT8Value(37, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set odometer_rollover field
      // Comment: Rollover counter that can be used to extend the odometer
      ///////////////////////////////////////////////////////////////////////
      void SetOdometerRollover(FIT_UINT8 odometerRollover)
      {
         SetFieldUINT8Value(37, odometerRollover, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns front_gear_num field
      // Comment: Number of front gears
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8Z GetFrontGearNum(void) const
      {
         return GetFieldUINT8ZValue(38, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set front_gear_num field
      // Comment: Number of front gears
      ///////////////////////////////////////////////////////////////////////
      void SetFrontGearNum(FIT_UINT8Z frontGearNum)
      {
         SetFieldUINT8ZValue(38, frontGearNum, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns number of front_gear
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8 GetNumFrontGear(void) const
      {
         return GetFieldNumValues(39, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns front_gear field
      // Comment: Number of teeth on each gear 0 is innermost
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8Z GetFrontGear(FIT_UINT8 index) const
      {
         return GetFieldUINT8ZValue(39, index, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set front_gear field
      // Comment: Number of teeth on each gear 0 is innermost
      ///////////////////////////////////////////////////////////////////////
      void SetFrontGear(FIT_UINT8 index, FIT_UINT8Z frontGear)
      {
         SetFieldUINT8ZValue(39, frontGear, index, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns rear_gear_num field
      // Comment: Number of rear gears
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8Z GetRearGearNum(void) const
      {
         return GetFieldUINT8ZValue(40, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set rear_gear_num field
      // Comment: Number of rear gears
      ///////////////////////////////////////////////////////////////////////
      void SetRearGearNum(FIT_UINT8Z rearGearNum)
      {
         SetFieldUINT8ZValue(40, rearGearNum, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns number of rear_gear
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8 GetNumRearGear(void) const
      {
         return GetFieldNumValues(41, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns rear_gear field
      // Comment: Number of teeth on each gear 0 is innermost
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8Z GetRearGear(FIT_UINT8 index) const
      {
         return GetFieldUINT8ZValue(41, index, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set rear_gear field
      // Comment: Number of teeth on each gear 0 is innermost
      ///////////////////////////////////////////////////////////////////////
      void SetRearGear(FIT_UINT8 index, FIT_UINT8Z rearGear)
      {
         SetFieldUINT8ZValue(41, rearGear, index, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

};

} // namespace fit

#endif // !defined(FIT_BIKE_PROFILE_MESG_HPP)
