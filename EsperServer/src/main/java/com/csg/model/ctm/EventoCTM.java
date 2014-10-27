package com.csg.model.ctm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.csg.model.EventoBasico;

@XmlRootElement(name = "EventoCTM")
public class EventoCTM extends EventoBasico {

	public EventoCTM() {
		super();
	}

	private REQUEST REQUEST;

	public REQUEST getREQUEST() {
		return REQUEST;
	}

	@XmlElement
	public void setREQUEST(REQUEST REQUEST) {
		this.REQUEST = REQUEST;
	}

	@Override
	public String toString() {
		return "EventoCTM [REQUEST=" + REQUEST + ", getREQUEST()="
				+ getREQUEST().toString() + "]";
	}
	
	
	
	
}
