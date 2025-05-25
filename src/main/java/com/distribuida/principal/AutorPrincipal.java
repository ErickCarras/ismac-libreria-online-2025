package com.distribuida.principal;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Libro;

import java.time.LocalDate;

public class AutorPrincipal {

    public static void main(String[] args) {
        // Crear un autor con el constructor vacío y usar setters
        Autor autor = new Autor(1, "Isabel", "Allende", "Chile", "Santiago", "987654321", "isabel@example.com");
        Libro libro = new Libro(
                1,
                "Cien años de soledad",
                "Sudamericana",
                417,
                "Primera",
                "Español",
                LocalDate.parse("1967-01-01"),
                "Novela emblemática del realismo mágico.",
                "Dura",
                "978-3-16-148410-0",
                10,
                "portada.jpg",
                "Tapa dura con sobrecubierta",
                19.99
        );
        // Imprimir los objetos Autor
        System.out.println(autor);
        System.out.println(libro);
    }
}
