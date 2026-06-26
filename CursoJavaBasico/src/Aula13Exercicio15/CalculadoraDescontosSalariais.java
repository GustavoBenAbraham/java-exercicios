package Aula13Exercicio15;

import java.util.Scanner;

public class CalculadoraDescontosSalariais {

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
		 double impostoRenda = (salarioBruto) * 0.11;
		 double inss = (salarioBruto) * 0.08;
		 double sindicato = (salarioBruto) * 0.05;
		 
		 double descontos = (impostoRenda) + (inss) + sindicato;
		 double salarioLiquido = (salarioBruto) - (descontos);
		 
		 System.out.println("\n===== RESUMO SALARIAL =====  ");
		 System.out.println("Salário Bruto: " + "R$" + salarioBruto);
		 System.out.println("IR: " + "R$" + impostoRenda);
		 System.out.println("INSS: " + "R$" + inss);
		 System.out.println("Sindicato: " + "R$" + sindicato);
		 System.out.println("Salario Liquido: " + "R$" + salarioLiquido);
		 System.out.println("Total de descontos " + "R$" + descontos);
		 
		  
		 scan.close();
		 

		
		 
		 
		 
	}

}
