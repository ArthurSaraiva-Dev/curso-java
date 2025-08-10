package fundamentos.Exercising;

import java.util.Scanner;

public class BaskaraCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- BASKARA CALCULATOR ---\n");

        System.out.println("Equation: ax2 + bx + c = 0\n");
        
        System.out.println("Enter value A: ");
        int A = input.nextInt();
        
        System.out.println("Enter value B: ");
        int B = input.nextInt();
        
        System.out.println("Enter value C: ");
        int C = input.nextInt();

        //DATA PROSSECING
        int delta = (B * B) - (4 * A * C);

        double x1 = (-B + Math.sqrt(delta)) / (2 * A);
        double x2 = (-B - Math.sqrt(delta)) / (2 * A);

        // DISPLAY 
        System.out.printf("Your equation is: %dx² + %d + %d\n", A, B, C);
        System.err.printf("Delta is: %d\n", delta);
        System.err.printf("Your x' is: %.2f\n", x1);
        System.err.printf("Your x'' is: %.2f\n", x2);

       input.close();
    }
}
