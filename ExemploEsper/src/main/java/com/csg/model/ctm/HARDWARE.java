package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HARDWARE")
public class HARDWARE {
	private String PROCESSORT;

	private String NAME;

	private String OSNAME;

	private String SYSTEMDIRECTORY;

	private String DOMAINROLE;

	private String WORKGROUP;

	private String IPADDR;

	private String DESCDOMAINROLE;

	private String LASTBOOT;

	private String OSVERSION;

	private String OSCOMMENTS;

	private String MEMORY;

	private String PROCESSORN;

	private String USERID;
	
	
	

	@Override
	public String toString() {
		return "HARDWARE [PROCESSORT=" + PROCESSORT + ", NAME=" + NAME
				+ ", OSNAME=" + OSNAME + ", SYSTEMDIRECTORY=" + SYSTEMDIRECTORY
				+ ", DOMAINROLE=" + DOMAINROLE + ", WORKGROUP=" + WORKGROUP
				+ ", IPADDR=" + IPADDR + ", DESCDOMAINROLE=" + DESCDOMAINROLE
				+ ", LASTBOOT=" + LASTBOOT + ", OSVERSION=" + OSVERSION
				+ ", OSCOMMENTS=" + OSCOMMENTS + ", MEMORY=" + MEMORY
				+ ", PROCESSORN=" + PROCESSORN + ", USERID=" + USERID + "]";
	}

	public String getPROCESSORT() {
		return PROCESSORT;
	}

	@XmlElement
	public void setPROCESSORT(String PROCESSORT) {
		this.PROCESSORT = PROCESSORT;
	}

	public String getNAME() {
		return NAME;
	}

	@XmlElement
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getOSNAME() {
		return OSNAME;
	}

	@XmlElement
	public void setOSNAME(String OSNAME) {
		this.OSNAME = OSNAME;
	}

	public String getSYSTEMDIRECTORY() {
		return SYSTEMDIRECTORY;
	}

	@XmlElement
	public void setSYSTEMDIRECTORY(String SYSTEMDIRECTORY) {
		this.SYSTEMDIRECTORY = SYSTEMDIRECTORY;
	}

	public String getDOMAINROLE() {
		return DOMAINROLE;
	}

	@XmlElement
	public void setDOMAINROLE(String DOMAINROLE) {
		this.DOMAINROLE = DOMAINROLE;
	}

	public String getWORKGROUP() {
		return WORKGROUP;
	}

	@XmlElement
	public void setWORKGROUP(String WORKGROUP) {
		this.WORKGROUP = WORKGROUP;
	}

	public String getIPADDR() {
		return IPADDR;
	}

	@XmlElement
	public void setIPADDR(String IPADDR) {
		this.IPADDR = IPADDR;
	}

	public String getDESCDOMAINROLE() {
		return DESCDOMAINROLE;
	}

	@XmlElement
	public void setDESCDOMAINROLE(String DESCDOMAINROLE) {
		this.DESCDOMAINROLE = DESCDOMAINROLE;
	}

	public String getLASTBOOT() {
		return LASTBOOT;
	}

	@XmlElement
	public void setLASTBOOT(String LASTBOOT) {
		this.LASTBOOT = LASTBOOT;
	}

	public String getOSVERSION() {
		return OSVERSION;
	}

	@XmlElement
	public void setOSVERSION(String OSVERSION) {
		this.OSVERSION = OSVERSION;
	}

	public String getOSCOMMENTS() {
		return OSCOMMENTS;
	}

	@XmlElement
	public void setOSCOMMENTS(String OSCOMMENTS) {
		this.OSCOMMENTS = OSCOMMENTS;
	}

	public String getMEMORY() {
		return MEMORY;
	}

	@XmlElement
	public void setMEMORY(String MEMORY) {
		this.MEMORY = MEMORY;
	}

	public String getPROCESSORN() {
		return PROCESSORN;
	}

	@XmlElement
	public void setPROCESSORN(String PROCESSORN) {
		this.PROCESSORN = PROCESSORN;
	}

	public String getUSERID() {
		return USERID;
	}

	@XmlElement
	public void setUSERID(String USERID) {
		this.USERID = USERID;
	}
}
