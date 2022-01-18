package exercicios;

public class TiposPrimitivoos {

    public static void main(String[] args) {

        // Informações do funcionário

        // Tipos numéricos  inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 327;
        int id = 2000000;
        long pontosAcumulados = 3_234_452_223L;

        // Tipos Numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = true;

        // Tipo caractere
        char status = 'A';  // Não pode colocar 2 Caracteres
        char status2 = '\u0010'; // -> Unicode

        // Data da empresa
        System.out.println(anosDeEmpresa * 365);

        // Números de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias?" + estaDeFerias);
        System.out.println("Status: " + status);











    }
}
