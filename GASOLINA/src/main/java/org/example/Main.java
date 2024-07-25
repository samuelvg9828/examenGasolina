package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado=new Scanner(System.in);

        //DIAGRAMA

        // ALMACENAR  LA DISTANCIA DEL VIAJE EN KM (DOUBLE)
        // CONSUMO DEL COMBUSTIBLE EN LITROS (DOUBLE)
        // PRECIO DEL COMBUSTIBLE (DOUBLE)
        // INFORMACION DEL CARRO (STRING)
        // INFORMACION DEL CONDUCTOR (STRING)
        // COSTO TOTAL (DOUBLE)


        double distanciaKm;
        double consumo100km;
        double precioCombustible;
        String informacionCarro;
        String informacionConductor;

        System.out.println("****Bienvenido aca podras calcular el consumo estimado en tu viaje**** ");

        System.out.println("Digita la informacion del vehiculo:");
        informacionCarro= leerTeclado.nextLine();

        System.out.println("Informacion del conductor: ");
        informacionConductor = leerTeclado.nextLine();

        System.out.println("La distancia que vas a recorrer en km es: ");
        distanciaKm= leerTeclado.nextDouble();

        System.out.println("Tu consumo en litros por cada 100km es:  ");
        consumo100km= leerTeclado.nextDouble();


        System.out.println("Precio de combustible es: ");
        precioCombustible= leerTeclado.nextDouble();


        double costoTotal;

        double consumodegasolia;


        consumodegasolia = (distanciaKm/100)*consumo100km;
        costoTotal = consumodegasolia*precioCombustible;

        System.out.printf("\n Comsumo estimado de combustible: %.2f litros\n" , consumodegasolia, consumodegasolia);

        System.out.printf("Costo total de combustible: $%.2f\n", costoTotal);





























    }
}