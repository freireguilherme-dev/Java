package exerciciosFixacao;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
	        System.out.println("Informe o comprimento: ");
	        double comprimento = scanner.nextDouble();

	        System.out.println("Informe a largura: ");
	        double largura = scanner.nextDouble();

	        double area = calcularArea(comprimento, largura);
	        double perimetro = calcularPerimetro(comprimento, largura);

	        System.out.println("A área é: " + area);
	        System.out.println("O perímetro é: " + perimetro);
	    } catch (java.util.InputMismatchException e) {
	        System.out.println("Erro de entrada. Certifique-se de inserir números válidos.");
	    } finally {
	        scanner.close();
	    }	
	}
	
	public static double calcularArea(double comprimento, double largura) {
        return comprimento * largura;

	}
	
	public static double calcularPerimetro (double comprimento, double largura) {
        return 2 * (comprimento * largura);

	}
}