
package strings;

import java.util.Random; 
import java.util.Scanner;
import java.util.Arrays;

public class Strings {

 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dime una cadena: ");
        String cadena1 = in.nextLine();
        System.out.print("Dime otra cadena: ");
        String cadena2 = in.nextLine();
        if(cadena1.equals(cadena2)){
            System.out.println("Son exactamente iguals");
        }
            else if( cadena1.equalsIgnoreCase(cadena2)){
                    System.out.println("Son iguals");
            } else {               
                System.out.println("No son iguals");
            }
        
    }
    
}
