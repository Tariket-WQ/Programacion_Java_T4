/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

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

*/
        int numero = 1;
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = numero++;
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println("");

        
    }
    }
    
}
