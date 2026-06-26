package Aula13Exercicio05;

import java.util.Scanner;

public class ConverterMetrosEmCentimetros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		System.out.println(metros + "m é igual a " + centimetros + "cm");

		
		scan.close();
		

	}

}
