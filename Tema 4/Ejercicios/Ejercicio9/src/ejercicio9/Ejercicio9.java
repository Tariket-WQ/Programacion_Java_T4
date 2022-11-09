
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n1;
        System.out.println("Escribeme tu edad ");
        n1 = reader.nextInt();
      
        if (n1>=18){
            System.out.println("Es mayor de edad");
            
        } else {
            System.out.println("Es menor de edad");
        }
    }
    
}
