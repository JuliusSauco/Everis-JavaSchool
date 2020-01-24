package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidad.TipoProducto;
import com.example.demo.repository.TipoProductoRepository;
import com.example.demo.service.TipoProductoService;

@Service
public class TipoProductoServiceImpl implements TipoProductoService{
	
	@Autowired
	private TipoProductoRepository tipoProductoRepository;

	@Override
	public Iterable<TipoProducto> obtenerTiposDePorductos() {
		// TODO Auto-generated method stub
		return tipoProductoRepository.findAll();
	}

}
