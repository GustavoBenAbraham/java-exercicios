package cursobasicojava14;

import java.util.Scanner;

public class ifQuadrinho {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade. ");
		}if (idade <= 18) {
			System.out.println("É menor de idade. ");
		} else if (idade >= 68) {
			System.out.println("É idoso. ");
		}
		
		
		
		


	}

}
