package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MEMORIES")
public class MEMORIES {
	private String BANKLABEL;

	private String MODEL;

	private String SERIALNUMBER;

	private String DESCRIPTION;

	private String CAPTION;

	private String CAPACITY;

	private String OTHERINFO;

	private String SPEED;

	private String MANUFACTURER;

	private String DEVICELOCATOR;

	private String TYPE;
	
	

	@Override
	public String toString() {
		return "MEMORIES [BANKLABEL=" + BANKLABEL + ", MODEL=" + MODEL
				+ ", SERIALNUMBER=" + SERIALNUMBER + ", DESCRIPTION="
				+ DESCRIPTION + ", CAPTION=" + CAPTION + ", CAPACITY="
				+ CAPACITY + ", OTHERINFO=" + OTHERINFO + ", SPEED=" + SPEED
				+ ", MANUFACTURER=" + MANUFACTURER + ", DEVICELOCATOR="
				+ DEVICELOCATOR + ", TYPE=" + TYPE + "]";
	}

	public String getBANKLABEL() {
		return BANKLABEL;
	}

	@XmlElement
	public void setBANKLABEL(String BANKLABEL) {
		this.BANKLABEL = BANKLABEL;
	}

	public String getMODEL() {
		return MODEL;
	}

	@XmlElement
	public void setMODEL(String MODEL) {
		this.MODEL = MODEL;
	}

	public String getSERIALNUMBER() {
		return SERIALNUMBER;
	}

	@XmlElement
	public void setSERIALNUMBER(String SERIALNUMBER) {
		this.SERIALNUMBER = SERIALNUMBER;
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

	public String getCAPACITY() {
		return CAPACITY;
	}

	@XmlElement
	public void setCAPACITY(String CAPACITY) {
		this.CAPACITY = CAPACITY;
	}

	public String getOTHERINFO() {
		return OTHERINFO;
	}

	@XmlElement
	public void setOTHERINFO(String OTHERINFO) {
		this.OTHERINFO = OTHERINFO;
	}

	public String getSPEED() {
		return SPEED;
	}

	@XmlElement
	public void setSPEED(String SPEED) {
		this.SPEED = SPEED;
	}

	public String getMANUFACTURER() {
		return MANUFACTURER;
	}

	@XmlElement
	public void setMANUFACTURER(String MANUFACTURER) {
		this.MANUFACTURER = MANUFACTURER;
	}

	public String getDEVICELOCATOR() {
		return DEVICELOCATOR;
	}

	@XmlElement
	public void setDEVICELOCATOR(String DEVICELOCATOR) {
		this.DEVICELOCATOR = DEVICELOCATOR;
	}

	public String getTYPE() {
		return TYPE;
	}

	@XmlElement
	public void setTYPE(String TYPE) {
		this.TYPE = TYPE;
	}
}