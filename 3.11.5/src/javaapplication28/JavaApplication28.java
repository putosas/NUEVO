
package javaapplication28;

import java.util.Scanner;


public class JavaApplication28 {

    public static void main(String[] args) {
   

        Scanner input = new Scanner(System.in);

        double VENT = 0;
        double IVA = 0;
        double TP = 0;
        double TCJ = 0;
        double iva;
        double total;
        String respuesta;

        do {
            System.out.print("INGRES PREOSUPESTO DE VENTA  ");
            double montoVenta = input.nextDouble();

             iva = montoVenta * 0.13;
            total = montoVenta + iva;
            VENT += montoVenta;
            IVA += iva;
            TP += total;

            System.out.println("TOTAL DE VENTA : " + montoVenta);
            System.out.println("IVA: " + iva);
            System.out.println("TOTAL A CANCELAR  " + total);

            double cantidad = 0;
            do {
                System.out.print("INGRESE CANTIDAD OBTENIDA DEL CLIENTE   ");
                cantidad = input.nextDouble();
                if (cantidad < total) {
                    System.out.println("INSUFIENTE EL PAGO  ");
                    System.out.println("TOTAL DE PAGAR"+   total);
                    System.out.println("****************************");
                }
            } while (cantidad < total);

            double cambio = cantidad - total;
            TCJ += total;

            System.out.println("Cambio: " + cambio);

            System.out.print("NUEVO CLIENTE   ");
            System.out.println("SI  :    NO ");
            respuesta = input.next();
        } while (respuesta.equalsIgnoreCase("SI"));

        System.out.println("TOTAL DE VENTA  : " + VENT);
        System.out.println("TOTAL DEL IVA " + IVA);
        System.out.println("TOTAL EN CAJA  " + TCJ);
    }

}

    
    

