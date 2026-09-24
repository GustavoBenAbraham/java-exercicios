package Aula13Exercicio08;

import java.util.Scanner;

public class CalcularHorasTrabalhadas {

	public static void main(String[] args) {
		
       Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora ?: ");
		double valorHora  = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês?: ");
		double horas  = scan.nextDouble();
		
		double salario  = valorHora * horas;
		System.out.printf("Seu salário total desse mês referente é: R$ %.2f%n", salario);
		
		scan.close();
		
		
		
	}

}
