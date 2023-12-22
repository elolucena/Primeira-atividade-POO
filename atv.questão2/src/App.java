import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
       double number;
   
       System.out.println("Coloque aqui um número");
       number = ler.nextDouble();

       System.out.println("O número informado foi:" + number);
    }
}
