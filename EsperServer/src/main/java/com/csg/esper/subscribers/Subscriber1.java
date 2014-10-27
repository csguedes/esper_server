package com.csg.esper.subscribers;

import com.csg.util.EsperSingleton;

/**
 * 
 * @author cristian.guedes
 * Subscriber do tipo "Row-By-Row Delivery"
 * Veja mais exemplos em: http://esper.codehaus.org/esper-5.0.0/doc/reference/en-US/html/api.html#api-admin-subscriber
 *
 */
public class Subscriber1 {
	public void update(String tipo, String mensagem) {
		EsperSingleton.log.info("tipo: " +tipo);
//		SingletonClass.log.info("mensagem:" +newEvents[i].get("mensagem"));
		EsperSingleton.log.info("mensagem:" + String.valueOf(mensagem));
		EsperSingleton.log.info("---------------------------------------------");

	}
}
