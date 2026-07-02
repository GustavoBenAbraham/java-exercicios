package Aula15Exercicio19;

import java.util.Scanner;

public class sistemaInvestigacaoCSI {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		
		int nivelDeCulpa = 0; 
		
		
		System.out.println("********************************************************");
		System.out.println("*               SISTEMA DE INVESTIGAÇÃO CSI            *");
		System.out.println("*           DEPARTAMENTO DE INTELIGÊNCIA FEDERAL       *");
		System.out.println("********************************************************");
		
		
		System.out.println(">> Lendo drive A:\\ (Disquete)...");
		Thread.sleep(1500); 
		System.out.println(">> Carregando banco de dados criminal...");
		Thread.sleep(1500);
		System.out.println(">> Acesso Liberado.\n");
		Thread.sleep(800);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("INSTRUÇÃO: Responda ao interrogatório com [S] para SIM ");
		System.out.println("           ou [N] para NÃO.");
		System.out.println("--------------------------------------------------------\n");
		
	
		System.out.print("[PERGUNTA 1/5] Telefonou para a vítima? [S/N]: ");
		String resp1 = scan.next();
		
		System.out.print("[PERGUNTA 2/5] Esteve no local do crime? [S/N]: ");
		String resp2 = scan.next();
		
		System.out.print("[PERGUNTA 3/5] Mora perto da vítima? [S/N]: ");
		String resp3 = scan.next();
		
		System.out.print("[PERGUNTA 4/5] Devia para a vítima? [S/N]: ");
		String resp4 = scan.next();
		
		System.out.print("[PERGUNTA 5/5] Já trabalhou com a vítima? [S/N]: ");
		String resp5 = scan.next();
		
		
		
		if (resp1.equalsIgnoreCase("S") || resp1.equalsIgnoreCase("SIM")) nivelDeCulpa++;
		if (resp2.equalsIgnoreCase("S") || resp2.equalsIgnoreCase("SIM")) nivelDeCulpa++;
		if (resp3.equalsIgnoreCase("S") || resp3.equalsIgnoreCase("SIM")) nivelDeCulpa++;
		if (resp4.equalsIgnoreCase("S") || resp4.equalsIgnoreCase("SIM")) nivelDeCulpa++;
		if (resp5.equalsIgnoreCase("S") || resp5.equalsIgnoreCase("SIM")) nivelDeCulpa++;

		
		System.out.println("\n>> ANALISANDO RESPOSTAS...");
		
		Thread.sleep(2000); 
		System.out.println(">> CRUZANDO DADOS COM SATÉLITE...");
		Thread.sleep(2000);
		
		
		System.out.println("\n********************************************************");
		System.out.print(">>> VEREDITO DO SISTEMA: ");
		
		if (nivelDeCulpa == 2) {
			System.out.println("PESSOA SUSPEITA");
		} else if (nivelDeCulpa == 3 || nivelDeCulpa == 4) {
			System.out.println("CÚMPLICE DO CRIME");
		} else if (nivelDeCulpa == 5) {
			System.out.println("ASSASSINO!");
		} else {
			System.out.println("INOCENTE (Sem evidências suficientes)");
		}
		System.out.println("********************************************************\n");
		System.out.println(">> Encerrando sistema...");
		
		scan.close();
		return;
	}

}