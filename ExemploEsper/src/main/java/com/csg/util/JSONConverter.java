package com.csg.util;

import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Converter JSON utilizando Jackson
 * 
 * @created 23/07/2014
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
public final class JSONConverter {

	private JSONConverter() {
	}

	private static final ObjectMapper objectMapper = new ObjectMapper();

	static {
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	public static <T> T fromJson(final String json, final Class<T> clazz) {
		try {
			return objectMapper.readValue(json, clazz);
		} catch (final IOException e) {
			throw new IllegalArgumentException("Erro ao fazer o parse do json " + json, e);
		}
	}

	public static String toJson(final Object object) {
		try {
			return objectMapper.writeValueAsString(object);
		} catch (final IOException e) {
			throw new IllegalArgumentException("Erro ao fazer o parse do objeto" + object, e);
		}
	}

}

