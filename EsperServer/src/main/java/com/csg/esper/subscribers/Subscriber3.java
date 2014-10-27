package com.csg.esper.subscribers;

import java.util.GregorianCalendar;
import java.util.Iterator;

import com.csg.util.EsperSingleton;
import com.espertech.esper.collection.EventUnderlyingCollection;

/**
 * 
 * @author cristian.guedes
 * Subscriber do tipo "Multi-Row Delivery"
 * Veja mais exemplos em: http://esper.codehaus.org/esper-5.0.0/doc/reference/en-US/html/api.html#api-admin-subscriber
 *
 */
public class Subscriber3 {
	public void update(Object[][] insertStream, Object[][] removeStream) {

		for (int i = 0; i < insertStream.length; i++) {
			
					
			
				for (int j = 0; j < insertStream[i].length; j++) {
					
					
					if (insertStream[i][j] instanceof EventUnderlyingCollection) {
						
						EventUnderlyingCollection colecaoSubjacente = (EventUnderlyingCollection) insertStream[i][j];
						
						if (colecaoSubjacente!=null) {
							
							for (Iterator iterator = colecaoSubjacente.iterator(); iterator
									.hasNext();) {
								
								Object object = iterator.next();
								EsperSingleton.log.info(object.toString());
								
							}
						} 
					}
					
					else {
						EsperSingleton.log.info(insertStream[i][j]);
					}
					
			
				}
			
		}
		EsperSingleton.log.info(String.valueOf(new GregorianCalendar().getTime())+" ---------------------------------------------------");
		
	}

}
