package Aula15Exercicio08;

import java.util.Scanner;

public class calcularMelhorDesconto {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		   System.out.println("Informe o preço de 03 produtos: ");
		   double n1 = scan.nextDouble();
		   double n2 = scan.nextDouble();
		   double n3 = scan.nextDouble();
		   
		   System.out.println("Você Digitou os seguintes valores:");
		   
		   System.out.println("Produto número 01:  " + n1);
		   System.out.println("Produto número 03:  " + n2);
		   System.out.println("Produto número 04:  " + n3);
		   
		   if (n1 < n2 && n1 <= n3) {
				System.out.println("O produto mais barato é: " + n1);
			} else if (n2 < n1 && n2 < n3) {
				System.out.println("O produto mais barato é : " + n2);
			} else {
				System.out.println("O produto mais barato é: " + n3);
			}

		
		   scan.close();
		   

	}

}
