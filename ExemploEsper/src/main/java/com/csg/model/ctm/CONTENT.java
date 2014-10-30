package com.csg.model.ctm;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CONTENT")
public class CONTENT {
	private ACCOUNTS[] ACCOUNTS;

	private SOFTWARES[] SOFTWARES;

	private STORAGES[] STORAGES;

	private HARDWARE HARDWARE;

	private INPUTS INPUTS;

	private SERVICES[] SERVICES;

	private MEMORIES[] MEMORIES;

	private BIOS BIOS;

	private OFFICEPACK OFFICEPACK;

	private ENVIRONMENTS[] ENVIRONMENTS;

	private NETWORKS[] NETWORKS;

	public ACCOUNTS[] getACCOUNTS() {
		return ACCOUNTS;
	}
	
	

	@Override
	public String toString() {
		return "CONTENT [ACCOUNTS=" + Arrays.toString(ACCOUNTS)
				+ ", SOFTWARES=" + Arrays.toString(SOFTWARES) + ", STORAGES="
				+ Arrays.toString(STORAGES) + ", HARDWARE=" + HARDWARE
				+ ", INPUTS=" + INPUTS + ", SERVICES="
				+ Arrays.toString(SERVICES) + ", MEMORIES="
				+ Arrays.toString(MEMORIES) + ", BIOS=" + BIOS
				+ ", OFFICEPACK=" + OFFICEPACK + ", ENVIRONMENTS="
				+ Arrays.toString(ENVIRONMENTS) + ", NETWORKS="
				+ Arrays.toString(NETWORKS) + "]";
	}



	@XmlElement
	public void setACCOUNTS(ACCOUNTS[] ACCOUNTS) {
		this.ACCOUNTS = ACCOUNTS;
	}

	public SOFTWARES[] getSOFTWARES() {
		return SOFTWARES;
	}

	@XmlElement
	public void setSOFTWARES(SOFTWARES[] SOFTWARES) {
		this.SOFTWARES = SOFTWARES;
	}

	public STORAGES[] getSTORAGES() {
		return STORAGES;
	}

	@XmlElement
	public void setSTORAGES(STORAGES[] STORAGES) {
		this.STORAGES = STORAGES;
	}

	public HARDWARE getHARDWARE() {
		return HARDWARE;
	}

	@XmlElement
	public void setHARDWARE(HARDWARE HARDWARE) {
		this.HARDWARE = HARDWARE;
	}

	public INPUTS getINPUTS() {
		return INPUTS;
	}

	@XmlElement
	public void setINPUTS(INPUTS INPUTS) {
		this.INPUTS = INPUTS;
	}

	public SERVICES[] getSERVICES() {
		return SERVICES;
	}

	@XmlElement
	public void setSERVICES(SERVICES[] SERVICES) {
		this.SERVICES = SERVICES;
	}

	public MEMORIES[] getMEMORIES() {
		return MEMORIES;
	}

	@XmlElement
	public void setMEMORIES(MEMORIES[] MEMORIES) {
		this.MEMORIES = MEMORIES;
	}

	public BIOS getBIOS() {
		return BIOS;
	}

	@XmlElement
	public void setBIOS(BIOS BIOS) {
		this.BIOS = BIOS;
	}

	public OFFICEPACK getOFFICEPACK() {
		return OFFICEPACK;
	}

	@XmlElement
	public void setOFFICEPACK(OFFICEPACK OFFICEPACK) {
		this.OFFICEPACK = OFFICEPACK;
	}

	public ENVIRONMENTS[] getENVIRONMENTS() {
		return ENVIRONMENTS;
	}

	@XmlElement
	public void setENVIRONMENTS(ENVIRONMENTS[] ENVIRONMENTS) {
		this.ENVIRONMENTS = ENVIRONMENTS;
	}

	public NETWORKS[] getNETWORKS() {
		return NETWORKS;
	}

	@XmlElement
	public void setNETWORKS(NETWORKS[] NETWORKS) {
		this.NETWORKS = NETWORKS;
	}
}
