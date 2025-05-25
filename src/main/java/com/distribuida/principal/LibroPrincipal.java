package com.distribuida.principal;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;
import java.time.LocalDate;

public class LibroPrincipal {

    public static void main(String[] args) {

        Categoria categoria = new Categoria();
        categoria.setIdCategoria(1);
        categoria.setCategoria("Novela");
        categoria.setDescripcion("Libros de narrativa extensa, generalmente ficticios.");

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
        libro.setAutor(autor);
        libro.setCategoria(categoria);
        System.out.println(libro);
    }
}