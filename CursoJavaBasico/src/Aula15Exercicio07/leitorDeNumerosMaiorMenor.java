package Aula15Exercicio07;

import java.util.Scanner;

public class leitorDeNumerosMaiorMenor {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
	   System.out.println("Digite três números diferentes: ");
	   double n1 = scan.nextDouble();
	   double n2 = scan.nextDouble();
	   double n3 = scan.nextDouble();
	   
	   System.out.println("Você Digitou os seguintes valores:");
	   
	   System.out.println("Primeiro número: " + n1);
	   System.out.println("Segundo número: " + n2);
	   System.out.println("terceiro número: "+ n3);
	   
	   if (n1 >= n2 && n1 >= n3) {
			System.out.println("O maior número é: " + n1);
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println("O maior número é: " + n2);
		} else {
			System.out.println("O maior número é: " + n3);
		}
	
	   
	   scan.close();

	}

}
