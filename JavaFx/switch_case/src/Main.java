import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);

		double java = 99.00;
		double html = 299.00;
		double python = 79.90;
		
		System.out.println("Olá, para continuar insira seu primeiro nome: ");
		String nomeAluno = teclado.nextLine();
		
		System.out.println("Escolha uma opção: 1-Java 2-Desenvolvimento Web 3-Python");
		int escolha = teclado.nextInt();
		
		switch(escolha) {
		
		case 1: System.out.println(" Curso passo a passo de Java para iniciantes por R$"+java); break;
		case 2: System.out.println(" Curso completo de Desenvolvimento de sites por R$"+html); break;
		case 3: System.out.println(" Curso para inciantres em desenvolvimento Python por R$"+python); break;
		default: System.out.println(" Opção não encontrada, por favor tente novamente"); break;
		}
		
		System.out.println("Quantos acessos deseja adquirir?");
		int quantidade = teclado.nextInt();
		
		if (escolha == 1) {
			System.out.println("Olá Sr(a) " + nomeAluno + " ,o total a pagar é R$");
			System.out.println(quantidade*java);
		}else {
			if (escolha == 2 ) {
				System.out.println("Olá Sr(a) " + nomeAluno + " ,o total a pagar é R$");
				System.out.println(quantidade*html);
			}else {
				System.out.println("Olá Sr(a) " + nomeAluno + " ,o total a pagar é R$");
				System.out.println(quantidade*python);
			}
		}
		
		teclado.close();
		
		
	}

}
