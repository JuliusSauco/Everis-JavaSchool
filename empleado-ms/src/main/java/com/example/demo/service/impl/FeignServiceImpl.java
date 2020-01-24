package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.NombreEmpresaDTO;
import com.example.demo.feign.EmpresaClient;
import com.example.demo.service.FeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class FeignServiceImpl implements FeignService{

	@Autowired
	private EmpresaClient empresaClient;
	
	@HystrixCommand(fallbackMethod = "obtenerEmpresaDefecto")
	@Override
	public NombreEmpresaDTO obtenerEmpresaPorId(Long idEmpresa) {
		// TODO Auto-generated method stub
		return empresaClient.obtenerEmpresa(idEmpresa);
	}
	
	public NombreEmpresaDTO obtenerEmpresaDefecto(Long idEmpresa) {
		NombreEmpresaDTO nombreEmpresaDTO = new NombreEmpresaDTO();
		nombreEmpresaDTO.setNombre(" ");
		return nombreEmpresaDTO;
	}

}
