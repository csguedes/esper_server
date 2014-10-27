package com.csg.thread;

import com.csg.model.EventoBasico;
import com.csg.util.EsperSingleton;
import com.csg.util.TipoRetorno;
import com.csg.util.XMLJSONUtils;

public class WorkerThread implements Runnable {

    private EventoBasico eventoBasico;
    private TipoRetorno tipoRetorno;
    private Object object;
    

    public WorkerThread(Object object, TipoRetorno tipoRetorno){
    	
    	this.object = object;
    	this.tipoRetorno = tipoRetorno;
    	
    }

    
    @Override
    public void run() {
    	
//        System.out.println(" Thread "+Thread.currentThread().getName()+" iniciada. ");
        processarComando();
//        System.out.println(" Thread "+Thread.currentThread().getName()+" finalizada. ");
    }

    private void processarComando() {
    	if (object instanceof EventoBasico) {
	        this.eventoBasico=(EventoBasico) object;
    		
    	} else if (object instanceof String) {
    		
	        if (tipoRetorno.compareTo(TipoRetorno.XML)==0) {
		        this.eventoBasico = XMLJSONUtils.XMLToPojo((String) object);
	        	
	        } else {
	        	this.eventoBasico = XMLJSONUtils.jsonToPOJO((String) object);
	        }
    	}
    	
    	
        EsperSingleton.epService.getEPRuntime().sendEvent(eventoBasico);
        
    }

    @Override
    public String toString(){
        return this.eventoBasico.toString();
    }
    
    
   
}	
