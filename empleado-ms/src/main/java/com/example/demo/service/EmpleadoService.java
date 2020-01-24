package com.example.demo.service;

import com.example.demo.entity.Empleado;
import com.example.demo.exceptions.ResourceNotFoundException;

public interface EmpleadoService {

	public Empleado obtenerEmpeladoPorId(Long idEmpleado) throws ResourceNotFoundException;

}
