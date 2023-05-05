package pkg3.pkg12.pkg3;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
   int a,b,suma,producto;
   
        System.out.println("INGRESE PRIMER NUMERO");
        a=sc.nextInt();
        System.out.println("INGRESE SEGUNDO NUMERO ");
        b=sc.nextInt();
        
        
        for (int i = a; i < b; i++) {
            System.out.println("LA SUMA DE LOS NUMERO  ESS "+ (a+b));
            System.out.println("EL PRODUCTO DE LOS NUMERO ES " + (a*b));
          
        }
        
    }
}



        
    



        
    
    

