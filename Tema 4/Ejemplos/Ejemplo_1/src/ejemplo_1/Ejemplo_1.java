
package ejemplo_1;

import java.util.Scanner;

public class Ejemplo_1 {



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n1;
        System.out.println("Escribeme un número ");
        n1 = reader.nextInt();
        
         
        Scanner entrada = new Scanner(System.in);
        int n2;
        System.out.println("Escribeme otro número ");
        n2 = reader.nextInt();
        
        System.out.println("La suma da: \n" + (n1+n2)) ;
        System.out.println("La resta da: \n"+ (n1-n2));
        System.out.println("La division da:\n"+ (n1/n2));
        System.out.println("La multiplicacion da:\n"+ (n1*n2));

    }
    
}
