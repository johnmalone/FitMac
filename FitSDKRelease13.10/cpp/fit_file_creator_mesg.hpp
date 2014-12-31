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


#if !defined(FIT_FILE_CREATOR_MESG_HPP)
#define FIT_FILE_CREATOR_MESG_HPP

#include "fit_mesg.hpp"

namespace fit
{

class FileCreatorMesg : public Mesg
{
   public:
      FileCreatorMesg(void) : Mesg(Profile::MESG_FILE_CREATOR)
      {
      }

      FileCreatorMesg(const Mesg &mesg) : Mesg(mesg)
      {
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns software_version field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT16 GetSoftwareVersion(void) const
      {
         return GetFieldUINT16Value(0, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set software_version field
      ///////////////////////////////////////////////////////////////////////
      void SetSoftwareVersion(FIT_UINT16 softwareVersion)
      {
         SetFieldUINT16Value(0, softwareVersion, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Returns hardware_version field
      ///////////////////////////////////////////////////////////////////////
      FIT_UINT8 GetHardwareVersion(void) const
      {
         return GetFieldUINT8Value(1, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

      ///////////////////////////////////////////////////////////////////////
      // Set hardware_version field
      ///////////////////////////////////////////////////////////////////////
      void SetHardwareVersion(FIT_UINT8 hardwareVersion)
      {
         SetFieldUINT8Value(1, hardwareVersion, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
      }

};

} // namespace fit

#endif // !defined(FIT_FILE_CREATOR_MESG_HPP)
