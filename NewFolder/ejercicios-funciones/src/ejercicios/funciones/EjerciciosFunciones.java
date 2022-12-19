/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.funciones;

import java.util.Scanner;

public class EjerciciosFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*        System.out.print("Introduce el primer numero: ");
        double a = read.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        double b = read.nextDouble();
        System.out.println("El resultado es " + multiplica(a, b));
------------------------------------------------------------------------                
        System.out.print("Introduce tu edad: ");
        int edad = read.nextInt();
        if(esMajorEdat(edad)){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }      
------------------------------------------------------------------------        
        System.out.print("Introduce el primer numero: ");
        int a = read.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int b = read.nextInt();
        System.out.println("El minimo es: " + minimo(a,b));
        System.out.print("Introduce un numero: ");
        int a = read.nextInt();
        switch (dimeSigno(a)) {
            case 0:
            System.out.println("Cero");
                break;
            case 1:
                System.out.println("Positivo");
                break;
            case -1:
                System.out.println("Negativo");
                break;
        }
------------------------------------------------------------------------        
        System.out.print("Introduce cuantas millas quieres convertir: ");
        int a = read.nextInt();
        System.out.println("El equivalente a kilometros es: " + millas_a_kilometros(a));
        
        int contador = 0;
        do {
         System.out.print("Precio sin iva: ");
         int a = read.nextInt();
         System.out.println("El precio con iva incluido es: " +precioConIva(a));
         contador++;
        } while (contador != 5 );
------------------------------------------------------------------------        
        System.out.print("Introduce el ancho: ");
        int a = read.nextInt();
        System.out.print("Introduce el alto: ");
        int b = read.nextInt();
        System.out.println("El perimetro es: " + perimetroRectangulo(a, b));
        System.out.println("El area es: " + areaRectangulo(a, b));
------------------------------------------------------------------------      */
        System.out.print("Introduce el N: ");
        int n = read.nextInt();
        System.out.println("El intermedio es: " + intermedio1aN(n));
        System.out.println("La suma es: " + suma1aN(n));
        System.out.println("El producto es: " + producto1aN(n));

    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static boolean esMajorEdat(int edad) {

        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static int minimo(int a, int b) {
        int minimo = 0;
        if (a > b) {
            b = minimo;
        }
        a = minimo;
        return minimo;
    }

    public static int dimeSigno(int a) {
        if (a == 0) {
            return 0;
        } else if (a > 0) {
            return 1;
        } else if (a < 0) {
            return -1;
        }
        return 3;
    }

    public static double millas_a_kilometros(int millas) {
        return millas * 1.60934;
    }

    public static double precioConIva(double precio) {
        return precio * 1.21;
    }

    public static double perimetroRectangulo(double ancho, double alto) {
        return 2 * ancho + 2 * alto;
    }

    public static double areaRectangulo(double ancho, double alto) {
        return ancho * alto;
    }
    
    public static double intermedio1aN(int n) {    
        double intermedio = n+1;
        return intermedio/2 ;     
    }
        public static int suma1aN(int n) {
            int i = 1;
            int suma=0;
            do{
            suma +=i; 
            i++;
            }             
            while (i <= n);
        return suma ;
    }
        public static int producto1aN(int n) {
            int j = 1;
            int multiplicacion = 1;
            do{
            multiplicacion = multiplicacion * j;   
            j++;
            }             
            while (j <= n);
        return multiplicacion ;
    }
    
}
