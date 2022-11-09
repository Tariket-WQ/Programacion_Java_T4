
package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {


    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Cual es tu nombre");
    String Nombre ;
    Nombre = reader.nextLine();
    System.out.println("Horas trabajadas?");
    double Horas;
    Horas = reader.nextDouble();
    System.out.println("Precio x hora?");
    double tarifa;
    tarifa = reader.nextDouble();
    double salario;
    double impuesto;
    double Neto;
    if (Horas <=35){
    salario = Horas * tarifa;
    } else {
    salario = 35 * tarifa + (Horas - 35) * tarifa * 1.5 ;
        System.out.println(salario);
    }    
    impuesto = 0;
    
    if(salario>=900) {
    impuesto = (400 * 0.25) + (salario-900) * 0.45;
    } else if (salario >500) {
    impuesto = (salario-500) * 0.25;
    }
    Neto = salario - impuesto;
    
        System.out.println("El salario Neto de "+ Nombre +" es: " + Neto);
    }
}