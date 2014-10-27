package com.csg.model.ctm;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NETWORKS")
public class NETWORKS {
	private String DHCPENABLED;

	private String[] DESCRIPTION;

	private String DNSDOMAIN;

	private String SPEED;

	private String IPMASK;

	private String STATUS;

	private String AVAL;

	private String DNSHOSTNAME;

	private String MACADDR;

	private String IPDHCP;

	private String SYSTEMNAME;

	private String ProductName;

	private String IPADDRESS;

	private String TYPE;
	
	
	

	@Override
	public String toString() {
		return "NETWORKS [DHCPENABLED=" + DHCPENABLED + ", DESCRIPTION="
				+ Arrays.toString(DESCRIPTION) + ", DNSDOMAIN=" + DNSDOMAIN
				+ ", SPEED=" + SPEED + ", IPMASK=" + IPMASK + ", STATUS="
				+ STATUS + ", AVAL=" + AVAL + ", DNSHOSTNAME=" + DNSHOSTNAME
				+ ", MACADDR=" + MACADDR + ", IPDHCP=" + IPDHCP
				+ ", SYSTEMNAME=" + SYSTEMNAME + ", ProductName=" + ProductName
				+ ", IPADDRESS=" + IPADDRESS + ", TYPE=" + TYPE + "]";
	}

	public String getDHCPENABLED() {
		return DHCPENABLED;
	}

	@XmlElement
	public void setDHCPENABLED(String DHCPENABLED) {
		this.DHCPENABLED = DHCPENABLED;
	}

	public String[] getDESCRIPTION() {
		return DESCRIPTION;
	}

	@XmlElement
	public void setDESCRIPTION(String[] DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}

	public String getDNSDOMAIN() {
		return DNSDOMAIN;
	}

	@XmlElement
	public void setDNSDOMAIN(String DNSDOMAIN) {
		this.DNSDOMAIN = DNSDOMAIN;
	}

	public String getSPEED() {
		return SPEED;
	}

	@XmlElement
	public void setSPEED(String SPEED) {
		this.SPEED = SPEED;
	}

	public String getIPMASK() {
		return IPMASK;
	}

	@XmlElement
	public void setIPMASK(String IPMASK) {
		this.IPMASK = IPMASK;
	}

	public String getSTATUS() {
		return STATUS;
	}

	@XmlElement
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}

	public String getAVAL() {
		return AVAL;
	}

	@XmlElement
	public void setAVAL(String AVAL) {
		this.AVAL = AVAL;
	}

	public String getDNSHOSTNAME() {
		return DNSHOSTNAME;
	}

	@XmlElement
	public void setDNSHOSTNAME(String DNSHOSTNAME) {
		this.DNSHOSTNAME = DNSHOSTNAME;
	}

	public String getMACADDR() {
		return MACADDR;
	}

	@XmlElement
	public void setMACADDR(String MACADDR) {
		this.MACADDR = MACADDR;
	}

	public String getIPDHCP() {
		return IPDHCP;
	}

	@XmlElement
	public void setIPDHCP(String IPDHCP) {
		this.IPDHCP = IPDHCP;
	}

	public String getSYSTEMNAME() {
		return SYSTEMNAME;
	}

	@XmlElement
	public void setSYSTEMNAME(String SYSTEMNAME) {
		this.SYSTEMNAME = SYSTEMNAME;
	}

	public String getProductName() {
		return ProductName;
	}

	@XmlElement
	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}

	public String getIPADDRESS() {
		return IPADDRESS;
	}

	@XmlElement
	public void setIPADDRESS(String IPADDRESS) {
		this.IPADDRESS = IPADDRESS;
	}

	public String getTYPE() {
		return TYPE;
	}

	@XmlElement
	public void setTYPE(String TYPE) {
		this.TYPE = TYPE;
	}
}
