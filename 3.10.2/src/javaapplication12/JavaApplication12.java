package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {

    public static void main(String[] args) {

        double totalCompra = 0.0;
        boolean seguirComprando = true;

        Scanner scanner = new Scanner(System.in);

        while (seguirComprando) {
            System.out.print("Ingrese el precio del articulo: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad de artículos que ha tomado: ");
            int cantidad = scanner.nextInt();

            double costoTotal = precio * cantidad;
            totalCompra += costoTotal;

            System.out.print("¿Desea continuar comprando? (s/n): ");
            String respuesta = scanner.next();

            if (respuesta.equals("n")) {
                seguirComprando = false;
            }
        }

        System.out.println("El total de sus compras es: $" + totalCompra);
        scanner.close();
    }
}
