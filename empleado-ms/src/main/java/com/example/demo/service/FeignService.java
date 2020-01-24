package com.example.demo.service;

import com.example.demo.dto.NombreEmpresaDTO;

public interface FeignService {

	public NombreEmpresaDTO obtenerEmpresaPorId(Long idEmpresa);
	
}
