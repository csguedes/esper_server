package com.csg.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class JaxbUtils<T> {

	private Class<T> classeGenerica;
	private Object objetoGenerico;

	public JaxbUtils(Class<T> classeGenerica) throws InstantiationException,
			IllegalAccessException {
		this.classeGenerica = classeGenerica;
		this.objetoGenerico = classeGenerica.newInstance();
	}

	public T xmlToObject(String xml) throws Exception {

		JAXBContext jc = JAXBContext.newInstance(objetoGenerico.getClass());
		Unmarshaller u = jc.createUnmarshaller();
		// u.setProperty( Marshaller.JAXB_ENCODING, "ISO-8859-1" );
		InputStream is = new ByteArrayInputStream(xml.getBytes());
		T eventoBasico = (T) u.unmarshal(is);

		return eventoBasico;
	}

}
