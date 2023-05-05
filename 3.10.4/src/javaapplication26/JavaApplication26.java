
package javaapplication26;

import java.util.Scanner;


public class JavaApplication26 {

 
    public static void main(String[] args) {
        
        double v, p, t, masa, masa2;
        int vehiculos;

        Scanner sc = new Scanner(System.in);
        System.out.println("TIPO DE VEHICULOS");
        System.out.println("1.MOTO");
        System.out.println("2.CARRO");

        System.out.println("*******************");
        masa = 0;
        masa2 = 0;
        do {
            System.out.println("INGRESE SELECCIONES SU VEHICULO");
           
            vehiculos=sc.nextInt();
            switch (vehiculos) {
                case 1:
                                    System.out.println("****MOTOS*******");
                System.out.println("INGRESE PRECION");
                p = sc.nextDouble();
                System.out.println("INGRESE VOLUMEN");
                v = sc.nextDouble();
                System.out.println("INGRESE TEMPERATURA");
                t = sc.nextDouble();
                masa = (p * v) / (0.37 * (t + 460));
                System.out.println("la masa es " + masa);
                    break;
               
                case 2: 
                                    System.out.println("*****CARROS******");
                System.out.println("INGRESE PRECION");
                p = sc.nextDouble();
                System.out.println("INGRESE VOLUMEN");
                v = sc.nextDouble();
                System.out.println("INGRESE TEMPERATURA");
                t = sc.nextDouble();
                masa = (p * v) / (0.37 * (t + 460));
                System.out.println("la masa es " + masa);
                    break;
                     default:
                         System.out.println("ERROR");
            }
           


masa2=(masa2+masa)/2;
            System.out.println("EL PROMEDIO ES " + masa2);
            System.out.println("***************************");
        } while (vehiculos == 1 || vehiculos == 2 );
    }

}
