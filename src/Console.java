import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        // print -> imprime mas não quebra linha
        System.out.print("Bom");
        System.out.print(" dia!\n\n"); //\n -> quebra linha

        // println -> imprime mas quebra linha
        System.out.println("Bom");
        System.out.println(" dia");

        // printf -> imprime e formata com os dados passados após a vírgula
        System.out.printf("Megasena: %d %d %d %d %d %n",
                1, 2, 3, 4, 5);

        // printf ->  formata os dados e
        // %.1f -> Formata os dados com a quantidade de número após a vírula ou ponto
        System.out.printf("Salário: %.1f \n\n", 1234.5678);

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite qualquer coisa: ");
        String nome = entrada.nextLine();

        System.out.println("\n\nNome = " + nome);

    }
}
