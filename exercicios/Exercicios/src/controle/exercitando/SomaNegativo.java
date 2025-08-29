package controle.exercitando;

import java.util.Scanner;

public class SomaNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numIn = 0;
        int soma = 0;

        while (numIn >= 0) {
            System.out.println("Digite inteiros posistivo para soma-los, para sair, digite um negativo.");
            numIn = entrada.nextInt();

            if (numIn >= 0) {
                soma += numIn;
                System.out.printf("Soma até então: %d\n", soma);
            }
        }

        System.out.println("Fim!");
        
        
        entrada.close();
    }
}
