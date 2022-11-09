
package ejercicios;

import java.util.Scanner;

public class Ejercicios {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


/*
        int numFilas;
       try ( 
       int contador=1;
       while (contador <=20) {
       System.out.print(contador + " ");
       contador++;
       }
       System.out.print("\n");
       int i;
       for (i=1; i<=20; i++ ) {
       System.out.print(i + " ");
       }
       System.out.print("\n");
       int contador2 = 1;
       do {
       System.out.print(contador2 + " ");
       contador2++;
       } while (contador2<=20);
       System.out.print("\n");
       int cont;
       int par = 0;
       int impar = 0;
       for (cont=100; cont<=200; cont++) {
       if (cont % 2 == 0) {
       par = par + cont;
       } else {
       impar = impar + cont;
       }
       }
       System.out.println("La suma de los numeros pares es: " + par);
       System.out.println("La suma de los numeros impares es: " + impar);
       System.out.println("Factorial de: ");
       float n1;
       n1 = reader.nextFloat();
       float fact = 1;
       while (n1 > 1) {
       fact = fact * n1;
       n1--;
       }
       System.out.println("El factorial es: " + fact);
       int contador7;
       int positivo7 = 0, negativo7 = 0;
       for (contador7=1; contador7<=10; contador7++) {
       System.out.println("¿Qué numero quieres?");
       int n7 = reader.nextInt();
       if (n7 >= 0) {
       positivo7++;
       } else {
       negativo7++;
       }
       }
       System.out.println("Hay " + positivo7 + " numeros positivos");
       System.out.println("Hay " + negativo7 + " numeros negativos");
       int contador8;
       int positivo8 = 0, negativo8 = 0;
       for (contador8=1; contador8<=10; contador8++) {
       System.out.println("¿Qué numero quieres?");
       int n8 = reader.nextInt();
       if (n8 == 0); {
       if (n8 >= 0) {
       positivo8++;
       } else {
       negativo8++;
       }
       }
       }
       if (negativo8 > 0) {
       System.out.println("Si que hay negativos");
       }
       System.out.println("Hay " + positivo8 + " numeros positivos");
       System.out.println("Hay " + negativo8 + " numeros negativos");
       System.out.println("Dime el valor de A");
       int n12a = reader.nextInt();
       System.out.println("Dime el valor de B");
       int n12b = reader.nextInt();
       double potencia = 1;
       while (n12b > 0) {
       potencia = potencia * n12a;
       n12b--;
       }
       while (n12b < 0) {
       potencia = potencia / n12a;
       n12b++;
       }
       System.out.println("El resultado de la potencia es " + potencia);
       boolean seguir13 = true;
       int analizado13 = 0, min13 = 1, max13 = 100;
       while (seguir13) {
       int num13 = (max13 + min13) / 2;
       if (num13 == analizado13) {
       num13++;
       }
       System.out.println("El numero que has pensado es  >, < o = que " + num13 + "?");
       String respuesta13 = reader.nextLine();
       switch (respuesta13) {
       case ">":
       min13 = num13;
       analizado13 = num13;
       break;
       case "<":
       max13 = num13;
       analizado13 = num13;
       break;
       case "=":
       seguir13 = false;
       System.out.println("Adivinado");
       break;
       }
       }
       System.out.print("Dime un número: ");
       int n15 = reader.nextInt();
       int multiplo = 0;
       while (n15 >= 3) {
       if (n15 % 3 == 0) {
       multiplo++;
       n15 = n15 -3;
       }
       }
       if (multiplo == 0) {
       System.out.println("No tiene multiplos");
       } else {
       System.out.println("Cantidad de múltiplos de 3: " + multiplo);
       }
       int i;
       int n16 = -1;
       boolean primo = false;
       while (n16 < 0) {
       System.out.print("Dime un número: ");
       n16 = reader.nextInt();
       }
       for (i=2; i<n16; i++) {
       if (n16 % i == 0) {
       primo = true;
       }
       }
       if (primo == false) {
       System.out.println("Es primo");
       } else {
       System.out.println("No es primo");
       }
       int i = 0;
       int j = 0;
       int n17a = 0 ;
       int n17b = 0 ;
       System.out.print("Dime un número inicial: ");
       n17a = reader.nextInt();
       n17b = n17a;
       while (n17b != 0){
       System.out.print("Dime un número: ");
       n17b = reader.nextInt();
       if (n17b > n17a){
       i++;
       }
       else {
       if(n17b != 0){
       j++;
       System.out.println("Fallo");
       }
       }
       n17a = n17b;
       }
       System.out.println("Total de números introducidos: " + i);
       System.out.println("Números fallados: " + j);
        
        Scanner sc = new Scanner(System.in)) {
           System.out.print("Introduzca numero de filas: ");
           numFilas = sc.nextInt();
       }
          
           
        
    
System.out.print("Dime un número: ");
        int n19 = reader.nextInt();
        int cont19 = 0;
        if (n19 > 0) {
            while (n19 > cont19) {
                System.out.print("* ");
                cont19++;
            }
        } else {
            System.out.println("* ");
        }
        

        System.out.print("Dime un número: ");
        int n20 = reader.nextInt();
        for (int i=1; n20>=i; i++) {  
            for (int cont20=1; cont20<=i; cont20++) {
                    System.out.print(i);
                }
            System.out.println();
        }
        
        
        System.out.print("Dime un número: ");
        int minimo = reader.nextInt();
        System.out.print("Dime un número mayor al anterior: ");
        int maximo = reader.nextInt();
        int cont = 0;
        if(minimo < maximo ){
            for (; minimo <= maximo; minimo++) {
                System.out.println(minimo);
                if (minimo % 2 == 0){
                cont++;
                }
                        
            }
            
        }
        System.out.println("La cantidad de parejos son: " + cont);
     */
    }
        
}
     
    

