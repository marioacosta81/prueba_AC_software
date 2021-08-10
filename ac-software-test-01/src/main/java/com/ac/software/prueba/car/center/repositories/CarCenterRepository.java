package com.ac.software.prueba.car.center.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ac.software.prueba.car.center.model.entities.MechanicalEntity;
import com.ac.software.prueba.car.center.model.entities.MechanicalId;

public interface CarCenterRepository extends CrudRepository<MechanicalEntity, MechanicalId> {

	@Procedure(name = "procedure-insert-mechanical")
	void insertMechanical(

			@Param("p_tipo_documento") String tipoDocumento, @Param("p_documento") Integer documento,
			@Param("p_primer_nombre") String primerNombre, @Param("p_segundo_nombre") String segundoNombre,
			@Param("p_primer_apellido") String primerApellido, @Param("p_segundo_apellido") String segundoApellido,
			@Param("p_celular") String celular, @Param("p_direccion") String direccion, @Param("p_email") String email,
			@Param("p_estado") String estado

	);

	@Procedure(name = "procedure-get-mechanical")
	List<MechanicalEntity> getMechanicalAvailable();

	@Query(value = "select  me.tipo_documento, me.documento,me.primer_nombre,me.segundo_nombre,me.primer_apellido,me.segundo_apellido,me.celular,me.direccion,me.email,me.estado\r\n" + 
			"FROM mantenimiento ma right  join mecanicos me \r\n" + 
			"    on me.tipo_documento = ma.mec_tipo_documento and  me.documento= ma.mec_documento\r\n" + 
			"where ROWNUM <= 10 \r\n" + 
			"group by  me.tipo_documento, me.documento,me.primer_nombre,me.segundo_nombre,me.primer_apellido,me.segundo_apellido,me.celular,me.direccion,me.email,me.estado\r\n" + 
			"order by count(*)",nativeQuery = true)
	List<MechanicalEntity> findAllMechanicalAvailable();

}
