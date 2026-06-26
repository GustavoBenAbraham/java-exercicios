package Aula13Exercicio09;

import java.util.Scanner;

public class ConverterFarenheitEmCelsius {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite a temperatura em °F: ");
			double farenheit = scan.nextDouble();
			
			double celsius = (farenheit - 32)/ 1.8;
			
     		System.out.println(farenheit + " °F é igual a " + celsius + " °C");
			
	     scan.close();

	
			
		
	}

}
