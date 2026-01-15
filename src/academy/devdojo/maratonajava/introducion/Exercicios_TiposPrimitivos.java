package academy.devdojo.maratonajava.introduction;

public class Exercicios_TiposPrimitivos {
    public static void main(String[] args) {

        String name = "Marco";
        String address = "Ruas das Laranjeiras";
        double salary = 4350D;
        String dataDeRecebimento = "14/01/2026";

        String relatorio = "Eu " + name +
                " morando no endereco " + address +
                " confirmo que recebi o salário de: " + salary +
                ", na data de " + dataDeRecebimento;

        System.out.println(relatorio);
    }
}
