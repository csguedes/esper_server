package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "INPUTS")
public class INPUTS {
	private String DEVICEID;

	private String NAME;

	private String DESCRIPTION;

	private String CAPTION;

	private String LAYOUT;

	private String TYPE;
	
	

	@Override
	public String toString() {
		return "INPUTS [DEVICEID=" + DEVICEID + ", NAME=" + NAME
				+ ", DESCRIPTION=" + DESCRIPTION + ", CAPTION=" + CAPTION
				+ ", LAYOUT=" + LAYOUT + ", TYPE=" + TYPE + "]";
	}

	public String getDEVICEID() {
		return DEVICEID;
	}

	@XmlElement
	public void setDEVICEID(String DEVICEID) {
		this.DEVICEID = DEVICEID;
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

	public String getLAYOUT() {
		return LAYOUT;
	}

	@XmlElement
	public void setLAYOUT(String LAYOUT) {
		this.LAYOUT = LAYOUT;
	}

	public String getTYPE() {
		return TYPE;
	}

	@XmlElement
	public void setTYPE(String TYPE) {
		this.TYPE = TYPE;
	}
}
