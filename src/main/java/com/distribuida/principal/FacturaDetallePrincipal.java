package com.distribuida.principal;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

import java.time.LocalDate;
import java.util.Date;

public class FacturaDetallePrincipal {

    public static void main(String[] args) {

        // Crear Cliente
        Cliente cliente = new Cliente(1, "1734658743", "Juan", "Taipe", "Av. por ahi.", "0987523467", "jtaipe@correo.com");

        // Crear Factura
        Factura factura = new Factura(101, "F-001", new Date(), 59.98, 7.20, 67.18, cliente);

        // Crear Libro
        Libro libro = new Libro(  1,
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
                19.99);

        // Crear FacturaDetalle
        FacturaDetalle detalle = new FacturaDetalle(1, 2, 59.98);
        // Imprimir Detalle

        detalle.setLibro(libro);
        detalle.setFactura(factura);
        System.out.println(detalle);


    }
}