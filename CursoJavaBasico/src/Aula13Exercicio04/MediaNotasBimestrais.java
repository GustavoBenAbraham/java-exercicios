package Aula13Exercicio04;

import java.util.Scanner;

public class MediaNotasBimestrais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Segunda  nota: ");
		double nota2 = scan.nextDouble();
		System.out.println("Terceira nota: ");
		double nota3 = scan.nextDouble();
		System.out.println("Quarta   nota: ");
		double nota4 = scan.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media é: " + media);
		if ( media >= 10); {
			System.out.println("Aprovado com distinção"); 
		}
	    if  ( media >= 7) {
			System.out.println("Aprovado");
		}
		else { 
			System.out.println("Reprovado");
		}
		scan.close();
	

	}

}
