package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.NombreEmpresaDTO;
import com.example.demo.exceptions.ValidacionException;
import com.example.demo.service.EmpresaService;

@RestController
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping("/empresa/{idEmpresa}")
	public NombreEmpresaDTO obtenerEmpresa(@PathVariable Long idEmpresa) throws ValidacionException {
		NombreEmpresaDTO response = new NombreEmpresaDTO();
		response.setNombre(empresaService.obtenerEmpresa(idEmpresa));
		return response;
	}
}
