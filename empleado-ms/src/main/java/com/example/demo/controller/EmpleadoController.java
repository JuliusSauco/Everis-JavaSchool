package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.EmpleadoDTO;
import com.example.demo.dto.NombreEmpresaDTO;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.FeignService;

@RestController
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private FeignService feignService;
	
	@GetMapping("/empleado/{idEmpleado}")
	public EmpleadoDTO obtenerEmpleado(@PathVariable Long idEmpleado) throws ResourceNotFoundException {
		ModelMapper mapper = new ModelMapper();
		EmpleadoDTO empleado = mapper.map(empleadoService.obtenerEmpeladoPorId(idEmpleado), EmpleadoDTO.class);
		NombreEmpresaDTO nombreEmpresaDTO = feignService.obtenerEmpresaPorId(empleado.getIdEmpleado());
		empleado.setEmpresa(nombreEmpresaDTO.getNombre());
		return empleado;
	}
		
}
