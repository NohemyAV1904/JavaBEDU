/*
 Nohemy Aguilar Valladares
 Reto 2 - Sesion 6
*/

package com.bedu.inventario2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication2.class, args);
	}

	@Bean
	public CommandLineRunner demo(ProductoRepository productoRepo, CategoriaRepository categoriaRepo, MarcaRepository marcaRepo) {
		return (args) -> {
			Categoria tecnologia = new Categoria("Tecnología");
			categoriaRepo.save(tecnologia);

			Marca apple = new Marca("Apple");
			Marca samsung = new Marca("Samsung");

			marcaRepo.save(apple);
			marcaRepo.save(samsung);

			productoRepo.save(new Producto("iPhone 15", "Smartphone con iOS", 25000.00, tecnologia, apple));
			productoRepo.save(new Producto("iPad Pro", "Tablet con M2 chip", 28000.00, tecnologia, apple));
			productoRepo.save(new Producto("Galaxy S24", "Smartphone con Android", 21000.00, tecnologia, samsung));
			productoRepo.save(new Producto("Smart TV", "Pantalla 55 pulgadas 4K", 17000.00, tecnologia, samsung));

			System.out.println("\n~~~~~ Productos por marca ~~~~~");
			marcaRepo.findAll().forEach(marca -> {
				System.out.println("-> " + marca.getNombre() + ":");
				productoRepo.findAll().stream()
						.filter(p -> p.getMarca().getId().equals(marca.getId()))
						.forEach(p -> System.out.println("   • " + p.getNombre()));
			});
		};
	}
}
