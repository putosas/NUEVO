package pkg3.pkg12.pkg9;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int A1, A2, MCD = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO ");
        A1 = sc.nextInt();
        System.out.println("INGRESE OTRO NUMERO");
        A2 = sc.nextInt();

        for (int i = 1; i <= MCD; i++) {
            if (A1 % i == 0 && A2 % i == 0) {
                MCD = i;
            }
        }
        if (A1 % 2 == 0) {
            int r = 1;
            while (r != 0) {
                r = A1 % A2;
                A1 = A2;
                A2 = r;
            }
            System.out.println("     MAXIMO DIVISOR ES     " + A1);
        } else {
            System.out.println("EL NUMERO DEBE SER PAR");
        }
    }
}
