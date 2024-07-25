package org.example;

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

     Scanner leerTeclado=new Scanner(System.in);

     //DIAGRAMA DE ENTRADA

        // HELADO SIMPLE (STRING)
        //HELADO DOBLE (STRING)
        // HELADO ESPECIAL (STRING)
        //CANTIDAD DE HELADOS SIMPLE (BYTE)
        // CANTIDAD DE HELADO DOBLE (BYTE)
        //CANTIDAD DE HELADO ESPECIAL (BYTE)
        // PRECIO DE HELADO SIMPLE (INT)
        // PRECIO DE HELADO DOBLE (INT)
        // PRECIO DE HELADO ESPECIAL (INT)
        // TOTAL (INT)

        String heladoSimple;
        String heladoDoble;
        String heladoEspecial;
        byte  cantidadEspecial;
        byte  cantidadSimple;
        byte  cantidadDoble;
        int precioSimple = 5000;
        int precioDoble= 8000;
        int precioEspecial=10000;
        double subtotalSimple;
        double subtotalDoble;
        double subtotalEspecial;
        double totalVentas;

        System.out.println("***BIENVENIDOS A LA HELADERIA FROZEN***");

        System.out.println("Recuerda que el valor de nuestros helados es simple a 5.000\n"+"helado Doble: 8,000\n Helado Especial: 10.000");

        System.out.println("Cantidad de helado simple: ");
        cantidadSimple= leerTeclado.nextByte();
        System.out.println("Cantidad de helado doble: ");
        cantidadDoble= leerTeclado.nextByte();
        System.out.println("Cantidad de helado especial: ");
        cantidadEspecial= leerTeclado.nextByte();

        final double valorSimple=5000;
        final double valorDoble=8000;
        final double valorEspecial=10000;


      subtotalSimple=cantidadSimple*precioSimple;
      subtotalDoble=cantidadDoble*precioDoble;
      subtotalEspecial=cantidadEspecial*precioEspecial;

      totalVentas=subtotalSimple+subtotalDoble+subtotalEspecial;

        System.out.println("Recuerda que el valor del helado simple es 5.000\n"+"helado Doble: 8,000\n Helado Especial: 10.000");
        System.out.println("Total de sus helados es: "+ totalVentas);







    }
}