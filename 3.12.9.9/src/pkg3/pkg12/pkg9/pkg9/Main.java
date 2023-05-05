package pkg3.pkg12.pkg9.pkg9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int A1, A2, MCD = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO ");
        A1 = sc.nextInt();
        System.out.println("INGRESE OTRO NUMERO");
        A2 = sc.nextInt();
int min=Math.min(A1, A2);
        for (int i = 1; i <= min; i++) {
            if (A1 % i == 0 && A2 % i == 0) {
                MCD = i;
                MCD = (A1 * A2) / MCD;
            }
        }
        if (A2 % 2 !=0) {
            System.out.println("MAXIMO DIVISOR ES " + A1 + " Y  " + A2 + " = " + MCD);

        } else {
            System.out.println("DEBE SER IMPAR" );
        }
    }
}
