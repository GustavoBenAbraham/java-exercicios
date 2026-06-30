package cursobasicojava15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um dia da semana (1-7) ");
		
		int diaSemana = scan.nextInt();
		
		 switch(diaSemana) {
		 case 1: 
		 case 2: 
		 case 3: 
		 case 4: 
		 case 5: System.out.println("Quinta"); break;
		 case 6: System.out.println("Sexta"); break;
		 case 7: System.out.println("Sabado"); break;
		 default: System.out.println("Não é um dia da semana válido");
		
		 
		 scan.close();
		 return;
		 }
		
	}

}
