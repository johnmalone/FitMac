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


public class SlaveDeviceMesg extends Mesg {

   protected static final	Mesg slaveDeviceMesg;
   static {            
      int field_index = 0;
      int subfield_index = 0;         
      // slave_device   
      slaveDeviceMesg = new Mesg("slave_device", MesgNum.SLAVE_DEVICE);
      slaveDeviceMesg.addField(new Field("manufacturer", 0, 132, 1, 0, "", false));
      field_index++;
      slaveDeviceMesg.addField(new Field("product", 1, 132, 1, 0, "", false));
      subfield_index = 0;
      slaveDeviceMesg.fields.get(field_index).subFields.add(new SubField("garmin_product", 132, 1, 0, ""));
      slaveDeviceMesg.fields.get(field_index).subFields.get(subfield_index).addMap(0, 1);
      slaveDeviceMesg.fields.get(field_index).subFields.get(subfield_index).addMap(0, 15);
      slaveDeviceMesg.fields.get(field_index).subFields.get(subfield_index).addMap(0, 13);
      subfield_index++;
      field_index++;
   }

   public SlaveDeviceMesg() {
      super(Factory.createMesg(MesgNum.SLAVE_DEVICE));
   }

   public SlaveDeviceMesg(final Mesg mesg) {
      super(mesg);
   }


   /**
    * Get manufacturer field
    *
    * @return manufacturer
    */
   public Integer getManufacturer() {
      return getFieldIntegerValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set manufacturer field
    *
    * @param manufacturer
    */
   public void setManufacturer(Integer manufacturer) {
      setFieldValue(0, 0, manufacturer, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get product field
    *
    * @return product
    */
   public Integer getProduct() {
      return getFieldIntegerValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Set product field
    *
    * @param product
    */
   public void setProduct(Integer product) {
      setFieldValue(1, 0, product, Fit.SUBFIELD_INDEX_MAIN_FIELD);
   }

   /**
    * Get garmin_product field
    *
    * @return garmin_product
    */
   public Integer getGarminProduct() {
      return getFieldIntegerValue(1, 0, Profile.SubFields.SLAVE_DEVICE_MESG_PRODUCT_FIELD_GARMIN_PRODUCT);
   }

   /**
    * Set garmin_product field
    *
    * @param garminProduct
    */
   public void setGarminProduct(Integer garminProduct) {
      setFieldValue(1, 0, garminProduct, Profile.SubFields.SLAVE_DEVICE_MESG_PRODUCT_FIELD_GARMIN_PRODUCT);
   }

}
