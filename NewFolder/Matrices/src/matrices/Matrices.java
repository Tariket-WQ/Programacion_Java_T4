/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author tariket
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
//        int notes[][] = new int [3][6];
        int notes [][] = {{9,7,8,2,9,10},{0,5,7,8,10,9},{6,4,3,4,1,0}};
        for (int i = 0; i < notes.length; i++) {
            System.out.print("\n Notas de Alumno " + i + ": ");
            for (int j = 0; j < notes[i].length; j++) {
                System.out.print(notes[i][j] + " ");
            }
        }

------------------------ EJERCICIO 1 --------------------------
        int numero = 1;
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = numero++;
                System.out.printf("%-4d", matriz[i][j]);
            }
            System.out.println("");      
        }
------------------------ EJERCICIO 2 --------------------------
 
        int matriz[][] = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("La tabla del " + (i + 1));      
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (i + 1 ) * (j + 1);
                System.out.println( (i + 1) + " x " + (j + 1) + " = " + matriz[i][j]);               
            }          
            System.out.println("");      
        }
------------------------ EJERCICIO 3 --------------------------       
        Scanner read = new Scanner(System.in);
        int n;
        int m;
        int mayores = 0;
        int menores = 0;
        int iguales = 0;

        System.out.println("Introduce numero de filas");
        n = read.nextInt();
        System.out.println("Introduce numero de columnas");
        m = read.nextInt();
        int matriz[][] = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Introduce en el lugar de la Fila : " + (i + 1) + "  Columna: " + (j + 1));
                matriz[i][j] = read.nextInt();

                if (matriz[i][j] < 0) {
                    menores++;
                } else if (matriz[i][j] > 0) {
                    mayores++;
                } else {
                    iguales++;
                }
            }
        }
        System.out.println("");
    
        System.out.println("Hay " + menores + " numeros menores que 0");
        System.out.println("Hay " + mayores + " numeros mayores que 0");
        System.out.println("Hay " + iguales + " numeros iguales a 0");
------------------------ EJERCICIO 4 --------------------------   
        Scanner read = new Scanner(System.in);
        int matriz[][] = new int[4][5];

        for (int i = 0; i < matriz.length; i++) {
            int max = 0;
            int min = 11;
            int media = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Introduce en el lugar de la Fila : " + (i + 1) + "  Columna: " + (j + 1));
                matriz[i][j] = read.nextInt();
                if (max < matriz[i][j]) {
                    max = matriz[i][j];
                }
                if (min > matriz[i][j]) {
                    min = matriz[i][j];
                }
                media += matriz[i][j];
            }
            System.out.println("La nota media del " + (i + 1) + "º alumno " + (media / matriz[0].length));
            System.out.println("La nota maxima del " + (i + 1) + "º alumno " + max);
            System.out.println("La nota minima del " + (i + 1) + "º alumno " + min);
        }*/ 
        Scanner read = new Scanner(System.in);

        System.out.println("Dime el numero de personas");
        int n = read.nextInt();
        int nhombres = 0, nmujeres = 0, sumahombres = 0, sumamujeres = 0;
        int sueldos[][] = new int[n][2];

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                if (j == 0) {
                    System.out.print("Dime el género de la persona (0 para hombre y 1 para mujer) " + (i + 1) + ": ");
                    sueldos[i][j] = read.nextInt();
                }
                if (j == 1) {
                    System.out.print("Dime el sueldo: ");
                    sueldos[i][j] = read.nextInt();
                }
            }
        }

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                System.out.print(sueldos[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i][0] == 0.0) {
                nhombres++;
                sumahombres += sueldos[i][1];
            }
            if (sueldos[i][0] == 1.0) {
                nmujeres++;
                sumamujeres += sueldos[i][1];
            }
        }
        System.out.println("El sueldo medio de los hombres es: " + (sumahombres / nhombres));
        System.out.println("El sueldo medio de las mujeres es: " + (sumamujeres / nmujeres));
    }

}
