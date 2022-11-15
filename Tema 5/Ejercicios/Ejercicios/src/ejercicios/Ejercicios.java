
package ejercicios;

import java.util.Random; 
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
        ------------------------------------------------------------
        }
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce P : "); 
        int v7a = read.nextInt(); // Numero Minimo
        System.out.print("Introduce Q : "); 
        int v7b = read.nextInt(); // Numero Maximo
        int v7d = v7b - v7a + 1; // Valor
        int[] v7c= new int [v7d]; // Declaramos Vector
        
        for (int i = 0; v7b >= v7a ; i++){
            v7c [i] = v7a;
            v7a++;
            System.out.println(v7c[i]);
        } 
        ------------------------------------------------------------

        double[] v8a;
        double v8b = 0;
        int v8c = 0;
        v8a = new double [11];
        for (int i = 0; i < 10; i++) {
            v8a [i] = Math.random();
            System.out.printf("%5.3f %n", v8a[i]);

        } 
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce R : ");
        v8b = read.nextDouble();
        for (int i = 0; i <= 10 ; i++){
            if(v8a[i] >= v8b){
               v8c++;
            } 
        }
            System.out.println("Hay "+v8c + " numeros mayores o iguales a " + v8b);
         ------------------------------------------------------------
            
        int[] v9a;
        int v9b = 0;
        v9a = new int [101];
        for (int i = 0; i < 100; i++) {
            v9a [i] = (int) (1 + Math.random()*10);
            System.out.println(v9a[i]);
        } 
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce R : ");
        v9b = read.nextInt();
        for (int i = 0; i <= 100 ; i++){
            if(v9a[i] == v9b){
               System.out.println(i);
            } 
        }
        ------------------------------------------------------------
*/
        Scanner read = new Scanner(System.in);
        System.out.print("Introduce valor N : ");
        double v10a[] = new double[read.nextInt()];
        for (int i = 0; i < v10a.length ; i++){
            System.out.print("Introduce altura ");
            v10a[i] = read.nextDouble();
        }
        double max=v10a[0], min=max, suma=min;
        int altos=0, bajos= 0;
        for (int i = 1; i < v10a.length; i++) {
//            if (v10a[i]>v10a[i+1]) {
//                max=v10a[i];
//            } else {
//                max=v10a[i+1];
//            }
            max=Math.max(v10a[i], max);
            min=Math.min(v10a[i], min);
            suma += v10a[i];
        }
        for (int i = 0; i < v10a.length; i++) {
            if (v10a[i] > suma/v10a.length) {
            altos++;
            } else{
                bajos++;
            } 
        }
        
            
        
        
        System.out.println("La media es " + suma / v10a.length);
        System.out.println("El mayor es "+max + " y el menor es " + min);
        System.out.println("El numero de gente por encima de la media es "+altos + " y la de por debajo es " + bajos);
    }  
}
