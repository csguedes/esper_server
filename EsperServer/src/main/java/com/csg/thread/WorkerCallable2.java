package com.csg.thread;

import java.util.concurrent.Callable;

import com.csg.model.EventoBasico;
import com.csg.util.EsperSingleton;

public class WorkerCallable2 implements Callable {

    private EventoBasico eventoBasico;
    

    public WorkerCallable2(EventoBasico eventoBasico){
    	
    	this.eventoBasico = eventoBasico;
    }

    
  
    private void processarComando() {
      	
    	
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
