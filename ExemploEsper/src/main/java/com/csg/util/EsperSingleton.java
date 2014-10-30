package com.csg.util;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import com.csg.esper.subscribers.Subscriber3;
import com.csg.model.EventoBasico;
import com.csg.model.ctm.EventoCTM;
import com.csg.model.legado.EventoLegado;
import com.csg.model.nagios.EventoNagios;
import com.csg.model.zabbix.EventoZabbix;
import com.csg.test.Teste;
import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.ConfigurationDBRef;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;

public class EsperSingleton {
	private static EsperSingleton instance = null;
	public static String resultado = null;
	public static boolean iniciado = false;
	public static Logger log = Logger.getLogger(EsperSingleton.class.getName());
	public static EventoBasico eventoBasico;
	public static EventoCTM eventoCTM;
	public static EventoNagios eventoNagios;
	public static EventoZabbix eventoZabbix;
	public static EventoLegado eventoLegado;
	public static Configuration config;
	public static ConfigurationDBRef configDB;
	public static EPServiceProvider epService;
	public static StringBuilder sb = new StringBuilder();
	public static int numMaxThreads =Runtime.getRuntime().availableProcessors()+1;
	public static ExecutorService pool = Executors.newFixedThreadPool(numMaxThreads);
	public static ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(pool);
	public static int numEventosParaThread = 10;
//	public static List<EventoBasico> eventos = new ArrayList<EventoBasico>();
	public static Collection tasks = new ArrayList<EventoBasico>();	
	
	protected EsperSingleton() {
		// Exists only to defeat instantiation.
	}

