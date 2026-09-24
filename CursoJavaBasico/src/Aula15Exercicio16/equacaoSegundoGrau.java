package Aula15Exercicio16;

import java.util.Scanner;

public class equacaoSegundoGrau {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("========================================");
		System.out.println("   CALCULADORA DE EQUAÇÃO DO 2º GRAU    ");
		System.out.println("========================================");
		System.out.println(" Formato base: ax² + bx + c = 0");
		System.out.println("----------------------------------------\n");
		
		
		System.out.print("» Digite o valor de A: ");
		double valorA = scan.nextDouble();
		
		if (valorA == 0) {
			System.out.println("\n[AVISO] Se A = 0, a equação não é do 2º grau.");
			System.out.println("================ PROGRAMA ENCERRADO ================");
		} else {
			
			System.out.print("» Digite o valor de B: ");
			double valorB = scan.nextDouble();
			
			System.out.print("» Digite o valor de C: ");
			double valorC = scan.nextDouble();
			
			
			System.out.println("\n----------------------------------------");
			System.out.printf("Sua equação: (%.1f)x² + (%.1f)x + (%.1f) = 0\n", valorA, valorB, valorC);
			System.out.println("----------------------------------------\n");
			
			
			double delta = Math.pow(valorB, 2) - (4 * valorA * valorC);
			System.out.printf("[INFO] Delta calculado (Δ) = %.2f\n\n", delta);
			
			
			if (delta < 0) {
				System.out.println("[RESULTADO] Como o Delta é negativo, a equação NÃO possui raízes reais.");
				System.out.println("\n================ PROGRAMA ENCERRADO ================");
				
			} else if (delta == 0) {
				System.out.println("[RESULTADO] Delta é igual a zero. A equação possui apenas UMA raiz real:");
				
				double raiz = -valorB / (2 * valorA);
				System.out.printf("» Raiz: %.2f\n", raiz);
				
				System.out.println("\n================ PROGRAMA FINALIZADO ================");
				
			} else {
				System.out.println("[RESULTADO] Delta é positivo. A equação possui DUAS raízes reais:");
				
				double raiz1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
				double raiz2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
				
				System.out.printf("» Raiz 1 (x'): %.2f\n", raiz1);
				System.out.printf("» Raiz 2 (x''): %.2f\n", raiz2);
				
				System.out.println("\n================ PROGRAMA FINALIZADO ================");
			}
		}
		
		scan.close();
		return;
	}
}