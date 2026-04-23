package com.practice.app;

import com.practice.app.model.Producto;
import com.practice.app.service.ProductoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ProductoService productoService) {
        return args -> {

            System.out.println("=== INICIANDO APP ===");

            productoService.crearProducto(new Producto(1L, "Laptop", 1200));
            productoService.crearProducto(new Producto(2L, "Mouse", 25));

            productoService.obtenerProductos().forEach(p ->
                    System.out.println(p.getNombre() + " - $" + p.getPrecio())
            );

        };
    }


}
