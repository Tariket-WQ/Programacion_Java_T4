
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float n1;
        System.out.println("Escribeme un número ");
        n1 = reader.nextFloat();
        
         
        Scanner entrada = new Scanner(System.in);
        float n2;
        System.out.println("Escribeme otro número ");
        n2 = reader.nextFloat();
        
        if(n2 == 0){
        System.out.println("La suma da: " + (n1+n2)) ;
        System.out.println("La resta da: "+ (n1-n2));
        System.out.println("La multiplicacion da: "+ (n1*n2));
        System.out.println("La division no se puede hacer elige otro numero");
        
        } else {
        System.out.println("La suma da: " + (n1+n2)) ;
        System.out.println("La resta da: "+ (n1-n2));
        System.out.println("La multiplicacion da: "+ (n1*n2));        
        System.out.println("La division da: "+ (n1/n2));
            
        }

    }
    
}
