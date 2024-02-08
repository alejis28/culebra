package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer tamanoCulebra=3;
        Integer tamanoTerreno;



        Scanner lea = new Scanner(System.in);

        System.out.println("........Snake........");
        System.out.println("Digita el tamaño del terreno");
        tamanoTerreno=lea.nextInt();

        System.out.println("1.comer");
        System.out.println("2.salir");
         int opcion;
         do {
             System.out.println("Digite una opcion");
             opcion=lea.nextInt();

             switch (opcion){
                 case 1:
                     System.out.println("comiendo");
                     tamanoCulebra=tamanoCulebra=1;
                     if (tamanoCulebra>tamanoTerreno)
                         System.out.println("limite del juego");
                     break;
                 case 2:
                     System.out.println("saliendo");
                     break;
                 default:
                     System.out.println("opcion invalida");
                     break;
             }

         }while (opcion!=2);


    }
}