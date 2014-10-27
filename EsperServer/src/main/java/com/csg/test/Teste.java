package com.csg.test;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

public class Teste {
	
	public static void main(String[] args) {
		
		
		String csv = "[[\"name\",\"address\",\"alias\",\"display_name\",\"services_with_info\"],[\"srv176\",\"10.2.1.176\",\"Sevidor 01 - teste\",\"srv176\",[[\"Root Partition\",0,1,\"DISK OK - free space: / 3624 MB (90% inode=97%):\"],[\"Passivo\",2,1,\"CRITICAL: Sem informacoes do cliente passivo\"],[\"PING\",0,1,\"PING OK - Packet loss = 0%, RTA = 0.34 ms\"],[\"Disco - /var\",2,1,\"(Return code of 255 is out of bounds)\"],[\"Disco - /usr\",2,1,\"(Return code of 255 is out of bounds)\"],[\"Disco - /tmp\",2,1,\"(Return code of 255 is out of bounds)\"],[\"Disco - /opt\",2,1,\"(Return code of 255 is out of bounds)\"],[\"Disco - /home\",2,1,\"(Return code of 255 is out of bounds)\"],[\"Disco - /boot\",2,1,\"(Return code of 255 is out of bounds)\"],[\"Disco - /\",2,1,\"(Return code of 255 is out of bounds)\"]]]]";

		JSONArray array = CDL.toJSONArray(csv);

		System.out.println(array.toString(2)); // pretty print with indent
		
		
        
//		URL url = Teste.class.getResource("esper.cfg.xml");
//		URL url = Teste.class.getClassLoader().getResource("esper.cfg.xml");
//		System.out.println(url.toString());
//
//		System.out.println(Teste.class.getResource("esper.cfg.xml"));
//        System.out.println(Teste.class.getClassLoader().getResource("esper.cfg.xml"));		
		
		// Configure engine: give nickames to event classes
//		Configuration config = new Configuration();
//		config.addEventType("PoucoPapel", com.csg.esper.PoucoPapel.class);
//		config.addEventType("EspacoEmDiscoInsuficiente", com.csg.esper.EspacoEmDiscoInsuficiente.class);
//		config.addEventType("EventoBasico", com.csg.esper.EventoBasico.class);
//		
//
//		// Get engine instance
//		EPServiceProvider epService =
//		    EPServiceProviderManager.getDefaultProvider(config);
//
//		
//		StringBuilder sb = new StringBuilder();
		
		
//		Exemplo:
//		sb.append("select * from LowPaper(amount<10).win:length(5)");
		
//		Exemplo:
//		sb.append("select * from BaseTerminalEvent where type='LowPaper' and amount < 10");
		
//		Exemplo:
//		sb.append("select count(*) from OutOfOrder.win:time(1 minutes))";
		
//		Exemplo:
//		sb.append("select type, count(*) " );
//		sb.append("from BaseTerminalEvent.win:time(30 sec) ");
//		sb.append("group by type ");
//		sb.append("output all every 10 sec ");
		
//		Exemplo:
//		sb.append("select * from BaseTerminalEvent.win:time_batch(2 sec) ");

//		Exemplo:
//		sb.append("select * from  MyXMLNodeEvent");

		
		
//		EPStatement epStatement =
//		    epService.getEPAdministrator().createEPL(sb.toString());
//
//		// Attach a listener
//		epStatement.addListener(new SampleListener());		
		
		
		
//		for (int i = 0; i < 9999999; i++) {
//			Caracteristicas t3 = new Caracteristicas("Papel acabando " + String.valueOf(i),i);
//			PoucoPapel lp3 = new PoucoPapel("Papel acabando " + String.valueOf(i));
//			epService.getEPRuntime().sendEvent(lp3);
//
//			Caracteristicas t4 = new Caracteristicas("Fora de ordem " + String.valueOf(i),i);
//			EspacoEmDiscoInsuficiente lp4 = new EspacoEmDiscoInsuficiente(t4);
//			epService.getEPRuntime().sendEvent(lp4);
//			
//			
//		}
		

		

	}

}
