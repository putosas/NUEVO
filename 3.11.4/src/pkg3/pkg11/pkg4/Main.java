
package pkg3.pkg11.pkg4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        double totalVentas = 0;
        int opcion = 0;
        while (2 != opcion) {
            
            
            
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Terminar programa.");
            opcion = scan.nextInt();
            switch (opcion) {
                
                
                
                
                case 1:
                    System.out.println("INGRESE PREOSUPUESTO DEL CLINETE ");
                    double monto = scan.nextDouble();
                    double iva = monto * 0.19;
                    double total = monto + iva;
                    System.out.println("IVA: " + iva);
                    System.out.println("TOTAL A PAGAR ES DE   " + total);
                    System.out.println("CANTIDAD DE RECIBIDAS DE CLIENTES: ");
                    double recibido = scan.nextDouble();
                    double cambio = recibido - total;
                    System.out.println("VUELTO : " + cambio);
                    totalVentas = (totalVentas + total) - cambio;
                    break;
                case 2:
                    System.out.println("TOTAL DE DINERO EN CAJA  =  " + totalVentas);
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
}
