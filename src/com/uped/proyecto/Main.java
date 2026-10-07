package com.uped.proyecto;

import com.uped.proyecto.modelo.Cliente;

public class Main {
    public static void main(String[] args) {
     Cliente cliente = new Cliente("Ana López", 
    "04512378-9", "7777-1234"); 
    System.out.println(cliente.presentarse()); 
    new Cliente("Ana López", "04512378-9", "7777-1234");
        }
    }