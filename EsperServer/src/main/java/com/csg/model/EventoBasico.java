package com.csg.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class EventoBasico {
	
    private Long id;
	
	private String tipo;
    private String classificacao;
    private String mensagem;
    private String origem;
    
	public EventoBasico() {
		
	}

    public EventoBasico(String mensagem) {
    	this.mensagem=mensagem;
    }
   
    
    public String getType() {
        return this.getClass().getSimpleName();
    }


	public String getTipo() {
		return tipo;
	}

	@XmlElement
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getClassificacao() {
		return classificacao;
	}

	@XmlElement
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getMensagem() {
		return mensagem;
	}

	@XmlElement
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getOrigem() {
		return origem;
	}

	@XmlElement
	public void setOrigem(String origem) {
		this.origem = origem;
	}

	@Override
	public String toString() {
		return "EventoBasico [tipo=" + tipo + ", classificacao="
				+ classificacao + ", mensagem=" + mensagem + ", origem="
				+ origem + "]";
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventoBasico other = (EventoBasico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
    
    
    
}
