package Aula15Exercicio12;

import java.util.Scanner;

public class descontosSalarias {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora ?: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou no mês ?: ");
		double horasTrabalhadas = scan.nextDouble();
		
		System.out.println("Você Digitou os seguintes valores:");
		 
		System.out.println("Valor da sua hora trabalhada: " + "R$: " + valorHora);
		System.out.println("Quantidade de horas trabalhas no mês: " + horasTrabalhadas + "h");
		
		double salarioBruto = (valorHora) * (horasTrabalhadas);
		
		int percentualIR = 0;
		
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto <= 2500) {
			percentualIR = 10;
		} else { 
			percentualIR = 20;	
		}
		
		double impostoRenda = salarioBruto * (percentualIR / 100.0);
		double inss = salarioBruto * 0.10; 
		double fgts = salarioBruto * 0.11; 
		
		double totalDescontos = impostoRenda + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("\n------------------------------------------------");
		
		System.out.printf("Salário Bruto: (%.0f * %.0f)   : R$ %.2f\n", valorHora, horasTrabalhadas, salarioBruto);
		System.out.printf("(-) IR (%d%%)                     : R$ %.2f\n", percentualIR, impostoRenda);
		System.out.printf("(-) INSS (10%%)                   : R$ %.2f\n", inss);
		System.out.printf("FGTS (11%%)                      : R$ %.2f\n", fgts);
		System.out.printf("Total de descontos               : R$ %.2f\n", totalDescontos);
		System.out.printf("Salário Liquido                  : R$ %.2f\n", salarioLiquido);
		
		System.out.println("------------------------------------------------");
		
		scan.close();
		return;

	}

}
