package fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        //Wrapper
        //São a versão objeto dos tipos primitivos
        //byte
        Byte b = 100;
        Short s = 1000; 
        //Integer.parseInt(entrada.next());
        Integer i = 10000; //int
        Long l = 100000000L; // Somente converte de long para long
        
        Float f = 123.70F;
        System.out.println(f);
        
        Double d = 45867546.34543;
        System.out.println(d);

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 9);
        System.out.println(l / i);

        // wrapper boolean
        Boolean bo = Boolean.parseBoolean("false");
        System.out.println(bo.toString().toUpperCase());

        // wrapper character
        Character c = '$'; //char
        System.out.println(c + "````");
    }
}
