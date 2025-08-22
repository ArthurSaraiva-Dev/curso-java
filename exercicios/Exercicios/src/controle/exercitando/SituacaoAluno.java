package controle.exercitando;

import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("[--- Digite a primeira nota do aluno ---]");
        double nota1 = entrada.nextDouble();

        System.out.println("[--- Digite a segunda nota do aluno ---]");
        double nota2 = entrada.nextDouble();

        double media = nota1 + nota2 / 2;

        if (media >= 7.0) {
            System.out.println("Aprovado!");
        }else if (media < 7.0 && media >= 4.0) {
            System.out.println("Em recuperação!");
        }else{
            System.out.println("Reprovado!");
        }

        entrada.close();
    }
}
