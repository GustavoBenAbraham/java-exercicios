package Aula13Exercicio12;

import java.util.Scanner;

public class CalculoPesoIdeal {

	public static void main(String[] args) {
		
		   Scanner scan = new Scanner(System.in);
		   
		   System.out.println("Digite por favor sua altura: ");
		   double altura = scan.nextDouble();
		   
			System.out.println("Você Digitou o seguinte valor:");
			System.out.println("Altura: " + altura);
			
			double pesoIdeal = (72.7 * altura ) - 58;
			
			System.out.println("Seu peso ideal é: " + String.format("%.2f", pesoIdeal ) + "kg");
			
			scan.close();

	}

}
