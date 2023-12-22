import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float metros;
        float centímetros;

        System.out.println("Metros?");
        metros = ler.nextFloat();

        centímetros = metros * 100;
        System.out.println("O resultado de metros para centímetros é:" + centímetros);

    }
}
