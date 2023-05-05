
package javaapplication14;

import java.util.Scanner;


public class JavaApplication14 {

    
    public static void main(String[] args) {
        int edad;
        int sillas;
        double precioAsiento = 100.0;
        int numClientes = 0;
        double descuentoNinos = 0.0;
        double descuentoJovenes = 0.0;
        double descuentoAdultos = 0.0;
        double descuentoTerceraEdad = 0.0;
        double precioEntrada =0.0;
        
        
   Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE LA EDAD ");
        edad=sc.nextInt();
        
        System.out.println("INGRESE PRECIO DE LOS ASIENTOS ");
        sillas=sc.nextInt();
        
        
        
        
       
          if (edad < 5) {
                System.out.println("NIÑOS MENORES A 5 AÑOS NO PUEDEN INGRESAR");
            } else 
              
            if (edad>=5 && edad <=14) {
                System.out.println("aplica 35");
              precioEntrada = edad*0.35;
                
                System.out.println("TOTAL"+precioAsiento);
            } else if (edad < 65) {
                descuentoJovenes += precioAsiento - precioEntrada;
            } else {
                precioEntrada *= 0.75;
                descuentoTerceraEdad += precioAsiento - precioEntrada;
            }
        }

        }

    



    

