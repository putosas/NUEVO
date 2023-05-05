
package procesocinco;

import java.util.Scanner;


public class ProcesoCINCO {

    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int numobreros, pago, horastrab, horasimple, horasdoble, horastriple, pagohora;

        System.out.println("escriba la cantidad de obreros");
        numobreros = scan.nextInt();
        do {
            pago = 0;
            horasimple = 0;
            horasdoble = 0;
            horastriple = 0;
            System.out.println("escribe las horas trabajadas");
            horastrab = scan.nextInt();
            System.out.println("pago por hora");
            pagohora = scan.nextInt();

            if (horastrab <= 40) {
                horasimple = pagohora * horastrab;
            } else {
                System.out.println("horas extras");
                horastrab = horastrab - 40;

                if (horastrab <= 8) {
                    horasdoble = (horastrab) * (pagohora * 2);
                    horasimple = (40 * pagohora);
                } else {
                    horasimple = (40 * pagohora);
                    horasdoble = 8 * (pagohora * 2);
                    horastriple = (horastrab - 8) * (pagohora * 3);

                }
            }
            pago = horasdoble + horastriple + horasimple;
            System.out.println("el sueldo del obrero es: " + pago);

            numobreros--;
        } while (numobreros > 0);
        scan.close();
    }

}
