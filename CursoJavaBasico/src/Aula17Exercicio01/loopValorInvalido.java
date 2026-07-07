package Aula17Exercicio01;

import java.util.Scanner;

public class loopValorInvalido {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota;
		do {
		    System.out.println("Digite uma nota entre [0-10]: ");
		    nota = scan.nextDouble();
		    
		    if (nota < 0 || nota > 10) {
		        System.out.println("Valor inválido!");
		    }
		} while (nota < 0 || nota > 10);

		System.out.println("Nota válida recebida: " + nota);
		
		scan.close();
		return;
		

	

	}

}
