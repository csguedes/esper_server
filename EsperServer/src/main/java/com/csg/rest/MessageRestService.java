package com.csg.rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.csg.model.EventoBasico;
import com.csg.model.ctm.EventoCTM;
import com.csg.model.legado.EventoLegado;
import com.csg.model.nagios.EventoNagios;
import com.csg.model.nagios.Hosts;
import com.csg.model.zabbix.EventoZabbix;
import com.csg.thread.WorkerCallable;
import com.csg.thread.WorkerCallable2;
import com.csg.thread.WorkerThread;
import com.csg.util.EsperSingleton;
import com.csg.util.JSONConverter;
import com.csg.util.JaxbUtils;
import com.csg.util.TipoRetorno;
import com.csg.util.XMLJSONUtils;

@Path("/send")
public class MessageRestService {
	
	

	
	public MessageRestService() {
		
		EsperSingleton.getInstance();
			

		
		
	}
	

	
	@POST
	@Path("/xmlCTM")
	@Consumes("application/xml")
	public Response receberXMLCTM(String xml) {
 
//		enviarParaPool(xml, TipoRetorno.XML);
		processarComando(xml, TipoRetorno.XML);
//		processarComandoComThread(xml, TipoRetorno.XML);
//		adicionarEventoLista(xml, TipoRetorno.XML);
		 return Response.status(200).entity(EsperSingleton.resultado).build();
 
	}	

	@POST
	@Path("/xmlLegado")
	@Consumes("application/xml")
	public Response receberXMLLegado(String xml) {
 
//		enviarParaPool(xml, TipoRetorno.XML);
		processarComando(xml, TipoRetorno.XML);
//		processarComandoComThread(xml, TipoRetorno.XML);
//		adicionarEventoLista(xml, TipoRetorno.XML);
		 return Response.status(200).entity(EsperSingleton.resultado).build();
 
	}	
	
	
	@POST
	@Path("/jsonnagios")
	@Consumes("application/json")
	public Response receberJSONNagios(String jsonResponse) {
//		
//		enviarParaPool(jsonResponse, TipoRetorno.JSON);
		processarComando(jsonResponse, TipoRetorno.JSON);
//		processarComandoComThread(jsonResponse, TipoRetorno.JSON);
//		adicionarEventoLista(jsonResponse, TipoRetorno.JSON);
		return Response.status(200).entity(EsperSingleton.resultado).build();
	}
	
	
	
	
	
	@POST
	@Path("/jsonzabbix")
	@Consumes("application/json")
	public Response receberJSONZabbix(String jsonResponse) {

		// TODO:
		return Response.status(200).entity( EsperSingleton.resultado).build();
 
	}	
	
	
	
	public void enviarParaPool() {
		
		
		  try {
		        List<Future<Boolean>> futures = EsperSingleton.pool.invokeAll(EsperSingleton.tasks);

				boolean works = true;
				for (Future<Boolean> future : futures) {
					future.get();
					if (future.isDone()) {
						System.out.println("true");
					} else {
						System.out.println("false");
						works = false;
					}
				}
				if (works)
					EsperSingleton.tasks = new ArrayList<EventoBasico>();				
				
		        
		    } catch (Exception e) {
		        e.printStackTrace();
		    }		
		
		  
		
		
	}
	
	
	
	private void processarComandoComThread(Object object, TipoRetorno tipoRetorno) {
		Runnable worker = new WorkerThread(object, tipoRetorno);
		Thread thread = new Thread(worker);
		thread.start();
		
	}
	
    private void processarComando(Object object, TipoRetorno tipoRetorno) {
    	EventoBasico eventoBasico = null;
    	if (object instanceof EventoBasico) {
	        eventoBasico=(EventoBasico) object;
    		
    	} else if (object instanceof String) {
    		
	        if (tipoRetorno.compareTo(TipoRetorno.XML)==0) {
		        eventoBasico = XMLJSONUtils.XMLToPojo((String) object);
	        	
	        } else {
	        	eventoBasico = XMLJSONUtils.jsonToPOJO((String) object);
	        }
    	}
    	
    	if (eventoBasico!=null) {
            EsperSingleton.epService.getEPRuntime().sendEvent(eventoBasico);
    		
    	}
    }
    
    
    private void adicionarEventoLista(Object object, TipoRetorno tipoRetorno) {
    	EventoBasico eventoBasico = null;
    	if (object instanceof EventoBasico) {
	        eventoBasico=(EventoBasico) object;
    		
    	} else if (object instanceof String) {
    		
	        if (tipoRetorno.compareTo(TipoRetorno.XML)==0) {
		        eventoBasico = XMLJSONUtils.XMLToPojo((String) object);
	        	
	        } else {
	        	eventoBasico = XMLJSONUtils.jsonToPOJO((String) object);
	        }
    	}
    	
    	if (eventoBasico!=null) {
    		
    		Callable<String> worker = new WorkerCallable2(eventoBasico);
            EsperSingleton.tasks.add(worker);
    	}
    	
    	
    	if (EsperSingleton.tasks.size() >=EsperSingleton.numEventosParaThread) {
    		enviarParaPool();
    		
    	}
    	
    	
    	
    	
    }
    
	
	
	
	
}
