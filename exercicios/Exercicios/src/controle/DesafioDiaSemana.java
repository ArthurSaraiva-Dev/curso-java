package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia: (EX: terça-feira)");
        String dia = entrada.next().trim();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("segunda") 
                || dia.equalsIgnoreCase("segunda-feira")) {
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("terça") 
                || dia.equalsIgnoreCase("terça-feira") 
                || dia.equalsIgnoreCase("terca")) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("quarta") 
        || dia.equalsIgnoreCase("quarta-feira")) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("quinta") 
                || dia.equalsIgnoreCase("quinta-feira")) {
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("sexta") 
                || dia.equalsIgnoreCase("sexta-feira")) {
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("sábado") 
                || dia.equalsIgnoreCase("sabado")) {
            System.out.println(7);
        } else {
            System.out.println("DIA INVÁLIDO");
        }



        entrada.close();
    }
}
