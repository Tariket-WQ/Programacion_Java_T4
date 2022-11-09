
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float n1;
        System.out.println("Escribe la nota: ");
        n1 = reader.nextFloat();
        
        if (n1 >=0 || 10 < n1 ){
            System.out.println("Error");
       }else {
            if (n1 >= 0 && n1< 3) {
                System.out.println("Muy Deficiente");}   
            else {
                if (n1 >= 3 && n1< 5 ){
                    System.out.println("Deficiente");}       
                else  {
                 if (n1>=5 && n1 <6 ){
                     System.out.println("Bien");}
                 else {
                    if (n1>=6 && n1 <9) {
                        System.out.println("Notable");
                        }
                    else {
                        if(n1 >=9 && n1 <=10){
                            System.out.println("Excelente");
                       }
                    }
                 }
                }
            }
        }
    } 
}

        
       