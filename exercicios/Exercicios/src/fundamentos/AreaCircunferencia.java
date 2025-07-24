package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3;
        final double PI = 3.14159; 
        // "final" tranforma a variável em constante. E constantes tem como convenção ser escrita em letras maiusculas.
        double area = PI * raio * raio;
        System.out.println(area);

        raio = 11;
        area = PI * raio * raio;
        System.out.println("Área = " + area + "m2.");
    }
}
