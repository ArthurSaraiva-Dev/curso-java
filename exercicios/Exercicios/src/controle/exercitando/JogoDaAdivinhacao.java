package controle.exercitando;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        
        int tentativas;
        int tentativasRestantes;
        int numDigitado;
        int numSorteado;
        String continuarJogando;

        Scanner in = new Scanner(System.in);
        
        do {
            System.out.println("[--- Sorteando o Número ---]");
            Random numAleatorio = new Random();
            numSorteado = numAleatorio.nextInt(101);

            System.out.println("[--- O JOGO COMEÇOU! ---]");
            tentativas = 0;
            tentativasRestantes = 10;

            do {
                tentativas++;
                tentativasRestantes--;

                System.out.println("Digite e tente a sorte:");
                numDigitado = in.nextInt();

                if (numDigitado < numSorteado) {
                    System.out.printf("O número digitado [%d] é menor que o sorteado. Você tem %d tentativas!\n", numDigitado, tentativasRestantes);
                } else if(numDigitado > numSorteado){
                    System.out.printf("O número digitado [%d] é maior que o sorteado. Você tem %d tentativas!\n", numDigitado, tentativasRestantes);
                }else{
                    System.out.printf("PARABÉNS!! \n VOCÊ ACERTOU NO NÚMERO EM %d TENTATIVAS\n", tentativas);
                    break;
                }

            } while (tentativas != 10);

            in.nextLine();

            System.out.println("Deseja continuar jogando? (s/n)");
            continuarJogando = in.nextLine();
        } while (continuarJogando.equalsIgnoreCase("s"));

        System.out.println("Fim.");
        in.close();
    }
}
