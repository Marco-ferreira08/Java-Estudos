package academy.devdojo.maratonajava.introducion;

public class OperadoresLogicos02_Or {
    public static void main(String[] args) {

        double valorTotalContaCorrente = 200D;
        double valorTotalContaPoupança = 10000D;
        float valorPlaystation = 5000F;

        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;

        System.out.println("isPlaystation5Compravel"+isPlaystation5Compravel);

    }
}
