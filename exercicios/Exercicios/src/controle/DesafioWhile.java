package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        //calcular a média das notas de uma turma
        // verificar nota válida
        // armazenar o valor da nota em um "total"
        // armazenar o número de notas adicionadas
        // o programa acaba quando o usuário digitar -1
        
        Scanner entrada = new Scanner(System.in);
        
        int numeroNotas = 0;
        double total = 0;
        double nota = 0;

        while (nota != -1) {
            System.out.print("Digite a nota do aluno (OU -1 para sair): ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                total += nota;
                numeroNotas++;
            } else if(nota != -1){
                System.out.println("NOTA INVÁLIDA!");
            }
        }

        // Calculando a média
        double media = total / numeroNotas;
        System.out.printf("A média da turma é: %.2f", media);

        entrada.close();
    }
}
