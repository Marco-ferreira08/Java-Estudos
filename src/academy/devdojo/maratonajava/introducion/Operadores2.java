package academy.devdojo.maratonajava.introducion;

public class Operadores2 {

    public static void main(String[] args) {
        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= ==(igual) !=(diferente)
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezIgualDez  = 10 == 10;
        boolean isVinteIgualVinte = 20 ==20;
        boolean isDezDiferenteVinte = 10!=20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isVinteIgualVinte);
        System.out.println(isDezDiferenteVinte);
    }


}
