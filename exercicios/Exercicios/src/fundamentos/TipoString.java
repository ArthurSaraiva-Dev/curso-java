package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Hello Guys".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "kkk");
        System.out.println(s.startsWith("boa")); // chega como a string começa.
        System.out.println(s.toLowerCase().startsWith("boa")); // chega como a string começa sem a necessicade de escrever exatamente.
        System.out.println(s.length());
        System.out.println(s.endsWith("TARDE"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Arthur";
        var sobrenome = "Saraiva";
        var idade = 19;
        var salario = 1518.00;

        // Forma errada: (Concatenação em excesso)
        // System.out.println("Nome: " + nome + "\nSobrenome: " + "\nIdade: " + idade + "\nSalário: " + salario);
        System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d \nSalário: R$%.2f", nome, sobrenome, idade, salario);
        
        // Mesmo efeito:
        String fraseCompleta = String.format("\nNome: %s \nSobrenome: %s \nIdade: %d \nSalário: R$%.2f", nome, sobrenome, idade, salario);
        System.out.println(fraseCompleta); 

        // Testando a API:
        String frase = "O rato roeu a roupa do Rei de Roma";
        /* 
        System.out.println(frase.contains("rato"));

        System.out.println(frase.indexOf("rato")); */

        System.out.println(frase.substring(4, 9));

        // System.out.println(frase.trim());

    }
}
