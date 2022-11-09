
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 /*       System.out.println("Dame el valor de A");
            int a = reader.nextInt();
        System.out.println("Dame el valor de B");
            int b = reader.nextInt();
            double elevado = 1;
        
        
        while (b > 0) {
            elevado = elevado * a;
            b--;
        } 
         while (b < 0) {
            elevado = elevado / a;
            b++;
        }
        System.out.println( "El resultado es " + elevado);*/
 
 boolean seguir = true;
 int max = 100;
 int min = 1;
 int analizados = 0;
 int num=0;
 while (seguir){
     num = (max+min)/2;
     if (num==analizados){num++;}
 
        System.out.println("El numero pensado es > , < o = que " + num + "?");
        String respuesta = reader.nextLine();
        
        switch(respuesta) {
  case "<":
      max = num;
      analizados = num;
    break;
  case ">":
      min = num;
      analizados = num;
      break;
  case "=":
      seguir = false;
              System.out.println("Acertado tu numero es el "+ respuesta);
      break;
  default:
      System.out.println("ERROR, RETRASADO ESCRIBE BIEN");
        }
                     }
    }
}
    