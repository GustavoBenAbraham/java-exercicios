package Aula13Exercicio07;

import java.util.Scanner;

public class CalcularAreaDoQuadradoEMostraroDobro {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.printf("Digite o tamanho do lado do quadrado: ");
		double lado  = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		double dobroArea = area * 2;
		
		System.out.printf("A área do quadrado é: %.2f%n", area);
		System.out.printf("O dobro da area é: %.2f%n", dobroArea);
		
		scan.close();

	}

}
