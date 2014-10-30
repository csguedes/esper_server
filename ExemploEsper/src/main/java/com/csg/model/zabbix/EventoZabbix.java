package com.csg.model.zabbix;

import javax.xml.bind.annotation.XmlRootElement;

import com.csg.model.EventoBasico;

@XmlRootElement(name="EventoZabbix")
public class EventoZabbix extends EventoBasico {

	public EventoZabbix() {
		super();
	}

}
