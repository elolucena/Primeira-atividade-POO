import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
         float raio;
         float área;

         System.out.println("Qual o raio de um círculo cujo diâmetro igual a 4?");
         raio = ler.nextFloat();                                                    
            System.out.println("o raio é igual a:" + raio);

            área = (raio*raio);
            System.out.println("Dito isso, a área do círculo é:" + área);

    }
}
