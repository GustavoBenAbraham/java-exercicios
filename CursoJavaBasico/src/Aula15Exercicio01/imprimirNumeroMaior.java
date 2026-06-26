package Aula15Exercicio01;

import java.util.Scanner;

public class imprimirNumeroMaior {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Digite outro número: ");
		int numero2 = scan.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O maior é: " + numero1);
		} else {
			System.out.println("O maior é: " + numero2);
		}


		scan.close();

	}

}
