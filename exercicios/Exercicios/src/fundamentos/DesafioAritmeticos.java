package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        // PART 1
        double numeA = Math.pow(6 * (3 + 2), 2);
        double denoA = 3 * 2;
        double supA = numeA / denoA;
        System.out.println(supA);

        //PART 2
        double numeB = (1 - 5) * (2 - 7);
        double denoB = 2;
        double supB = Math.pow(numeB / denoB, 2);
        System.out.println(supB);

        //PART 3
        double superior = Math.pow(supA - supB, 3);
        double inferior = Math.pow(10, 3);
        double resultado = superior / inferior;
        System.out.println(resultado);
        
    }
}
