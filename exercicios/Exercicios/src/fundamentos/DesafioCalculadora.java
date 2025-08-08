package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // Ler Num1
        // Ler Num2
        // Ler a operação desejada e aprepensar o resultado
        // (+ - * / %)

        Scanner in = new Scanner(System.in);
        System.out.println("--- CALCULADORA ---");
        
        System.out.println("Digite o primeiro valor");
        Double inNum1 = in.nextDouble();
        
        System.out.println("Digite o operador que deseja utilizar (Ex: *)");
        String inOperator = in.next().trim();
        
        System.out.println("Digite o segundo valor");
        Double inNum2 = in.nextDouble();
        
        
        // Lógica
        double calc = "+".equals(inOperator) ? inNum1 + inNum2 : 0;
        calc = "-".equals(inOperator) ? inNum1 - inNum2 : calc;
        calc = "*".equals(inOperator) ? inNum1 * inNum2 : calc;
        calc = "/".equals(inOperator) ? inNum1 / inNum2 : calc;
        calc = "%".equals(inOperator) ? inNum1 % inNum2 : calc;

        System.out.printf("%.2f %s %.2f = %.2f", inNum1, inOperator, inNum2, calc);

        in.close();
    }
}
