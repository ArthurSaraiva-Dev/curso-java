package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 6.7;
        System.out.println(a);
        
        a = 36;
        System.out.println(a);
        
        var b = 5.4;
        System.out.println(b);

        var c = "bla bla bla1";
        System.out.println(c);

        c = "bra bra bra2";
        System.out.println(c);
        // c = 4.5; está incorreto, pois o java não converte o tipo da variável

        double d; // variável declarada
        d = 437.79; // variável iniciada
        System.out.println(d); // print

        /* 
         * var e;
         * e = 123;
         * ESTÁ INCORRETO.
        */
    }
}
