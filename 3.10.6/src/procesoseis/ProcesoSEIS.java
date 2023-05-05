
package procesoseis;

import java.util.Scanner;


public class ProcesoSEIS {

    
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int numgallinas, i, precio = 0;
        double calidad, pesogallina, alturagallina, numhuevos, caltotal = 0, promedioc;
        i = 1;

        System.out.println("escriba el numero de gallinas");
        numgallinas = scan.nextInt();

        do {

            System.out.println("gallina " + (i++));

            System.out.println("escriba el peso de la gallina");
            pesogallina = scan.nextDouble();
            System.out.println("escriba la altura de la gallina");
            alturagallina = scan.nextDouble();
            System.out.println("escribe el numero de huevos que pone");
            numhuevos = scan.nextDouble();

            calidad = (pesogallina * alturagallina) / numhuevos;

            System.out.println("la calidad de la gallina sera: " + calidad);

            caltotal = caltotal + calidad;
            numgallinas--;

        } while (numgallinas != 0);

        promedioc = caltotal / i;
        if (promedioc >= 15) {
            precio = (int) (1.2 * promedioc);
        } else if (promedioc > 8 & promedioc < 15) {
            precio = (int) (1 * promedioc);
        } else if (promedioc <= 8) {
            precio = (int) (0.8 * promedioc);
        }

        System.out.println("el precio por kilo de huevos es de: " + precio);

        scan.close();
    }

}
