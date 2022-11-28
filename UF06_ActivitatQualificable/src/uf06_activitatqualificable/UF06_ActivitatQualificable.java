package uf06_activitatqualificable;

import java.util.Arrays;

/**
 *
 * @author atariket
 */
public class UF06_ActivitatQualificable {


    public static void main(String[] args) {
        
        int numeros_secuencia = 0;
        //Calculo cuantos numeros tiene la secuencia de valores
        for(int i = 1; i <= 10; i++)
        {
            numeros_secuencia += i;
        }
        int Vector[] = new int[numeros_secuencia];
        int pos = 0;        
        //Bucle para cada numero del 1 al 10
        for(int i = 1; i <= 10; i++)
        {
            // Escribo i veces el numero i en la posicion del vector 
            Arrays.fill(Vector, pos, pos + i, i);            
            //Sumo i a la posicion
            pos += i;
        }
        System.out.print("Array:");
        // Muestro todas las posiciones del vector y sus valores
        for (int i = 0; i < Vector.length; i++) {           
            System.out.print(Vector[i] +" " );
        }                                                               
    }
}
