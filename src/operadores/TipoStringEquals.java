package operadores;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);// Compara os tipos
        System.out.println("2".equals(s1)); //Compara os conteúdos e não os tipos

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.nextLine();
        System.out.println("2" == s2.trim());// Trim() -> Retira todos os espaços da String
        System.out.println("2".equals(s2.trim())); //Sempre que for comparar uma String, utilizar o equals()

        entrada.close();
    }
}
