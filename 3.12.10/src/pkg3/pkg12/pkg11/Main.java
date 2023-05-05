
package pkg3.pkg12.pkg11;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
            
        Scanner teclado = new Scanner(System.in);
       
        long   a = 0, b = 1, c, n;
       
        System.out.print("SERIE  FIBONACCI");
        
       
        for (int i = 1; i < 100; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            
            
        }
    }
}