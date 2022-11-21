
package entregable05;

/**
 *
 * @author atari
 */

import java.util.Scanner;

public class Entregable05 {


 
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Con que quieres hacer la piramide?");
        System.out.print("1 = Asteriscos / 2 = Cifras :");
        int respuesta = read.nextInt();
        System.out.print("Introduce el numero de filas: ");
        int numFilas = read.nextInt();
        read.close();
        System.out.println();
            // Filas a ser hechas
            for(int altura = 1; altura<=numFilas; altura++){
                //Espacios en blanco entre los asteriscos para hacer la forma de la piramide
                for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                    System.out.print(" ");
                }
                //Imprimimos los Asteriscos
                for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                    if (respuesta == 1) {
                    System.out.print("*");                        
                    } else if ( respuesta == 2) {
                    System.out.print(altura);   
                    }
                }                                
                System.out.println();        
            }  
    } 
}
