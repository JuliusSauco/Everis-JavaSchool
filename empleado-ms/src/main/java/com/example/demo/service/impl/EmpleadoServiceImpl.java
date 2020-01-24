package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Empleado;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public Empleado obtenerEmpeladoPorId(Long idEmpleado) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(idEmpleado)
				.orElseThrow(() -> new ResourceNotFoundException("Empelado no registrado, id: " + idEmpleado));
		
	}

}
