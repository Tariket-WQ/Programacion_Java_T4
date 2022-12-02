
package palindromo;

import java.util.Scanner;


public class Palindromo {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String frase;
        boolean palindromo = true;
        
        System.out.print("Introduce una frase: ");

        frase = read.nextLine();
        frase = frase.replace(" ", "");
        frase = frase.toUpperCase();
        int fin = frase.length();

        for (int i = 0; i < fin && palindromo; i++) {

            if (frase.charAt(i) != frase.charAt((fin - 1) - i)) {
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("La frase es palindromo");
        } else {
            System.out.println("La frase no es palindromo");
        }

    }
}
