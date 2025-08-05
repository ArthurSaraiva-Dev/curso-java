package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean job1 = true;
        boolean job2 = true;

        boolean tv50 = job1 && job2;
        boolean tv32 = job1 ^ job2;
        boolean icecream = tv50 || tv32;
        boolean heath = !icecream;
        boolean home = job1 ^ job2;

        System.out.println("A família terá tv de 50 polegadas?: " + tv50);
        System.out.println("A família terá tv de 32 polegadas?: " + tv32);
        System.out.println("A família tomara sorvete?: " + icecream);
        System.out.println("A família ficará mais saudável?: " + heath);
        System.out.println("A família ficará em casa?: " + home);
    }
}
