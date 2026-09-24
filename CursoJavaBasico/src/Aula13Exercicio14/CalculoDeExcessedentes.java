package Aula13Exercicio14;

import java.util.Scanner;

public class CalculoDeExcessedentes {

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Digite o peso dos peixes: ");
		 double peso = scan.nextDouble();
		 
		 double excesso = 0;
		 double multa = 0;
		 
		 if (peso > 50) {
			 excesso = peso -50;
			 multa = excesso * 4;
			 
		 }
		 
		 System.out.println("Peso: " + peso + "kg");
		 System.out.println("Excesso: " + excesso + "kg");
		 System.out.println("Multa: R$ " + multa);
		 
		 
		 scan.close();
		 
		 
		 
		 
		 
		 
		

	}

}
