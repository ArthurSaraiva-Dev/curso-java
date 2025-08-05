package fundamentos.operadores;

public class logicos {
    public static void main(String[] args) {
        boolean cond1 = true;
        boolean cond2 = 4 > 5;

        System.out.println(cond1 && cond2);
        System.out.println(cond1 || cond2);
        System.out.println(cond1 ^ cond2);
        System.out.println(!cond1);
        System.out.println(!cond2);
        System.out.println(!!cond2);

        // Tabela verdade AND (&&)
        System.out.println("/nTabela verdade &&");
        System.out.println(true && true);
        System.out.println(true && false);
        // System.out.println(false && true);
        // System.out.println(false && false);

        // Tabela Verdade OR (||)
        System.out.println("/nTabela Verdade ||");
        // System.out.println(true || true);
        // System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        
        // Tabela Verdade XOR (^)
        System.out.println("/nTabela Verdade XOR");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
    
        // Tabela Verdade NOT (!)
        System.out.println(!true);
        System.out.println(!false);
    }
}
