package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        double tempF = 98.8;
        final int x = 32;
        final double y = 5/9.0;
        double celsiusResult = (tempF - x) * y;

        System.out.println("A temperatura em Celsius é: " + celsiusResult + " graus celsius.");
    }
}
