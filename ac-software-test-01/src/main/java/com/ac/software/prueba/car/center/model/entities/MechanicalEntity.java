package com.ac.software.prueba.car.center.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@IdClass(MechanicalId.class)
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
        name = "procedure-insert-mechanical",
        procedureName = "SYSTEM.CAR_CENTER_MECHANICAL.INSERT_MECHANICAL",
        parameters = {
          @StoredProcedureParameter(mode=ParameterMode.IN, name="p_tipo_documento", type=String.class),
          @StoredProcedureParameter(mode=ParameterMode.IN, name="p_documento", type=Integer.class),
          @StoredProcedureParameter(mode=ParameterMode.IN, name="p_primer_nombre", type=String.class),
          @StoredProcedureParameter(mode=ParameterMode.IN, name="p_segundo_nombre", type=String.class),
          @StoredProcedureParameter(mode=ParameterMode.IN, name="p_primer_apellido", type=String.class),
          @StoredProcedureParameter(mode=ParameterMode.IN, name="p_segundo_apellido", type=String.class),
          @StoredProcedureParameter(mode=ParameterMode.IN, name="p_celular", type=String.class),
          @StoredProcedureParameter(mode=ParameterMode.IN, name="p_direccion", type=String.class),
          @StoredProcedureParameter(mode=ParameterMode.IN, name="p_email", type=String.class),
          @StoredProcedureParameter(mode=ParameterMode.IN, name="p_estado", type=String.class)
    }),
    @NamedStoredProcedureQuery(
            name = "procedure-get-mechanical",
            procedureName = "SYSTEM.CAR_CENTER_MECHANICAL.FETCH_MECHANICAL_AVAILABLE",
    		resultClasses = MechanicalEntity.class,
    		parameters = {
    		  @StoredProcedureParameter(mode=ParameterMode.REF_CURSOR,  type=void.class)
    		})
            
})
public class MechanicalEntity {
	
	@Id
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	
	@Id
	@Column(name = "documento")
	private Integer documento;
	
	@Column(name = "primer_nombre")
	private String primerNombre;

	@Column(name = "segundo_nombre")
	private String segundoNombre;
	
	@Column(name = "primer_apellido")
	private String primerApellido;
	
	@Column(name = "segundo_apellido")
	private String segundoApellido;
	
	@Column(name = "celular")
	private String celular;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "estado")
	private String estado;
	
	
	
	
	
	
	
	

	public MechanicalEntity() {
	}


	public String getPrimerNombre() {
		return primerNombre;
	}


	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
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
