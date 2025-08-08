package fundamentos.Exercising;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("[--- IMC CALCULATOR ---]\n");

        // Input
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Enter your weight (Ex: 82,5): ");
        String weight = input.nextLine().replace(",", ".").trim();
        
        System.out.println("Enter your height (Ex: 1,80): ");
        String height = input.nextLine().replace(",", ".").trim();

        // Data processing
        Double weightDouble = Double.parseDouble(weight);
        Double heightDouble = Double.parseDouble(height);

        // Calculation of data
        // IMC = weight / (height squared)
        double IMC = weightDouble / Math.pow(heightDouble, 2);               

        // Display 
        System.out.printf("%s your IMC is: %.2f", name, IMC);

        input.close();
    }
    
}
