package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Empresa;
import com.example.demo.exceptions.ValidacionException;
import com.example.demo.repository.EmpresaRepository;
import com.example.demo.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService{
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public String obtenerEmpresa(Long idEmpresa) throws ValidacionException {
		// TODO Auto-generated method stub
		Empresa empresa = empresaRepository.findById(idEmpresa)
				.orElseThrow(() -> new ValidacionException("No se encontro la empresa: " + idEmpresa));
		
		return empresa.getNombre();
	}

}
