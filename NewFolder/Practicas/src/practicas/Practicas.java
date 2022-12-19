
package practicas;

public class Practicas {

    /**
     * @param v
     * @return 
     */
    public static void main(String[] args) {

        System.out.println(suma(56,80));
        System.out.println(parinpar(6));
    }
    /*  int [] v= {5,2,0,4,5,1};
        int suma= 0;
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
           System.out.println(suma);

           
           for(int a : v)
        System.out.println(a);
    }*/


        public static int suma(int a, int b) {       
        return a+b;
        }
        
        public static String parinpar(int num) {
        if (num % 2 == 0) {
        return "par";
        } else {
        return "inpar";
        }
}
        
}