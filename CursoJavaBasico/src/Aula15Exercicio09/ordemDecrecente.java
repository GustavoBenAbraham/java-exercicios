package Aula15Exercicio09;

import java.util.Scanner;

public class ordemDecrecente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite 03 valores: ");
		   double n1 = scan.nextDouble();
		   double n2 = scan.nextDouble();
		   double n3 = scan.nextDouble();
		   
		   System.out.println("O valores apresentados foram: ");
		   
		// Variável temporária para ajudar na troca
		   double aux; 
		   System.out.println("Valor 01:  " + n1);
		   System.out.println("Valor 02:  " + n2);
		   System.out.println("Valor 03:  " + n3);
		   
		// --- LÓGICA DE ORDENAÇÃO DECRESCENTE ---
	
			// Garante que n1 seja maior que n2
			if (n1 < n2) {
				aux = n1;
				n1 = n2;
				n2 = aux;
			}

			// Garante que n1 seja maior que n3
			if (n1 < n3) {
				aux = n1;
				n1 = n3;
				n3 = aux;
			}

			// Garante que n2 seja maior que n3
			if (n2 < n3) {
				aux = n2;
				n2 = n3;
				n3 = aux;
			}

			// --- EXIBIÇÃO DO RESULTADO ---
			System.out.println("\nValores em ordem decrescente: ");
			System.out.println(n1 + " -> " + n2 + " -> " + n3);
		
		   
		   

	}

}
