import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int resposta ;
		
		do {
			System.out.println("Qual produto deseja cadastrar?");
			String produto = teclado.next();
			
			System.out.println("Deseja realizar mais um cadastro? 1-SIM 2-NÃO");
			resposta = teclado.nextInt();
			
		} while (resposta == 1);
			System.out.println("Obrigado por utilizar o programa.");
		
		
		teclado.close();

	}

}
