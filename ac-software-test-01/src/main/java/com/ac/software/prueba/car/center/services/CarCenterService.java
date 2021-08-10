package com.ac.software.prueba.car.center.services;

import java.util.List;

import com.ac.software.prueba.car.center.model.MechanicalDto;
import com.ac.software.prueba.car.center.model.entities.MechanicalEntity;
import com.ac.software.prueba.car.center.model.exceptions.CarCenterException;

public interface CarCenterService {

	
	void insertMechanical(MechanicalDto mechanicalDto ) throws CarCenterException;
	
	List<MechanicalEntity> findAllMechanicalAvailable() throws CarCenterException;
	
}
