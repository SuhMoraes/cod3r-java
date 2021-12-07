public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1.12356987184222254;
        System.out.println(a);

        // Cast -> Explícita
        float b = (float) 1.12356987184222254; // Conversão para float, perda de informações
        System.out.println(b);

        int c = 130;
        byte d = (byte) c; // Cast -> Explícita
        System.out.println(d);

    }
}
