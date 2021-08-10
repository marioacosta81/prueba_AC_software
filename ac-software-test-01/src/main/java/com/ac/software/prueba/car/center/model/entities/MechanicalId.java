package com.ac.software.prueba.car.center.model.entities;

import java.io.Serializable;


public class MechanicalId implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoDocumento;
	private Integer documento;
	
	
	
	public MechanicalId( ) {
	}

	
	public MechanicalId(String tipoDocumento, Integer documento ) {
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public Integer getDocumento() {
		return documento;
	}


	public void setDocumento(Integer documento) {
		this.documento = documento;
	}
	

}
