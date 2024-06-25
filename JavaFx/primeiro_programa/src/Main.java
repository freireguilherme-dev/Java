import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor insira o seu nome: ");
		String cliente  = teclado.nextLine();
		
		System.out.println("Por favor insira a quantidade desejada: ");
		int quantidade = teclado.nextInt();
		
		double preco = 39.21;
		
		System.out.print("Ola "+ cliente+" o total a pagar é: R$" ); 
		System.out.printf("%.2f" , preco * quantidade );
		
		teclado.close();
	}

}
