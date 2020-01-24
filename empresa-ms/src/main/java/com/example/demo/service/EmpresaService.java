package com.example.demo.service;

import com.example.demo.exceptions.ValidacionException;

public interface EmpresaService {

	public String obtenerEmpresa(Long idEmpresa) throws ValidacionException;

}
