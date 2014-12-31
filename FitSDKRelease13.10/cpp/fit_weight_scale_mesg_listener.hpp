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


#if !defined(FIT_WEIGHT_SCALE_MESG_LISTENER_HPP)
#define FIT_WEIGHT_SCALE_MESG_LISTENER_HPP

#include "fit_weight_scale_mesg.hpp"

namespace fit
{

class WeightScaleMesgListener
{
   public:
      virtual ~WeightScaleMesgListener() {}
      virtual void OnMesg(WeightScaleMesg& mesg) = 0;
};

} // namespace fit

#endif // !defined(FIT_WEIGHT_SCALE_MESG_LISTENER_HPP)
