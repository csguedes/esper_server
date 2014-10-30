package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "REQUEST")
public class REQUEST {
	private CONTENT CONTENT;

	public CONTENT getCONTENT() {
		return CONTENT;
	}

	@XmlElement
	public void setCONTENT(CONTENT CONTENT) {
		this.CONTENT = CONTENT;
	}

	@Override
	public String toString() {
		return "REQUEST [CONTENT=" + CONTENT + ", getCONTENT()=" + getCONTENT().toString()
				+ "]";
	}
	
	
	
}
