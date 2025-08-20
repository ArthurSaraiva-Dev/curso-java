package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite oque quiser: ");
        String digitado = entrada.nextLine();
        
        while (!digitado.equalsIgnoreCase("sair")) {
            System.out.print("Digite oque quiser novamente: ");
            digitado = entrada.nextLine();
        }

        entrada.close();
    }
}
