package fundamentos;

public class ConversaoNumString {
    public static void main(String[] args) {
        // Acontece com todos os outros tipos numéricos:
        Integer number1 = 19999;
        System.out.println(number1.toString().length()); // exibe o número de caracteres existentes em 19999.

        int number2 = 100000;
        System.out.println(Integer.toString(number2));

        System.out.println(("" + number2).length()); // converte o número para uma string concatenando com uma string vazia (incorreto).
    }
}
