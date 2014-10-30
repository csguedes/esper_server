package com.csg.model.nagios;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.csg.model.EventoBasico;

@XmlRootElement(name="Nagios")
public class Nagios extends EventoBasico
{

	
	private Object host;

	public Object getHost() {
		return host;
	}

	@XmlElement
	public void setHost(Object host) {
		this.host = host;
	}

	

    
}
    
