package com.example.demo.service.impl;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entidad.Orden;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.repository.OrdenRepository;
import com.example.demo.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService {

	@Autowired
	private OrdenRepository ordenRepository;

	@Override
	public Orden guardar(Orden orden) {
		return ordenRepository.save(orden);
	}

	@Override
	public Iterable<Orden> listarOrdenesPorFecha(Date fechaEnvio) {
		// TODO Auto-generated method stub
		return ordenRepository.despuesDeUnaFecha(fechaEnvio);
	}

	@Override
	public Iterable<Orden> listarOrdenDetallePorProducto(Long idProducto) {
		// TODO Auto-generated method stub
		return ordenRepository.findByDetalle_IdProducto(idProducto);
		//return ordenDetalleRepository.listaDeOrdenes(idProducto);
	}

	@Override
	public Orden borrarOrden(Long idOrden) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		//Optional<Orden> orden = ordenRepository.findById(idOrden);
		Orden orden = ordenRepository.findById(idOrden)
				.orElseThrow(() -> new ResourceNotFoundException("Orden no registrado en la bd"));
		ordenRepository.delete(orden);
		return orden;
	}

	@Override
	public Orden actualizarFechaOrden(Date fecha, Long idOrden) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		
		Orden orden = ordenRepository.findById(idOrden)
				.orElseThrow(() -> new ResourceNotFoundException("Orden no registrado en la bd"));
		orden.setFechaEnvio(fecha);
		return ordenRepository.save(orden);
	}


}
