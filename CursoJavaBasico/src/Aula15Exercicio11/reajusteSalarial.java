package Aula15Exercicio11;

import java.util.Scanner;

public class reajusteSalarial {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite seu salário atual: ");
		double salarioAtual = scan.nextDouble();
		
		int percentual = 0;
		
		if (salarioAtual <= 280) {
			percentual = 20;
		} else if (salarioAtual > 280 && salarioAtual <= 700) {
			percentual = 15;
		} else if (salarioAtual > 700 && salarioAtual <= 1500) {
			percentual = 10;
		} else {
			percentual = 5;
		}
		
		double valorAumento = salarioAtual * (percentual / 100.0);
		double novoSalario = salarioAtual + valorAumento;
		
		System.out.println("\n--- Resumo do Reajuste ---");
		System.out.printf("Salário antes do reajuste: R$ %.2f\n", salarioAtual);
		System.out.println("Percentual de aumento aplicado: " + percentual + "%");
		System.out.printf("Valor do aumento: R$ %.2f\n", valorAumento);
		System.out.printf("Novo salário, após o aumento: R$ %.2f\n", novoSalario);
		
		scan.close();
		return;

	}

}
