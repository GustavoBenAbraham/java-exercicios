package Aula15Exercicio02;

import java.util.Scanner;

public class CalcularNumeroNegativo {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero1 = scan.nextInt();
		
		if (numero1 < 0) {
			System.out.println("É negativo: ");
		} else {
			System.out.println("É positivo");
		}


		scan.close();

	}

}
