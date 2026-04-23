package com.practice.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producto {
    private Long id;
    private String nombre;
    private double precio;

}
