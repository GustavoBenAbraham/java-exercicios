package Aula15Exercicio10;

import java.util.Scanner;

public class bomDia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite seu turno: (M)-Matutino | (V)- Vespertino | (N)- Noturno ");
		
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia aluno(a)!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde aluno(a)!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite aluno(a)!");
        } else {
            System.out.println("Valor Inválido!");
        }
		
		
			   
	   scan.close();
	   
	   return;
		   }
		
		
	}


