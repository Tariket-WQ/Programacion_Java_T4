
package ejercicios;


import java.util.Scanner;

public class Ejercicios {


    public static void main(String[] args) {
        
        
        Scanner read = new Scanner(System.in);
        double v1[] = new double[10];   
        for (int i = 0; i < v1.length ; i++) {
        System.out.print("Introduce otro numero: ");      
        v1[i] = read.nextDouble();
        } 
        for (int j = 0; j < v1.length ; j++) {
        System.out.print(v1[j] + " ");
        }

    }
    
}
