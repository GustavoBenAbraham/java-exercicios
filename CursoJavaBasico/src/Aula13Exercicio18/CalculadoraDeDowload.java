package Aula13Exercicio18;

import java.util.Scanner;

public class CalculadoraDeDowload {

	public static void main(String[] args) {
		
		       Scanner scan = new Scanner(System.in);

		        // Entrada de dados
		        System.out.print("Digite o tamanho do arquivo (MB): ");
		        double tamanhoMB = scan.nextDouble();

		        System.out.print("Digite a velocidade da internet (Mbps): ");
		        double velocidadeMbps = scan.nextDouble();

		        // Conversão MB -> megabits
		        double tamanhoMegabits = tamanhoMB * 8;

		        // Tempo em segundos
		        double tempoSegundos = tamanhoMegabits / velocidadeMbps;

		        // Tempo em minutos (decimal)
		        double tempoMinutos = tempoSegundos / 60;

		        // Separando minutos e segundos
		        int minutos = (int) tempoMinutos;
		        int segundos = (int) ((tempoMinutos - minutos) * 60);

		        // Resultado formatado
		        System.out.println("Tempo aproximado de download: "
		                + minutos + " min e " + segundos + " seg");

		        scan.close();
		    }
		

	}


