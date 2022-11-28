
package practicando;

import java.util.Random; 
import java.util.Scanner;
import java.util.Arrays;

public class Practicando {


    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce caracteres: ");
    String cadena1 = in.nextLine();
    char caracter= cadena1.charAt(0);
    
        // Mientras la respuesta sea diferente de espacio
        while (!cadena1.equals(" ")){
            
            // Paso el string a caracter y a mayuscula            
            caracter = cadena1.toUpperCase().charAt(0);
                if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                System.out.println("Vocal");
                } else {
                System.out.println("No Vocal");
                cadena1 = " ";
                
            
                }           
        System.out.print("Introduce caracteres: ");
        cadena1 = in.nextLine();
        caracter= cadena1.charAt(0);                
        } 
    }    
}

