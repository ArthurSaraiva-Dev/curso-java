package fundamentos.operadores;

public class OpAritmeticos {
    public static void main(String[] args) {
        System.out.println(2 + 7);

        var x = 39.67;
        double y = 3.7;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 9;
        int b = 7;

        System.out.println("-------------------");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (float) b);

        System.out.println(a % b);

        System.out.println(x - y * a + b);
    }
}
