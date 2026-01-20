package academy.devdojo.maratonajava.introducion;

public class OperadoresLogicos01_and {
    public static void main(String[] args) {

        // && (and) || (or) ! not

        int idade = 25;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612F;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta"+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta"+isDentroDaLeiMenorQueTrinta);

    }
}
