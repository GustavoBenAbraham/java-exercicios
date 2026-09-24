package Aula13Exercicio06;

import java.util.Scanner;

public class CalcularRaioEmCircuito {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círcuito: ");
		double raio = scan.nextDouble();

		double area = Math.PI * Math.pow(raio, 2);
		        		
		System.out.printf("A área do círculo é: %.2f%n", area);
		
		scan.close();
		
		
	}

}
