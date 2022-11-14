
package ejercicios;


import java.util.Scanner;

public class Ejercicios {


    public static void main(String[] args) {
        
       /* 
       Scanner read = new Scanner(System.in);
        double v1[] = new double[10];   
        for (int i = 0; i < v1.length ; i++) {
        System.out.print("Introduce otro numero: ");      
        v1[i] = read.nextDouble();
        } 
        for (int j = 0; j < v1.length ; j++) {
        System.out.print(v1[j] + " ");

        ------------------------------------------------------------
        Scanner read = new Scanner(System.in);
        int v4a[] = new int[5]; // Numeros
        int v4b=0; // Suma de positivos
        int v4c=0; //Suma de negativos

        for (int i = 0; i < v4a.length ; i++) {
            System.out.print("Introduce otro numero: ");      
            v4a[i] = read.nextInt();
            if (v4a[i] > 0 ){
                v4b += v4a[i];  
            } else if (v4a[i] < 0){
                v4c += v4a[i];
            } 
           
        }
        System.out.println("La suma de todos los negativos es: "+v4c);    
        System.out.println("La suma de todos los positivos es: "+v4b);
        ------------------------------------------------------------
        Scanner read = new Scanner(System.in);
        double v5a[] = new double[20]; // Numero que pedimos
        double v5b = 0; // Suma de todos los numeros en el array
        
        for (int i = 0; i < v5a.length ; i++) {
            System.out.print("Introduce otro numero: ");      
            v5a[i] = read.nextDouble();
        } for (int j = 0; j < v5a.length ; j++) {
            v5b += v5a [j];
        }
            System.out.println(v5b / v5a.length); 
        ------------------------------------------------------------
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce la grandaria del vector : "); 
        int v6a = read.nextInt();
        System.out.print("Introduce un numero : "); 
        int v6b = read.nextInt();        
        int v6c[] = new int [v6a];
        for (int i = 0; i < v6a ; i++){
            v6c [i] = v6b;
            System.out.println(v6c[i]);
        }*/
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce P : "); 
        int v7a = read.nextInt();
        System.out.print("Introduce Q : "); 
        int v7b = read.nextInt();
        int v7d = v7b - v7a + 1;
        int[] v7c= new int [v7d];
        for (int i = 0; v7b >= v7a ; i++){
 
            v7c [i] = v7a;
            v7a++;
            System.out.println(v7c[i]);   
        }
    }  
}
