/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.holamundo;
import  java.util.Scanner;
/**
 *
 * @author tariket
 */
public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        int x=5;
        boolean resultat = ++x>=6;
        System.out.println(resultat);
        System.out.println(x);
    
        int nDec=24;
        int nOct=024;
        int nHex=0x24;
       
        System.out.println(nDec + "." + nOct + "." + nHex);
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre);
    }    
   
    
}
