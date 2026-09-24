package Aula15Exercicio03;

import java.util.Scanner;

public class verificarLetraMouF {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite apenas F para Feminino ou M para Masculino:  ");
		String sexo = scan.nextLine();
		
		if (sexo.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		} else if (sexo.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo invalido");
		}
		
		scan.close();
		return;

	}

}
