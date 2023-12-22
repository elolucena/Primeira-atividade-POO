import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float lado;
        float áreadoquadrado;
        float dobrodaárea;
        
        System.out.println("Coloque aqui o valor dos lados do quadrado e descubra sua área");
        lado = ler.nextFloat();

        áreadoquadrado = lado*lado;
         System.out.println("A área do quadrado é" + áreadoquadrado);

         System.out.println("Coloque aqui o valor da área total do quadrado e descubra o número que resultado do dobro dessa área");
         áreadoquadrado = ler.nextFloat();

         dobrodaárea = áreadoquadrado*2;
         System.out.println("A área do dobro do quadrado é" + dobrodaárea);

        }
}
