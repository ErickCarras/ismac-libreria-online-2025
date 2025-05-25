package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "1734658743", "Juan", "Taipe", "Av. por ahi.", "0987523467", "jtaipe@correo.com");
        System.out.println(cliente);
    }
}