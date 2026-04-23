package com.practice.app.service;

import com.practice.app.model.Producto;
import com.practice.app.repository.ProductoDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoDAO productoDAO;

    // Inyección por constructor
    public ProductoService(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    public void crearProducto(Producto producto) {
        productoDAO.guardar(producto);
    }

    public List<Producto> obtenerProductos() {
        return productoDAO.listar();
    }

}
