package controle.exercitando;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("[--- Digite um número e verifique se é Primo ---]");
        int num = entrada.nextInt();
        
        int contador = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }

        if (contador == 0) {
            System.out.printf("O número [%d] é primo", num);
        }else{
            System.out.printf("O número [%d] não é primo", num);
        }

        
        entrada.close();
    }
}
