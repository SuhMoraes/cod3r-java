import java.util.Locale;

public class NotacaoPonto {

    public static void main(String[] args) {

        double a = 2.3;
        String s = "Olha aqui o meu código";

        System.out.println(s); // Declarada

        s = s.replace("o", "Oi"); //Subistitu um caracter
        // O valor declarado da String 's' será armazenada na varíavel 's'
        s = s.toUpperCase();
        s = s.concat("!!!"); // Concatena

        System.out.println(s); // Armazenada

        System.out.println("Pedro".toUpperCase());

        System.out.println("Pedro"
                .replace("o", "a")
                .toUpperCase()
                .concat("!!!"));

    }
}
