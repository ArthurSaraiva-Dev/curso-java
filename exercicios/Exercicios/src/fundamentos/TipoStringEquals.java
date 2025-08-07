package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("7" == "7");
        
        String x = new String("2");
        System.out.println("2" == x);
        System.out.println("2".equals(x));

        Scanner entrada = new Scanner(System.in);
        
        String s2 = entrada.nextLine();
        System.out.println("2" == s2.trim()); //false
        System.out.println("2".equals(s2.trim())); // true
 
        entrada.close();
    }
}
