
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {


    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Escribeme la hora ");
    int h;
    h = reader.nextInt();
    System.out.println("Escribeme los minutos ");
    int m;
    m = reader.nextInt();
    System.out.println("Escribeme los segundos ");
    int s;
    s = reader.nextInt();
    
    if (s<59){
    s++;
    }else{
        s=00;
        m++;
    }
    if(m<59) {} else {
    m = 00;
    h++;
    } if  (h <24){} else {h=00;}
        System.out.println("Son las: " + h + ":" + m + ":" + s );
    }
    
}
