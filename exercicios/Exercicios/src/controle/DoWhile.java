package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // do sentença; ou {}
        Scanner entrada = new Scanner(System.in);
        
        String text = "";
        
        do{
            System.out.println("Diga as palavras mágicas");
            System.out.print("Quer sair?");
            text = entrada.nextLine();
        }while(!text.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado por dizer as palavras mágicas.");
        entrada.close();
    }
}
