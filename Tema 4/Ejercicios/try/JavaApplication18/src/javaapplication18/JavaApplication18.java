/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author tariket
 */
public class JavaApplication18 {

    
public double potencia(int base, int exponente){

        if(base<0)
        {
            int b = base *-1;
            int e= exponente ;

            if(e==0){
                return 1;
            } else if (e<0) {
                return potencia(b, e+1) / b;
            } else {
                return (b * potencia(b, e-1))*-1;
            }
        }
        else
        {
            if(exponente==0){
                return 1;
            } else if (exponente<0) {
                return potencia(base, exponente+1) / base;
            } else {
                return base * potencia(base, exponente-1);
            }
        }
}
}
