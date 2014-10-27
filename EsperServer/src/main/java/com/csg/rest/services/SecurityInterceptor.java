package com.csg.rest.services;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.Headers;
import org.jboss.resteasy.core.ResourceMethod;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.specimpl.UriInfoImpl;
import org.jboss.resteasy.spi.Failure;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.interception.PreProcessInterceptor;

import com.csg.util.EsperSingleton;

@Provider
@ServerInterceptor
public class SecurityInterceptor implements PreProcessInterceptor
//		,AcceptedByMethod
		{

//	@SuppressWarnings("rawtypes")
//	public boolean accept(Class c, Method m) {
//		return m.getName().equals("receberXMLCTM");
//	}

	public ServerResponse preProcess(HttpRequest request, ResourceMethod method)
			throws Failure, WebApplicationException {
		ServerResponse response = null;

		final UriInfoImpl parameters =(UriInfoImpl) request.getUri();
		final MultivaluedMap<String, String> parametros = parameters.getQueryParameters();

		// TODO: Implementar pesquisa de usuário e senha no banco
		final String username = parametros.getFirst("username");
		final String password = parametros.getFirst("password");
		
		if ((username == null || username.isEmpty()) || (password == null || password.isEmpty())) {
			response = new ServerResponse("Para acessar este método você deve informar um nome de usuário e senha", 401, new Headers<Object>());
			EsperSingleton.resultado=response.toString();
		} else if (!(("citsmart".equals(username) && "centralit".equals(password)))) {
			response = new ServerResponse("Falha de autenticação", 403, new Headers<Object>());
			EsperSingleton.resultado=response.toString();
		}
		return response;
	}
}