package com.csg.esper.subscribers;

import java.util.GregorianCalendar;
import java.util.HashMap;

import com.csg.model.EventoBasico;
import com.csg.model.ctm.EventoCTM;
import com.csg.model.nagios.EventoNagios;
import com.csg.util.EsperSingleton;
import com.espertech.esper.client.EventBean;

/**
 * 
 * @author cristian.guedes
 * Subscriber do tipo "Multi-Row Delivery"
 * Veja mais exemplos em: http://esper.codehaus.org/esper-5.0.0/doc/reference/en-US/html/api.html#api-admin-subscriber
 *
 */
public class Subscriber2 {
	public void update(Object[][] insertStream, Object[][] removeStream) {

		for (int i = 0; i < insertStream.length; i++) {
					
			
//			if (insertStream[i][0] instanceof EventoBasico) {
//				EventoBasico evento = (EventoBasico) insertStream[i][0];
//				SingletonClass.log.info(evento.toString());
//				
//				if (evento.getOrigem().equalsIgnoreCase("EventoNagios") ){
//					EventoNagios eventoNagios = (EventoNagios) insertStream[i][0];
//					SingletonClass.log.info(eventoNagios.toString());
//				}
//				
//				
//				if (evento.getOrigem().equalsIgnoreCase("EventoCTM") ){
//					EventoCTM eventoCTM = (EventoCTM) insertStream[i][0];
//					SingletonClass.log.info(eventoCTM.toString());
//				}
//				
//			} else if (insertStream[i][0] instanceof HashMap) {	
//				SingletonClass.log.info(insertStream[i][0].toString());
//
//			} else {
//				SingletonClass.log.info(insertStream[i][0].toString());
//					
				for (int j = 0; j < insertStream[i].length; j++) {
					EsperSingleton.log.info(insertStream[i][j].toString());	
//					
//					if (insertStream[i][j] instanceof String) {
//						SingletonClass.log.info((String) insertStream[i][j]);
//					} else if (insertStream[i][j] instanceof Integer) {
//						SingletonClass.log.info((Integer) insertStream[i][j]);
//						
//					} else if (insertStream[i][j] instanceof Double) {
//						SingletonClass.log.info((Double) insertStream[i][j]);
//					} else if (insertStream[i][j] instanceof Long) {
//						
//						SingletonClass.log.info((Long) insertStream[i][j]);
//					}
//					
				}
//					
//					
//					
//			
//				
//			}
			
			
			
		}
		EsperSingleton.log.info(String.valueOf(new GregorianCalendar().getTime())+" ---------------------------------------------------");
		
	}

}
