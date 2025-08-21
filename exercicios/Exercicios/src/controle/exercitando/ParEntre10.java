package controle.exercitando;

import java.util.Scanner;

public class ParEntre10 {
    public static void main(String[] args) {
        // Verificar se um núemero está entre 0 e 10 e se é par
        Scanner entrada = new Scanner(System.in);
        String continuar = "sim";
        
        do {
            System.out.println("Digite um número par entre 0 e 10");
            int num = entrada.nextInt();
         
            if (num >= 0 && num <= 10 && num % 2 == 0) {
                System.out.printf("O seu número [%d] é par e está entre 0 e 10.", num);
            }else if (num % 2 == 1) {
                System.out.printf("O número [%d] é ímpar", num);   
            }else if (!(num >= 0 && num <= 10)) {
                System.out.printf("O número [%d] não está no range de 0 a 10.", num);
            }

            entrada.nextLine(); // Consome a quebra de linha

            System.out.println("\nDeseja Continuar? (Digite: Sim ou Não)");
            continuar = entrada.nextLine();


        } while (continuar.equalsIgnoreCase("sim"));
        
        System.out.println("Fim!");

        entrada.close();
    }
}
