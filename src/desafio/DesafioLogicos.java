package desafio;

public class DesafioLogicos {

    public static void main(String[] args) {

        Boolean trabTerca = false;

        Boolean trabQuinta = false;

        // trabalho terça (V ou F )
        if (trabTerca && !trabQuinta) {
            System.out.println("TV 32'");
        } else if (trabTerca && trabQuinta){
            System.out.println("Comprar TV 32' e Sorvete");
        } else if(!trabTerca && trabQuinta) {
            System.out.println("Sorvete");
        } else {
            System.out.println("Ficamos em casa");
        }

    }
}
