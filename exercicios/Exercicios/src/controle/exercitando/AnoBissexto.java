package controle.exercitando;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        // Exibe se um ano é bissexto ou não

        Scanner entrada = new Scanner(System.in);
        String continuar = "sim";

        do {
            System.out.println("Digite um ano para a verificação: ");

            if (entrada.hasNextInt()) { // verifican se há um inteiro.
                int ano = entrada.nextInt();
                if (ano % 4 == 0 || ano % 400 == 0) {
                    System.out.printf("O ano [%d] é Bissexto\n", ano);
                }else{
                    System.out.printf("O ano [%d] não é bissexto\n", ano);
                }
            }else{
                System.out.println("Entrada Inválida! Por favor, tente novamente");
            }

            entrada.nextLine();

            System.out.println("Deseja continuar? (Digite: Sim ou Não)");
            continuar = entrada.nextLine();
        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("Fim!");
        entrada.close();
    }
}
