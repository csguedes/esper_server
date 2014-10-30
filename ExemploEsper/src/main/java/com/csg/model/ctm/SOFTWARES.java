package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SOFTWARES")
public class SOFTWARES {
	private String NAME;

	private String GUID;

	private String VERSION;

	private String PUBLISHER;

	private String FOLDER;

	private String VENDOR;
	
	

	@Override
	public String toString() {
		return "SOFTWARES [NAME=" + NAME + ", GUID=" + GUID + ", VERSION="
				+ VERSION + ", PUBLISHER=" + PUBLISHER + ", FOLDER=" + FOLDER
				+ ", VENDOR=" + VENDOR + "]";
	}

	public String getNAME() {
		return NAME;
	}

	@XmlElement
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getGUID() {
		return GUID;
	}

	@XmlElement
	public void setGUID(String GUID) {
		this.GUID = GUID;
	}

	public String getVERSION() {
		return VERSION;
	}

	@XmlElement
	public void setVERSION(String VERSION) {
		this.VERSION = VERSION;
	}

	public String getPUBLISHER() {
		return PUBLISHER;
	}

	@XmlElement
	public void setPUBLISHER(String PUBLISHER) {
		this.PUBLISHER = PUBLISHER;
	}

	public String getFOLDER() {
		return FOLDER;
	}

	@XmlElement
	public void setFOLDER(String FOLDER) {
		this.FOLDER = FOLDER;
	}

	public String getVENDOR() {
		return VENDOR;
	}

	@XmlElement
	public void setVENDOR(String VENDOR) {
		this.VENDOR = VENDOR;
	}
}
