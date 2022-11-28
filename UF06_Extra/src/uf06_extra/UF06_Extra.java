
package uf06_extra;

import java.util.Random; 
import java.util.Scanner;
import java.util.Arrays;


public class UF06_Extra {

    public static void main(String[] args) {

        int puntuaciones[] = new int[8];
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca las 8 puntuaciones: ");
        
        // Voy añadiendo las puntuaciones a las posiciones del vector
        for(int i = 0; i < puntuaciones.length; i++){
            puntuaciones[i] = entrada.nextInt();
        }      
        
        //Ordeno el array de menor a mayor
        Arrays.sort(puntuaciones);
        
        // Muestro el array invertido de mayor a menor
        System.out.print("Puntuaciones ordenadas de mayor a menor: ");
        for(int i = puntuaciones.length - 1; i >= 0; i--){
            System.out.print(puntuaciones[i] + " ");
        }    
        
    }   
    
}
