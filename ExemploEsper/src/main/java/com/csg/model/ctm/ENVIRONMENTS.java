package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ENVIRONMENTS")
public class ENVIRONMENTS {
	private String NAME;

	private String DESCRIPTION;

	private String CAPTION;

	private String USERNAME;

	private String VARIABLEVALUE;

	private String STATUS;

	private String SYSTEMVARIABLE;
	
	

	@Override
	public String toString() {
		return "ENVIRONMENTS [NAME=" + NAME + ", DESCRIPTION=" + DESCRIPTION
				+ ", CAPTION=" + CAPTION + ", USERNAME=" + USERNAME
				+ ", VARIABLEVALUE=" + VARIABLEVALUE + ", STATUS=" + STATUS
				+ ", SYSTEMVARIABLE=" + SYSTEMVARIABLE + "]";
	}

	public String getNAME() {
		return NAME;
	}

	@XmlElement
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	@XmlElement
	public void setDESCRIPTION(String DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}

	public String getCAPTION() {
		return CAPTION;
	}

	@XmlElement
	public void setCAPTION(String CAPTION) {
		this.CAPTION = CAPTION;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	@XmlElement
	public void setUSERNAME(String USERNAME) {
		this.USERNAME = USERNAME;
	}

	public String getVARIABLEVALUE() {
		return VARIABLEVALUE;
	}

	@XmlElement
	public void setVARIABLEVALUE(String VARIABLEVALUE) {
		this.VARIABLEVALUE = VARIABLEVALUE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	@XmlElement
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}

	public String getSYSTEMVARIABLE() {
		return SYSTEMVARIABLE;
	}

	@XmlElement
	public void setSYSTEMVARIABLE(String SYSTEMVARIABLE) {
		this.SYSTEMVARIABLE = SYSTEMVARIABLE;
	}
}
