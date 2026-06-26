package Aula13Exercicio11;

import java.util.Scanner;

public class CalcularNumeroInteriroeNumeroReal {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
    	System.out.println("Entre com um número inteiro: ");
    	int numero1 = scan.nextInt();
    	
    	System.out.println("Entre com outro número inteiro: ");
    	int numero2 = scan.nextInt();
    	
    	System.out.println("Entre com um número real: ");
    	double numeroReal = scan.nextDouble();
  
		System.out.println("Você Digitou os seguintes valores:");
		
		System.out.println("Primeiro número Inteiro: " + numero1);
		System.out.println("Segundo número Inteiro: " + numero2);
		System.out.println("Número Real: " + numeroReal);
		
		double a = (numero1 *2) * (numero2 / 2.0);
		double b = (numero1 * 3) + numeroReal;
		double c = Math.pow(numeroReal, 3);
		
		System.out.println("O resultado é: ");
		
		System.out.println(" 1) O produto do dobro com metade do segundo: " + a);
		System.out.println(" 2) A soma do triplo do primeiro com o terceiro: " + b);
		System.out.println(" 3) O terceiro elavado ao Cubo: " + c);
		
		scan.close();
		
		
		
		
		
	}

}
