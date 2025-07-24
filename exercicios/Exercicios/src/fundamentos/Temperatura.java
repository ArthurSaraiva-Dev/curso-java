package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        double fahrenheit = 98.8;
        final int X = 32; // Ajuste 
        final double Y = 5/9.0; // Fator
        double celsius = (fahrenheit - X) * Y;

        System.out.println("A temperatura em Celsius é: " + celsius + " graus celsius.");
    }
}
