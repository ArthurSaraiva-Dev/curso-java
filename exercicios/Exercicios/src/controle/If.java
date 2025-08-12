package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média do aluno:");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 6.0) {
            System.out.println("O aluno está aprovado!");
        }

        if (media < 6 && media >= 4.5) {
            System.out.println("O aluno está em recuperação!");
        }

        if (media < 4.5) {
            System.out.println("O aluno está reprovado!");
        }
        entrada.close();
    }
}
