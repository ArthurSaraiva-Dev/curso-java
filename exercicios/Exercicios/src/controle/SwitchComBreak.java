package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Digite a nota do aluno:");
        int nota = entrada.nextInt();

        String conceito = "";

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";              
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4:
                conceito = "E";
                break;
            case 3: case 2: case 1: case 0:
                conceito = "F";
                break;
            default:
                conceito = "Conceito Inválido.";
                break;
        }

        System.out.printf("O aluno se qualifica como: %s", conceito);
        entrada.close();
    }
}
