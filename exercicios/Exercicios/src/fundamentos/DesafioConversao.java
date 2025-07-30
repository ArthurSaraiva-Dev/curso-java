package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entradaSalarios = new Scanner(System.in);

        System.out.println("Digite o seu primeiro Salário: ");
        String salario1 = entradaSalarios.nextLine().replace(",", ".");
        
        System.out.println("Digite o seu segundo Salário: ");
        String salario2 = entradaSalarios.nextLine().replace(",", ".");
        
        System.out.println("Digite o seu terceiro Salário: ");
        String salario3 = entradaSalarios.nextLine().replace(",", ".");

        double sConv1 = Double.parseDouble(salario1);
        double sConv2 = Double.parseDouble(salario2);
        double sConv3 = Double.parseDouble(salario3);

        double somaSalarial = sConv1 + sConv2 + sConv3;
        double mediaSalarial = somaSalarial / 3;

        System.out.println("A sua média salarial é: " + mediaSalarial);


        entradaSalarios.close();
    }
}
