package com.idat.AbrilServicioI.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AbrilServicioI.modelo.Productos;
import com.idat.AbrilServicioI.repositorio.ProductoRepositorio;

@Service
public class ProductoServImpl implements ProductoServicio {
	
	@Autowired
	public ProductoRepositorio repositorio;
	
	@Override
	public void guardarProducto(Productos producto) {
		repositorio.guardarProducto(producto);

	}

	@Override
	public void editarProducto(Productos producto) {
		repositorio.editarProducto(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {
		repositorio.eliminarProducto(id);

	}

	@Override
	public List<Productos> listarProductos() {
		return repositorio.listarProductos();
	}

	@Override
	public Productos obtenerProductosId(Integer id) {
		return repositorio.obtenerProductosId(id);
	}

}
