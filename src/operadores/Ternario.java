package operadores;

public class Ternario {

    public static void main(String[] args) {

        // Operador Ternário -> Atribuição Condicional

        double media = 6.99;
        String resultado = media >= 7.0 ? "Aprovado" : "Recuperação";

        String recuperacao = media>= 5.0 ? "Em recuperação" : "Reprovado";

        String expressaoTernaria = media >= 7.0 ? "Aprovado" : media>= 5.0 ? "Em recuperação" : "Reprovado";

        System.out.println(expressaoTernaria);
    }
}
