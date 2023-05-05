package pkg3.pkg10.pkg7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int aFavor = 0;
        int enContra = 0;
        double abstncion = 0;
        System.out.println("*****ENCUESTA*****");
        do {
            System.out.print("NUMEROS DE DISPUTADOS");
            n = sc.nextInt();

        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.println("DISPUTADOS : " + i);

            System.out.println("ESTA A FAVOR");

            System.out.println("SI");
            System.out.print("NO ");

            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("SI")) {
                aFavor++;
            } else if (respuesta.equalsIgnoreCase("NO")) {
                enContra++;
            } else {
                abstncion++;
            }
        }

        System.out.println("Resultados de la encuesta:");
        System.out.println("A favor: " + ((double) aFavor / n) * 100 + "%");
        System.out.println("En contra: " + ((double) enContra / n) * 100 + "%");
        System.out.println("Abstención: " + ((double) abstncion / n) * 100 + "%");
    }
}
