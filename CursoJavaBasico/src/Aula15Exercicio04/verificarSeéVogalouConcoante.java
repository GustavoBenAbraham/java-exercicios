package Aula15Exercicio04;

import java.util.Scanner;

public class verificarSeéVogalouConcoante {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("a") ||
		   letra.equalsIgnoreCase("e") ||
		   letra.equalsIgnoreCase("i") ||	   
		   letra.equalsIgnoreCase("o") ||	   
		   letra.equalsIgnoreCase("u")) {
			   System.out.println("A letra é uma VOGAL.");
		   }
		   
		   else if (letra.matches("[a-zA-Z]")) {
			   System.out.println("A letra é uma CONSOANTE."); 
		   }
		   
		   else {
			   System.out.println("Isso não é uma letra válida. ");
		   }
				   
				   
		
		 scan.close();
			 
	}

}
