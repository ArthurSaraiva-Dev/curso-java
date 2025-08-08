package fundamentos.Exercising;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        // Triangle Calculator

        Scanner input = new Scanner(System.in);

        System.out.println("[--- TRIANGLE CALCULATOR ---]\n");

        // Input
        System.out.println("Enter the base length: ");
        String length = input.nextLine().replace(",", ".");

        System.out.println("Enter the base height: ");
        String height = input.nextLine().replace(",", ".");

        // Data processing
        Double lengthDouble = Double.parseDouble(length);
        Double heightDouble = Double.parseDouble(height);

        // Calculation of data
        // Square = base length * base height / 2
        double squareResult = (lengthDouble * heightDouble) / 2;

        // Display Result
        System.out.printf("The calculation of the square is: %.3f", squareResult);
        input.close();
    }
}
