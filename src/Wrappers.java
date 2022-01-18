public class Wrappers {

    public static void main(String[] args) {

        // byte
        Byte b = 10;
        Short s = 1000;
        Integer i = Integer.parseInt("1000"); // int
        Long l = 100000L;

        System.out.println(b.doubleValue());
        System.out.println(s.toString());
        System.out.println(i);

        Float f = 123.0f;
        System.out.println(f);

        Double d = 1245.368;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");

    }
}
