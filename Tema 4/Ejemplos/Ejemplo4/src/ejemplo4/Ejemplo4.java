package ejemplo4;

import java.util.Scanner;

public class Ejemplo4 {


    public static void main(String[] args) {
    int par = 0;
    int impar = 0;
    int cont;
    
    for (cont=100; cont<=200; cont++){
        if (cont % 2 == 0) {
            par += cont;
        } else {
            impar += cont;
        }
    }
    System.out.println("La suma de los pares es: " + par);
    System.out.println("La suma de los impares es: " + impar);
    }
}