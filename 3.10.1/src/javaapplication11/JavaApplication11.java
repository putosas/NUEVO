package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {

        double precioTotal, descuento, precioFinal;
        int colorBolita;

        for (int i = 1; i <= 50; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("INGRESE EL MONTO TOTAL");
            precioTotal = sc.nextDouble();
            System.out.println("ELIGA COLOR DE LA BOLITA");
            colorBolita = sc.nextInt();

            switch (colorBolita) {
                case 1: // Bolita roja
                    System.out.println("COLOR ROJO ELEGIDO");
                    System.out.println("EL DESCUENTO ES  DE  = " + (precioFinal = precioTotal * 0.04) / 100 + "%");
                    System.out.println("Precio final a pagar: " + precioFinal);
                    break;
                case 2: // Bolita amarilla
                    System.out.println("COLOR AMARILLA ELEGIDO");
                    System.out.println("EL DESCUENTO ES  DE  = " + (precioFinal = precioTotal * 0.25) / 100 + "%");
                    System.out.println("Precio final a pagar: " + precioFinal + "$");
                    break;
                case 3:
                    System.out.println("COLOR BLANCA ELEGIDO");
                    System.out.println("NO APLICA DESCUENTO " + (precioTotal));
                    break;
            }
            System.out.println("************************************");
        }
    }
}
