package academy.devdojo.maratonajava.introducion;

public class TiposPrimitivos01 {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 18;
        long numeroGrande = 100000;
        double salarioDouble = 5200;
        float salarioFloat = 6500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 60;

        String nome = "Marco";

        System.out.println("A idade é "+age);
        System.out.println("char " +caractere);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(numeroGrande);
        System.out.println("Meu nome é "+nome);
    }
}
