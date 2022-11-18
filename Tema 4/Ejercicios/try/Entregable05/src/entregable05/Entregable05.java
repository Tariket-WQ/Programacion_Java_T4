
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
        int numero = 1;
        System.out.println();
        if (respuesta == 1 ) {
            // Filas a ser hechas
            for(int altura = 1; altura<=numFilas; altura++){
                //Espacios en blanco entre los asteriscos para hacer la forma de la piramide
                for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                    System.out.print(" ");
                }
                
                //Imprimimos los Asteriscos
                for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                    System.out.print("*");
                }
                
                // Salto de linea entre filas
                System.out.println();
            }
        } else {
            if (respuesta == 2);{
            
                // Filas a ser hechas y modificamos numero para que cada fila incremente en 1 respecto a la anterior
                for(int altura = 1; altura<=numFilas; altura++ , numero++){
                    //Espacios en blanco entre los numeros para hacer la forma de la piramide
                    for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                        System.out.print(" ");
                    }
 
                    // Imprimimos los Numeros
                    for(int cifras=1; cifras<=(altura*2)-1; cifras++){
                    System.out.print(numero);   
                    }
            
                    // Salto de linea entre filas
                    System.out.println();
                }           
            }  
        } 
    }
}
