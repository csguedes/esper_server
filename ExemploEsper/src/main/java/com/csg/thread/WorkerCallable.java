package com.csg.thread;

import java.util.concurrent.Callable;

import com.csg.model.EventoBasico;
import com.csg.util.EsperSingleton;
import com.csg.util.TipoRetorno;
import com.csg.util.XMLJSONUtils;

public class WorkerCallable implements Callable {

    private EventoBasico eventoBasico;
    private TipoRetorno tipoRetorno;
    private Object object;
    

    public WorkerCallable(Object object, TipoRetorno tipoRetorno){
    	
    	this.object = object;
    	this.tipoRetorno = tipoRetorno;
    	
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


	@Override
	public String call() throws Exception {
        processarComando();
        return this.eventoBasico.toString();
	}
    
    
   
}	
