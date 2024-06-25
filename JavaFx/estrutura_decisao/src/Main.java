import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o nome do(a) cliente: ");
		String nomeCliente = teclado.nextLine();
		
		System.out.println("Qual a renda bruta do cliente? ");
		Double renda = teclado.nextDouble();
		
		System.out.println("Insira a idade do cliente: ");
		int idade = teclado.nextInt();	
		
		if (renda >= 3000 && idade >=21) {
			System.out.println("Parabéns," +nomeCliente+" seu credito foi aprovado");
			System.out.println("Em breve entraremos em contato");
		} else {
			System.out.println("Infelizmente seu credito não foi aprovado");
		}
		
		teclado.close();

	}

}