	public static EsperSingleton getInstance() {
		if (instance == null) {
			instance = new EsperSingleton();
			configurarEsper();
			addStatements();
			iniciado=true;
			

		}
		return instance;
	}
	
	
	private static void addStatement(String statement, Object subscriber) {
		EPStatement epStatement = epService.getEPAdministrator().createEPL(statement);
		
		
		if (subscriber instanceof UpdateListener) {
			epStatement.addListener((UpdateListener) subscriber);
			
		} else {
			epStatement.setSubscriber(subscriber);
			
		}
		
		
	}
	
	
	private static void addStatements() {
	
//		SingletonClass.sb.setLength(0);
		
		
		// Fonte: http://esper.codehaus.org/esper-4.2.0/doc/reference/en/html/epl_clauses.html
		
		// Exemplo 1
		// Total de eventos de contratação ocorridos nas últimas 2 horas
//		addStatement("select *  from pattern[every eb=EventoBasico(origem='EventoLegado', tipo='Contratacao') where timer:within(60 sec)].win:time(2 hour) group by eb.tipo having count(*) > 9 and count(*) < 15 ", new SampleListener());

		// Select sobre o xml do inventário
//		addStatement("select REQUEST.CONTENT.HARDWARE.NAME from EventoCTM", new Subscriber2());
//		addStatement("select REQUEST.CONTENT.STORAGES[0].DISKSIZE, REQUEST.CONTENT.STORAGES[0].FREE from EventoCTM", new Subscriber2());
//		addStatement("@Name(\"Percentual_Minimo_Disco\") select * from pattern [every (ev1=EventoCTM((REQUEST.CONTENT.STORAGES[0].FREE*100)/REQUEST.CONTENT.STORAGES[0].DISKSIZE <60))  ] ", new Subscriber2());
//		addStatement("select REQUEST.CONTENT.STORAGES.where(i => i.NAME = 'E:')  from EventoCTM", new Subscriber2());
//		addStatement("select REQUEST.CONTENT.STORAGES.firstOf(i => i.NAME = 'D:').FREE  from EventoCTM", new SampleListener());
//		addStatement("select * from pattern [every (ev1=EventoCTM((REQUEST.CONTENT.STORAGES.firstOf(i => i.NAME = 'D:').FREE*100)/REQUEST.CONTENT.STORAGES.firstOf(i => i.NAME = 'D:').DISKSIZE <96))  ] ", new Subscriber2());
		
//		addStatement("create context SegmentedByHardware partition by REQUEST.CONTENT.HARDWARE.NAME from EventoCTM", new Subscriber3());
//		addStatement("context SegmentedByHardware select REQUEST.CONTENT.SERVICES.where(i => i.STATUS = 'Stopped') from EventoCTM  ", new Subscriber3());
//		addStatement("context SegmentedByHardware select REQUEST.CONTENT.HARDWARE.NAME from EventoCTM  ", new Subscriber3());
//		addStatement("select REQUEST.CONTENT.SERVICES.where(i => i.STATUS = 'Running') from EventoCTM  ", new Subscriber3());
//		addStatement("select hosts.events.where(i => i.display_name = 'disco - /') from EventoNagios  ", new Subscriber3());
//		addStatement("select hosts.check_command from EventoNagios where hosts.events.anyof(i => i.display_name = 'disco - /')   ", new Subscriber3());
		addStatement("select count(*) from  EventoBasico.win:time(24 hours) output last every 10 seconds", new Subscriber3());
//		addStatement("select * from pattern [every (ev2=EventoNagios((hosts.events.firstOf(i => i.display_name = 'D:').FREE*100)/REQUEST.CONTENT.STORAGES.firstOf(i => i.NAME = 'D:').DISKSIZE <96))  ] ", new Subscriber2());

		// Exemplo 2
//		sb.append("select PoucoPapel.* as PoucoPapel, EspacoEmDiscoInsuficiente.* as EspacoEmDiscoInsuficiente from PoucoPapel.win:time(10 sec) as PoucoPapel, EspacoEmDiscoInsuficiente.win:time(10 sec) as EspacoEmDiscoInsuficiente ");
		
		
		// Exemplo 3
//		sb.append("select eb.id as id, eb.mensagem as mensagem, eb.tipo as tipo ");
//		sb.append("from pattern[every eb=EventoBasico where timer:within(10 sec)] ");
			
		// Exemplo 4: faz output somente a cada 10 segundos
//		SingletonClass.sb.append("select distinct * from EventoBasico.win:time(30 min) output snapshot every 10 seconds order by origem");
		
		// Exemplo 5: propriedades dinâmicas
//		SingletonClass.sb.append("select distinct name? from EventoBasico.win:time(30 min) output snapshot every 10 seconds order by origem");

//		 Exemplo 6: usando contexto
//		addStatement("create context ByTipo partition by origem, tipo,  classificacao from EventoBasico ");
//		addStatement("context ByTipo select origem, tipo, classificacao, count(*) as quantidade from EventoBasico.win:time(10 seconds) output first every 10 seconds ");

		// Exemplo 7: usando contexto com categoria
//		addStatement("create context PorTipo group tipo='Information' as Information, group tipo='Warning' as Warning, group tipo='Exception' as Exception from EventoBasico ");
//		addStatement("context PorTipo select context.label, count(*) from EventoBasico.win:time(10 seconds) output snapshot every 10 seconds ");
		
		
		
		// Estatística
//		sb.append("select * from ");
//		sb.append("com.csg.esper.EventoBasico(tipo='PoucoPapel').win:length(100).stat:uni(amount) as volumeStats	");	
		
//		SingletonClass.sb.append("select * from EventoBasico(origem=\"EventoNagios\").win:length(100)");
//		SingletonClass.sb.append("select * from EventoBasico.win:length(100)");

		
//		sb.append("select * from EventoBasico(amount in [100:200]).win:length(100)");
		
//		SingletonClass.sb.append("@Name('GrupoPorTipo') ");
//		SingletonClass.sb.append("@Description('Imprime, a cada 10 segundos,  o total de amount por tipo, nas ultimas 24 horas') ");
//		SingletonClass.sb.append("@Tag(name='agrupamento', value='tipo') ");
////		SingletonClass.sb.append("select  tipo, count(*) from EventoBasico(origem='EventoNagios').win:time(60) group by tipo output all every 10 seconds");
//		SingletonClass.sb.append("select tipo, count(*) from EventoBasico.win:time(60) group by tipo output all every 10 seconds");

		// mostra o total de "amount" por tipo, mas somente a cada 2 minutos e apartir das 17:18
//		sb.append("select tipo as tipo, sum(amount) as amount from EventoBasico group by tipo output snapshot at (*/2, 17:46, *, *, *)  ");

		// A próxima instrução exibe o total de "amount" por tipo cumulativamente (cláusula "all")
//		sb.append("select tipo as tipo, sum(amount) as amount from EventoBasico group by tipo output all every 5 seconds  ");
		
		
		// A próxima instrução considera os últimos 3 minutos. Quando os eventos saírem da janela de dados 3 minutos, novos valores de agregação são computados.
//		sb.append("select tipo as tipo, sum(amount) as amount from EventoBasico.win:time(3 min) group by tipo output every 5 seconds  ");
		
		
		// média do valor do campo "amount" nos últimos 30 segundos
//		sb.append("select avg(amount) as amount from EventoBasico.win:time(60 sec) ");
		
//		sb.append("select tipo, mensagem, sum(amount) as amount  ");
//		sb.append("from EventoBasico.std:groupwin(tipo).win:length(10)  ");
//		sb.append("group by tipo	 ");		

		// Exemplo 4: faz output somente a cada 10 segundos
//		sb.append("insert into teste ");
//		sb.append("select tipo, mensagem, sum(amount) as amount from EventoBasico output snapshot every 10 seconds limit 10");
		
		
		
		// Fazendo join com dados da tabela do postgres
//		SingletonClass.sb.append("select id, tipo, mensagem, amount from ");
//		SingletonClass.sb.append("EventoBasico.win:time(30 sec) as eb, ");
//		SingletonClass.sb.append("sql:db1 [\"select id as id2, tipo as tipo2, mensagem as mensagem2, amount as amount2 from EventoBasico  "); 
//		SingletonClass.sb.append("where tipo = ${eb.tipo}\"] as cq	");
		
		
		// Janela do tempo
//		sb.append("create window JanelaDoTempo.win:time(30 sec) as 	");
//		sb.append("select id, tipo, mensagem, amount from EventoBasico		");		

		// Trabalhando com padrão (primeira correlação)
//		SingletonClass.sb.append("select * from pattern ");
//		SingletonClass.sb.append("[every (ev1=PoucoPapel(amount<30) and ev2=EspacoEmDiscoInsuficiente(amount<30) and ev3=EventoNagios(amount<30) and ev4=EventoZabbix(amount<30))] ");
		
		// Trabalhando com padrão (followed-by - seguido de...)
		// Pode-se incluir where timer.within(10 sec) ) também
		// timer:at(5, *, *, *, *)
//		SingletonClass.sb.append("select * from pattern ");
//		SingletonClass.sb.append("[every (ev1=PoucoPapel(amount<10) -> ev2=EspacoEmDiscoInsuficiente(amount>20)) ] ");
		
		
//		EPStatement epStatement =
//				SingletonClass. epService.getEPAdministrator().createEPL(SingletonClass.sb.toString());
		
//		epStatement.addListener(new SampleListener());
		
//		epStatement.setSubscriber(new Subscriber2());
		
//		epStatement.addListener(new StatementAwareUpdateListener() {
//
//			@Override
//			public void update(EventBean[] newEvents,
//					EventBean[] oldEvents, EPStatement statement,
//					EPServiceProvider epServiceProvider) {
//				for (int i = 0; i < newEvents.length; i++) {
//					SingletonClass.log.info("tipo:"
//							+ newEvents[i].get("tipo"));
//					// SingletonClass.log.info("mensagem:"
//					// +newEvents[i].get("mensagem"));
//					SingletonClass.log.info("amount:" + newEvents[i].get("amount"));
//
//					System.out
//							.println("---------------------------------------------");
//
//					SingletonClass.resultado = "Evento processado!";
//
//
//				}
//
//			}
//		});
		
//		epStatement.addListener(new UpdateListener() {
//
//		@Override
//		public void update(EventBean[] newEvents, EventBean[] oldEvents) {
//			
//			for (int i = 0; i < newEvents.length; i++) {
//				SingletonClass.log.info("tipo:" +newEvents[i].get("tipo"));
////				SingletonClass.log.info("mensagem:" +newEvents[i].get("mensagem"));
//				SingletonClass.log.info("amount:" + newEvents[i].get("amount"));
//				
//			}
//			
//			System.out.println("---------------------------------------------");
//
//	        SingletonClass.resultado="Evento processado!";
//			
//		}
//		});			
		
		
		
//			@Override
//			public void update(EventBean[] newEvents, EventBean[] oldEvents) {
//				SingletonClass.log.info("tipo:" +newEvents[0].get("ev1.tipo"));
//				SingletonClass.log.info("mensagem:" +newEvents[0].get("ev1.mensagem"));
//				SingletonClass.log.info("amount:" + newEvents[0].get("ev1.amount"));
//
//				SingletonClass.log.info("tipo:" +newEvents[0].get("ev2.tipo"));
//				SingletonClass.log.info("mensagem:" +newEvents[0].get("ev2.mensagem"));
//				SingletonClass.log.info("amount:" + newEvents[0].get("ev2.amount"));
//				
//				SingletonClass.log.info("tipo:" +newEvents[0].get("ev3.tipo"));
//				SingletonClass.log.info("mensagem:" +newEvents[0].get("ev3.mensagem"));
//				SingletonClass.log.info("amount:" + newEvents[0].get("ev3.amount"));
//
//				SingletonClass.log.info("tipo:" +newEvents[0].get("ev4.tipo"));
//				SingletonClass.log.info("mensagem:" +newEvents[0].get("ev4.mensagem"));
//				SingletonClass.log.info("amount:" + newEvents[0].get("ev4.amount"));
//				
//				
//		        SingletonClass.resultado="Evento processado!";
//				
//			}
//			});			
		
		
	}
	
	
	private static void configurarEsper() {
		// Configure engine: give nickames to event classes
		config = new Configuration();
		URL url = EsperSingleton.class.getClassLoader().getResource("esper.cfg.xml");
		config.configure(url);
		// Get engine instance
		epService = EPServiceProviderManager.getDefaultProvider(config);
		
		
		
	}
	
	
	


	
	
	
	
}