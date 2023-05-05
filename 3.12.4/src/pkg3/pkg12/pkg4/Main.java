package pkg3.pkg12.pkg4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el multiplicando: ");
        int multiplicando = scanner.nextInt();

        System.out.print("Ingrese el multiplicador maximo: ");
        int MUL = scanner.nextInt();

        for (int i = 0; i <= MUL; i++) {
            int producto = multiplicando * i;
            System.out.println(multiplicando + " * " + i + " = " + producto);
        }
    }
}

        
    


