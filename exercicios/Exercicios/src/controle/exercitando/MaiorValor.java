package controle.exercitando;

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Recebe 10 valores e imprime o maior entre eles

        int contador = 0;
        int maiorNum = 0;

       
        do {
            System.out.println("Digite um número: ");
            int num = in.nextInt();

            if (num > maiorNum) {
                maiorNum = num;
            }

            contador++;
        } while (contador != 10);

        System.out.printf("O maior número entre os valores digitados foi: %d", maiorNum);

        in.close();
    }
}
