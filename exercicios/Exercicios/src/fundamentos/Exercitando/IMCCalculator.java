package fundamentos.Exercitando;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("[--- CALCULADORA IMC ---]\n");

        // Input dos dados
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        
        System.out.println("Digite seu peso (Ex: 82,5): ");
        String peso = input.nextLine().replace(",", ".").trim();
        
        System.out.println("Digite sua altura (Ex: 1,80): ");
        String altura = input.nextLine().replace(",", ".").trim();

        // Tratamento dos Dados
        Double pesoDouble = Double.parseDouble(peso);
        Double alturaDouble = Double.parseDouble(altura);

        // Calculo dos dados
        // IMC = Peso / (altura ao quadrado)
        double IMC = pesoDouble / Math.pow(alturaDouble, 2);               

        // Exibição 
        System.out.printf("%s seu IMC é: %.2f", nome, IMC);

        input.close();
    }
    
}
