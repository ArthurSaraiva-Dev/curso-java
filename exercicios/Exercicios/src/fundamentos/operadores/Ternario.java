package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 8.3;
        String resultParcial = media >= 4.0 ? "Recuperação." : "Reprovado.";
        String result = media >= 6.0 ? "Aprovado." : resultParcial;
        System.out.println("O aluno está: " + result);

        boolean passmedia = media >= 6;
        boolean comportamento = true;
        boolean desconto = comportamento && passmedia;
        String resultDesconto = desconto ? "Sim." : "Não.";
        
        System.out.println("O aluno tem desconto?: " + resultDesconto);
    }
}
