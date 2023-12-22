import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double média;

        System.out.println("Coloque aqui a primeira nota:");
        nota1 = ler.nextDouble();

        System.out.println("Coloque aqui a segunda nota:");
        nota2 = ler.nextDouble();

        System.out.println("Coloque aqui a terceira nota:");
        nota3 = ler.nextDouble();

        System.out.println("Coloque aqui a quarta nota:");
        nota4 = ler.nextDouble();

        média = nota1 + nota2 + nota3 + nota4/4;
        System.out.println("A média é:" + média);

    }
}
