package com.distribuida.principal;

import com.distribuida.entities.Categoria;

public class CategoriaPrincipal {

    public static void main(String[] args) {


        Categoria categoria = new Categoria();
        categoria.setIdCategoria(1);
        categoria.setCategoria("Novela");
        categoria.setDescripcion("Libros de narrativa extensa, generalmente ficticios.");


        // Imprimir las categorías
        System.out.println(categoria);

    }
}