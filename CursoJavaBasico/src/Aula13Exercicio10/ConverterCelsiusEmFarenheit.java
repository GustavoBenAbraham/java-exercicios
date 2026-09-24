package Aula13Exercicio10;

import java.util.Scanner;

public class ConverterCelsiusEmFarenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em °C: ");
		double celsius = scan.nextDouble();
		
		double farenheit = (celsius * 1.8) + 32;
		
 		System.out.println(celsius + " °C é igual a " + farenheit + " °F");
 		
 		scan.close();
	}

}
