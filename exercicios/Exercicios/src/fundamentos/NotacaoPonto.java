package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String x = "Hello world";
        x = x.replace("world", "guys!");
        x = x.toUpperCase();
        x =  x.concat("!!!!");
        System.out.println(x);
    }
}
