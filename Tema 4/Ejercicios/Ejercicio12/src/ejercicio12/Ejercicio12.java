package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n1;
        System.out.println("Escribeme un número ");
        n1 = reader.nextInt();
      
        if (n1>=0){
            System.out.println("Es positivo");
            
        } else {
            System.out.println("Es negativo");
        }

    }
    
}
