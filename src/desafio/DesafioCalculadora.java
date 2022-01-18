package desafio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Escolha a operação: ");
        String op = sc.next();

        // Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;



        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);


        sc.close();
    }
}
