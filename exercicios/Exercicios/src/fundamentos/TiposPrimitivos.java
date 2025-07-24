package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Infos do Funcionário:

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 32;
        short numeroDeVoos = 1003;
        int id = 76932;
        long pontosAcumulados = 4_567_876_223L; // A variável long necessíta do L ao fim para tornar o inteiro um Long.

        // Tipos Numéricos Reais
        float salario = 11_580.44F; // A variável float necessíta do F ao fim para tornar o nmr um Double.
        double vendasAcumuladas = 2_989_435_124.03;

        // Tipo Booleano
        boolean estaDeFerias = false; // ou verdadeiro.

        // Tipo caractere
        char status = 'A'; //ativo.

        // Dias de empresa
        System.out.println("Este funcionário tem: " + anosDeEmpresa * 365 + " dias de empresa.");

        // Número de Viagens
        System.out.println("Este funcionário voou pela empresa: " + numeroDeVoos / 2 + " vezes.");

        // Pontos por Real
        System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas + " Reais.");

        // Salário e Id
        System.out.println("O funcionário cujo identificação: " + id + " Recebe: " + salario);

        // Férias
        System.out.println("Férias? " + estaDeFerias);

        // Atividade:
        System.out.println("O status do usuário é: " + status);
    }
}
