package fundamentos;

public class ConversaoTiposNum {
    public static void main(String[] args) {
        double a = 2; // Conversão implícita.
        System.out.println(a);

        // CAST
        float f = (float) 3.34857843573495; // Conversão explícita. 
        System.out.println(f); // Perda de informação.

        int c = 128;
        byte d = (byte) c; // Conversão explícita perigosa!
        System.out.println(d);

        double e = 2.99999; // truncará para 2
        int y = (int) e; // Conversão explícita (perda de informação).
        System.out.println(y);
    }
}
