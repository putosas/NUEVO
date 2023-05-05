package pkg3.pkg10.pkg8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner SC = new Scanner(System.in);

        double DES = 0;
        double COM = 0;
        int precio;
        String respuesta;

        do {
            System.out.print("PRECIO DEL ARTICULO  : ");
            precio = (int) SC.nextDouble();
            System.out.println("SI  :   NO ");
            System.out.print("EL ARTCULO TIENE LA ETI ROJA  ");
            String etiqueta = SC.next();

            if (etiqueta.equalsIgnoreCase("SI")) {
                DES += precio;
                COM += precio * 0.8;
            } else {
                DES += precio;
                COM += precio;
            }

            System.out.print("COTINUA CON LA COMPRAS "); 
            respuesta = SC.next();
        } while (respuesta.equalsIgnoreCase("SI"));

        System.out.println("TOTAL DE COMPRA ES DE  : " + DES);
        System.out.println("TOTAL CON LA ETI ROJA  " + COM);
    }

}