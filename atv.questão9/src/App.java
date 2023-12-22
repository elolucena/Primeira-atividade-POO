import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int numero;
        boolean parar = false;
        char false;
        
        do{
			System.out.print("Digite um número inteiro:");
			numero = ler.nextInt();


			if(numero%2==0){
				System.out.print("O número é par.\n");
			}else{
				System.out.print("O número não é par\n");
			}
			if(numero<0){
				System.out.print("O número é negativo\n");
			}else{
				System.out.print("O número é positivo\n");
			}

			System.out.println("Deseja sair? (s/N)? ");
			letra = ler.next().charAt(0);
			if(letra == 's' || letra == 'S'){
				parar = true;
			}

		}while(parar==false);

	}
}

