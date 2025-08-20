package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a nota do aluno");
        double nota = entrada.nextDouble();

        switch (nota) {
            case nota >= 9:
                System.out.println("Aluno nota A!");
                break;
            case nota <= 9 && nota > 8:
                System.out.println("Aluno nota B!");
                break;
            case nota <= 8 && nota >= 6.5:
                System.out.println("Aluno nota C!");
                break;
            case nota <= 6.5 && nota >= 5:
                System.out.println("Aluno nota D!");
                break;
            case nota <= 4.5 && nota >= 3.5:
                System.out.println("Aluno em recuperação");
                break;
            case nota < 3:
                System.out.println("Aluno Reprovado.");
            default:
                System.out.println("Nota Inválida!!");
                break;
        }

        entrada.close();
    }
}
