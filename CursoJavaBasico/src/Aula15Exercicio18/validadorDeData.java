package Aula15Exercicio18;

import java.util.Scanner;

public class validadorDeData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("========================================");
		System.out.println("           VALIDADOR DE DATAS           ");
		System.out.println("========================================");
		System.out.println(" Formato exigido: dd/mm/aaaa");
		System.out.println("----------------------------------------\n");
		
		System.out.print(" Digite a data: ");
		
		String dataDigitada = scan.nextLine();
	
		String[] partesData = dataDigitada.split("/");
		
		
		if (partesData.length != 3) {
			System.out.println("\n[ERRO] Formato incorreto! Você deve usar as barras (/).");
			System.out.println("================ PROGRAMA ENCERRADO ================");
		} else {
			
			int dia = Integer.parseInt(partesData[0]);
			int mes = Integer.parseInt(partesData[1]);
			int ano = Integer.parseInt(partesData[2]);
			
			boolean dataValida = true;
		
			if (mes < 1 || mes > 12) {
				dataValida = false;
			} else {
	
				int limiteDias = 31; 
				if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					limiteDias = 30;
				} 
				
				else if (mes == 2) {
					boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
					
					if (ehBissexto) {
						limiteDias = 29;
					} else {
						limiteDias = 28;
					}
				}
				
				
				if (dia < 1 || dia > limiteDias) {
					dataValida = false;
				}
			}
			
			 
			System.out.println("\n----------------------------------------");
			System.out.println("Analisando a data: " + dataDigitada);
			System.out.println("----------------------------------------\n");
			
			
			if (dataValida) {
				System.out.println("[RESULTADO] Esta é uma data VÁLIDA.");
			} else {
				System.out.println("[RESULTADO] Esta data é INVÁLIDA.");
			}
			
			System.out.println("\n================ PROGRAMA FINALIZADO ================");
		}
		
		scan.close();
		return;
	}

}