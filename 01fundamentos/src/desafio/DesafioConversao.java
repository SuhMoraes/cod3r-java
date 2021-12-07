package desafio;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US")); // Setando o Local da aplicação

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário do mês 1: ");
        String valor1 = sc.next().replace(',','.');

        System.out.println("Digite o seu salário do mês 2: ");
        String valor2 = sc.next().replace(',','.');

        System.out.println("Digite o seu salário do mês 3: ");
        String valor3 = sc.next().replace(',','.');

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 +salario3 ) / 3;

        System.out.printf("Média dos salários é : %f.2" + media);

        sc.close();
    }
}
