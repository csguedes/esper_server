package com.csg.util;

public enum TipoRetorno {
	XML("Retorno XML."),
	JSON("Retorno JSON"),
	POJO("Retorno POJO");

	String label;
	
	TipoRetorno(String label) {
		this.label=label;
	}
	
	public String getLabel() {
		return label;
	}
}
