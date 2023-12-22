import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double number1;
        double number2;
        double soma;

        System.out.println("Coloque aqui o primeiro número:");
        number1 = ler.nextDouble();

        System.out.println("Coloque o segundo núnumro aqui:");
        number2 = ler.nextDouble();

        soma = number1 + number2;
        System.out.println("O resultado da soma foi:" + soma );
    }
}
