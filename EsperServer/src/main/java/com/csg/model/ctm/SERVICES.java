package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SERVICES")
public class SERVICES {
	private String STARTNAME;

	private String DISPLAYNAME;

	private String NAME;

	private String DESCRIPTION;

	private String CAPTION;

	private String PATHNAME;

	private String SERVICETYPE;

	private String STARTMODE;

	private String STATUS;

	
	
	@Override
	public String toString() {
		return "SERVICES [STARTNAME=" + STARTNAME + ", DISPLAYNAME="
				+ DISPLAYNAME + ", NAME=" + NAME + ", DESCRIPTION="
				+ DESCRIPTION + ", CAPTION=" + CAPTION + ", PATHNAME="
				+ PATHNAME + ", SERVICETYPE=" + SERVICETYPE + ", STARTMODE="
				+ STARTMODE + ", STATUS=" + STATUS + "]";
	}

	public String getSTARTNAME() {
		return STARTNAME;
	}

	@XmlElement
	public void setSTARTNAME(String STARTNAME) {
		this.STARTNAME = STARTNAME;
	}

	public String getDISPLAYNAME() {
		return DISPLAYNAME;
	}

	@XmlElement
	public void setDISPLAYNAME(String DISPLAYNAME) {
		this.DISPLAYNAME = DISPLAYNAME;
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

	public String getPATHNAME() {
		return PATHNAME;
	}

	@XmlElement
	public void setPATHNAME(String PATHNAME) {
		this.PATHNAME = PATHNAME;
	}

	public String getSERVICETYPE() {
		return SERVICETYPE;
	}

	@XmlElement
	public void setSERVICETYPE(String SERVICETYPE) {
		this.SERVICETYPE = SERVICETYPE;
	}

	public String getSTARTMODE() {
		return STARTMODE;
	}

	@XmlElement
	public void setSTARTMODE(String STARTMODE) {
		this.STARTMODE = STARTMODE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	@XmlElement
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}
}
