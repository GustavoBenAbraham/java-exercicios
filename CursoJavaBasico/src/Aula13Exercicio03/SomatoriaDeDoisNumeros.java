package Aula13Exercicio03;

import java.util.Scanner;

public class SomatoriaDeDoisNumeros {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("O seu resultado é: " + resultado);
		
		
		scan.close();
	}

}
