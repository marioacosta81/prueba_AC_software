package com.ac.software.prueba.car.center.services;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ac.software.prueba.car.center.model.MechanicalDto;
import com.ac.software.prueba.car.center.model.entities.MechanicalEntity;
import com.ac.software.prueba.car.center.model.exceptions.CarCenterException;
import com.ac.software.prueba.car.center.repositories.CarCenterRepository;

@Service
public class CarCenterServiceImpl implements CarCenterService {

	@Autowired
	CarCenterRepository carCenterRepository;

	public void insertMechanical(MechanicalDto mechanicalDto) throws CarCenterException {
		try {
			carCenterRepository.insertMechanical(mechanicalDto.getTipoDocumento(), mechanicalDto.getDocumento(),
					mechanicalDto.getPrimerNombre(), mechanicalDto.getSegundoNombre(),
					mechanicalDto.getPrimerApellido(), mechanicalDto.getSegundoApellido(), mechanicalDto.getCelular(),
					mechanicalDto.getDireccion(), mechanicalDto.getEmail(), mechanicalDto.getEstado());
		} catch (PersistenceException  e) {
			throw new CarCenterException(e.getMessage());
		}

	}

	public List<MechanicalEntity> findAllMechanicalAvailable() throws CarCenterException {
		try {
			return carCenterRepository.findAllMechanicalAvailable();
		} catch (PersistenceException e) {
			throw new CarCenterException(e.getMessage());
		}
	}

}
