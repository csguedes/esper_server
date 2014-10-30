package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BIOS")
public class BIOS {
	private String SMODEL;

	private String SSN;

	private String SMANUFACTURER;

	private String TYPE;

	
	
	@Override
	public String toString() {
		return "BIOS [SMODEL=" + SMODEL + ", SSN=" + SSN + ", SMANUFACTURER="
				+ SMANUFACTURER + ", TYPE=" + TYPE + "]";
	}

	public String getSMODEL() {
		return SMODEL;
	}

	@XmlElement
	public void setSMODEL(String SMODEL) {
		this.SMODEL = SMODEL;
	}

	public String getSSN() {
		return SSN;
	}

	@XmlElement
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}

	public String getSMANUFACTURER() {
		return SMANUFACTURER;
	}

	@XmlElement
	public void setSMANUFACTURER(String SMANUFACTURER) {
		this.SMANUFACTURER = SMANUFACTURER;
	}

	public String getTYPE() {
		return TYPE;
	}

	@XmlElement
	public void setTYPE(String TYPE) {
		this.TYPE = TYPE;
	}
}
