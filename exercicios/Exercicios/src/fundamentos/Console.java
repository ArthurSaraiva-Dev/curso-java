package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        // Diferença entre print e println
        System.out.print("Cria um texto sem criar uma nova linha");
        System.out.println(" println!"); //println cria uma linha após o texto.
        System.out.print("linha");

        //format
        System.out.printf("\nDia de hoje: %d/%d/%d\n", 29,07,2025);
        System.out.printf("Meu salário Junior pretendido é: %.2f\n",3500.00);

        // Scanner
        Scanner entrada = new Scanner(System.in); // Abertura do Scanner
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite seu sobremone: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite seu sobremone: ");
        int idade = entrada.nextInt(); // Para inteiros será nextInt

        System.out.format("%s %s tem %d anos de idade.", nome, sobrenome, idade);

        entrada.close(); // fechamento do Scanner

        //Problema Scanner
        Scanner problema = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idadep = problema.nextInt();
        /*
         * Este nextLine será posto para solucionar o \n não lido pelo
         * nextInt, sendo assim, o próximo nextLine lerá sem problemas 
         * o input do usuário.
         */
        problema.nextLine(); 
        System.out.println("Qual o seu nome?");
        String nomep = problema.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String sobrenomep = problema.nextLine();
        System.out.format("%s %s tem %d anos de idade.", nomep, sobrenomep, idadep);
        problema.close();
    }
}
