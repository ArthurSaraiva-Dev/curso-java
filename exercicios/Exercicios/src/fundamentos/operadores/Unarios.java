package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        // POSFIX
        a++; // a = a + 1;
        a--; // a = a - 1;

        //PREFIX

        ++b; // b = b + 1;
        --b; // b = b - 1;

        System.out.println(++a == b--); // precedencia prefix vem antes que o posfix
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }
}
