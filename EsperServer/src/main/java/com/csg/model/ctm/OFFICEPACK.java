package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OFFICEPACK")
public class OFFICEPACK {
	private String GUID;

	private String OFFICEVERSION;

	private String INSTALL;

	private String NOTE;

	private String PRODUCT;

	private String PRODUCTID;

	private String TYPE;

	private String OFFICEKEY;

	
	
	@Override
	public String toString() {
		return "OFFICEPACK [GUID=" + GUID + ", OFFICEVERSION=" + OFFICEVERSION
				+ ", INSTALL=" + INSTALL + ", NOTE=" + NOTE + ", PRODUCT="
				+ PRODUCT + ", PRODUCTID=" + PRODUCTID + ", TYPE=" + TYPE
				+ ", OFFICEKEY=" + OFFICEKEY + "]";
	}

	public String getGUID() {
		return GUID;
	}

	@XmlElement
	public void setGUID(String GUID) {
		this.GUID = GUID;
	}

	public String getOFFICEVERSION() {
		return OFFICEVERSION;
	}

	@XmlElement
	public void setOFFICEVERSION(String OFFICEVERSION) {
		this.OFFICEVERSION = OFFICEVERSION;
	}

	public String getINSTALL() {
		return INSTALL;
	}

	@XmlElement
	public void setINSTALL(String INSTALL) {
		this.INSTALL = INSTALL;
	}

	public String getNOTE() {
		return NOTE;
	}

	@XmlElement
	public void setNOTE(String NOTE) {
		this.NOTE = NOTE;
	}

	public String getPRODUCT() {
		return PRODUCT;
	}

	@XmlElement
	public void setPRODUCT(String PRODUCT) {
		this.PRODUCT = PRODUCT;
	}

	public String getPRODUCTID() {
		return PRODUCTID;
	}

	@XmlElement
	public void setPRODUCTID(String PRODUCTID) {
		this.PRODUCTID = PRODUCTID;
	}

	public String getTYPE() {
		return TYPE;
	}

	@XmlElement
	public void setTYPE(String TYPE) {
		this.TYPE = TYPE;
	}

	public String getOFFICEKEY() {
		return OFFICEKEY;
	}

	@XmlElement
	public void setOFFICEKEY(String OFFICEKEY) {
		this.OFFICEKEY = OFFICEKEY;
	}
}