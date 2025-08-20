public class Switch1 {
    public static void main(String[] args) {
        // Modo não usual (sem o break)

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sabe dar um chutão");
            case "marrom":
                System.out.println("Sabe o Tekki Shodan");
            case "rosa":
                System.out.println("Sabe o Heian Yodan");
            case "vermelha":
                System.out.println("Sabe o Nidan");
            case "amarela":
                System.out.println("Sabe o Shodan");
        }
    }
}
