package controle.exercitando;

import java.util.Scanner;

public class NumeroPrimoComSwitch {
    public static void main(String[] args) {
        // Refatoração do Exercício "Número Primo" utilizando Switch
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        System.out.println("[--- Digite um número para verificar se o mesmo é Primo ---]");
        int num = entrada.nextInt();
        
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }

        System.out.printf("debug contador = %d\n", contador); // Uma forma de entender melhor o código.

        switch (contador) {
            case 0:
                System.out.printf("O número [%d] é primo", num);
                break;
        
            default:
                System.out.printf("O número [%d] não é primo", num);
                break;
        }

        entrada.close();
    }
}
