package desafio;

public class DesafioAritmetico {

    public static void main(String[] args) {

        int supA = 6 * ( 3 + 2 );
        int powSupA = (int) Math.pow(supA, 2);
        int infA = 3 * 2;
        int totalDiv = powSupA / infA;
        System.out.println(totalDiv);


        int supB = (1 - 5) * (2 - 7);
        int infESub = supB / 2;
        int powInfESub = (int) Math.pow(infESub, 2);
        System.out.println(powInfESub);

        int totalSup = totalDiv - powInfESub;
        System.out.println(totalSup);

        int resul1 = (int) Math.pow(totalSup, 3);
        int result2 = (int) Math.pow(10, 3);

        int total = resul1 / result2;
        System.out.println(total);






    }


}
