package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 120;
        int b = 43;

        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

        //Ex
        double nota = 8.9;
        boolean media = nota >= 6;
        boolean comportamento = true;
        boolean desconto = comportamento && media;
        
        System.out.println("O aluno tem desconto?: " + desconto);

    }
}
