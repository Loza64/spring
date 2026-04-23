package com.practice.app.repository;

import com.practice.app.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoDAO {
    private List<Producto> lista = new ArrayList<>();

    public void guardar(Producto producto) {
        lista.add(producto);
    }

    public List<Producto> listar() {
        return lista;
    }

}
