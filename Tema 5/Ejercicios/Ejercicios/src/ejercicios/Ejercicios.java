
package ejercicios;

import java.util.Random; 
import java.util.Scanner;
import java.util.Arrays;

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

        Scanner read = new Scanner(System.in);
        System.out.print("Introduce valor N : ");
        double v10a[] = new double[read.nextInt()];
        for (int i = 0; i < v10a.length ; i++){
            System.out.print("Introduce altura ");
            v10a[i] = read.nextDouble();
        }
        double max=v10a[0], min=max, suma=0;
        int altos=0, bajos= 0;
        for (int i = 0; i < v10a.length; i++) {
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
        ------------------------------------------------------------

   
        int v11a[] = new int[100];
        int v11b[] = new int[100];
        System.out.print("Primer vector: ");
        for (int i = 0; i < v11a.length ; i++){
            v11a[i]= i +1;
            System.out.print(v11a[i]+" ");
        } System.out.println();
        System.out.print("Segundo vector: ");
        for (int i = 0; i < v11b.length; i++) {
            v11b[i]= v11a[99-i];
            System.out.print(v11b[i] + " ");
        }
        ------------------------------------------------------------

        Scanner read = new Scanner(System.in);
        int v12a[] = new int[10];
        boolean salir = false ;
        
        
        System.out.println("MENU PRINCIPAL");
        System.out.println("a.  Mostrar valors ");
        System.out.println("b. Introduir valor ");
        System.out.println("c.  Eixir ");
        
        System.out.println();
        
        System.out.println("Elige opcion: ");
        String respuesta = read.nextLine();
        
        switch ( respuesta) {
                case "a" -> {
                    for (int i = 0; i < v12a.length ; i++ ){
                        System.out.print(v12a[i]+" ");
                    } System.out.println();
                }
                case "b" -> salir = false;
                case "c" -> salir = true;
        }
        ------------------------------------------------------------
        // Ejercicio 13
        Scanner read = new Scanner(System.in);
        System.out.print("Dime cuantos numeros quieres ver: ");
        int numero = read.nextInt();
        int Vector[] = new int[numero];
        System.out.print("Dime numero inicial: ");
        int numero_inicial = read.nextInt();
        System.out.print("Dime cuanto quieres incrementar: ");
        int incremento = read.nextInt();
        
            for (int i = 0; i < Vector.length; i++) {           
            Vector[i] = numero_inicial+incremento*i;
            }
            for (int i = 0; i < Vector.length; i++) {           
            System.out.println(Vector[i]);
            }
        ------------------------------------------------------------
         // Ejercicio 14
        Scanner read = new Scanner(System.in);
        System.out.print("Dime N: ");
        int N = read.nextInt();
        int Vector[] = new int[N];
        System.out.print("Dime M: ");
        int M = read.nextInt();
        Arrays.fill(Vector, M);
        System.out.println(Arrays.toString(Vector));
        ------------------------------------------------------------
         // Ejercicio 16
        Scanner read = new Scanner(System.in);
        System.out.print("Dime 20 numeros: ");
        int Vector[] = new int[10];
        int Vector2[] = new int[10];
        for (int i = 0; i < 20; i++) {
            int N  = read.nextInt();
            
            if (i <10 ) {            
            Vector[i] += N;   
            } else {
            Vector2[i-10] +=N;
            }
        }
        System.out.println(Arrays.toString (Vector)  + "\n" + Arrays.toString(Vector2));      
        
        if (Arrays.equals(Vector, Vector2)) {
            System.out.println("Son iguales");
        } else{
            System.out.println("No son iguales");
        }
        ------------------------------------------------------------
        
        Scanner read = new Scanner(System.in);
        System.out.print("Dime una frase: ");
        String frase = read.nextLine();
        frase = frase.toLowerCase();
        int A=0;
        int E=0;
        int I=0;
        int O=0;
        int U=0;
        
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) { 
                case 'a':              
                A++;
                break;
               case 'e':
               E++;
               break;
               case 'i':
               I++;
               break;
               case 'o':
               O++;
               break;
               case 'u':
               U++;
               break;
            default:
                break;   
            }
        }
        System.out.println("Hay " + A + " A's");
        System.out.println("Hay " + E + " E's");
        System.out.println("Hay " + I + " I's");
        System.out.println("Hay " + O + " O's" );
        System.out.println("Hay " + U + " U's");
        ------------------------------------------------------------
        */       
    }  
}

