
package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float n1;
        System.out.println("Escribeme el precio descontado: ");
        n1 = reader.nextFloat();
                 
        Scanner entrada = new Scanner(System.in);
        float n2;
        System.out.println("Escribeme otro sin descuento ");
        n2 = reader.nextFloat();

        float porcentaje = n1*100/n2;
        System.out.println("El descuento aplicado es " + (100-porcentaje) + "%");
    }
    
}

        
       
