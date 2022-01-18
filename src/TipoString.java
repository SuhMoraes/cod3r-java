import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class TipoString {

    public static void main(String[] args){
        System.out.println("Olá Java".charAt(1)); // Pega o que está no índice

        String s = "Bom dia";
        System.out.println(s.concat("!!!"));
        System.out.println(s +"!!!");
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println(s.startsWith("Bom"));
        System.out.println(s.toLowerCase().startsWith("bom"));
        System.out.println(s.length());
        System.out.println(s.equals("bom dia"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Domingos";
        var idade = 33;
        var salario = 45000.0231;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n") ;

        System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.println("");

        String frase = String.format("Nome: %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Entendo o tipo String".getBytes(StandardCharsets.UTF_8));
        System.out.println("Entendo o tipo String".chars());
        System.out.println("Entendo o tipo String".lines());

    }
}
