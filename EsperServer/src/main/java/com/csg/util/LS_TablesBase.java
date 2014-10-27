package com.csg.util;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

public class LS_TablesBase {
	// get as signed int 32 - 4 byte ---------------------- int SIGNED
	protected int getAsInt(String value) throws NumberFormatException {
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			return -2202;
		}
	}

	// get as signed int 32 - 4 byte ---------------------- int SIGNED
	protected Date getAsTime(String value) throws NumberFormatException {
		if (value == null || value.isEmpty() || value.equals("")) {
			value = "0";
		}

		return new java.util.Date(Long.parseLong(value) * 1000);
	}

	// get as signed int 32 - 4 byte ---------------------- int SIGNED
	protected Timestamp getAsTimestamp(String value) throws NumberFormatException {
		if (value == null || value.isEmpty() || value.equals("")) {
			value = "0";
		}

		return new java.sql.Timestamp(Long.parseLong(value) * 1000);
	}

	// get as signed int 32 - 4 byte ---------------------- int SIGNED
	protected float getAsFloat(String value) throws NumberFormatException {
		if (value == null || value.isEmpty() || value.equals("")) {
			value = "-2202";
		}
		return Float.parseFloat(value);
	}

	// here is my method for "dynamically" setting each attribute
	public void set_attribute(String value, String fieldName, Class<?> cls) {

		try {
			Field fld = cls.getField(fieldName);
	//		System.out.println("Type = " + fld.getGenericType());
			switch (fld.getGenericType().toString()) {
			case "int":
				fld.set(this, getAsInt(value));
				break;
			case "class java.lang.Float":
				fld.set(this, getAsFloat(value));
				break;
			case "class java.util.Date":
				fld.set(this, getAsTime(value));
				break;
			case "class java.sql.Timestamp":
				fld.set(this, getAsTimestamp(value));
				break;

				
			default:
				fld.set(this, value);
				break;
			}

		} catch (Throwable e) {
			System.err.println(e);
		}
	}
	
	public void createObjects(){
		
	}
}