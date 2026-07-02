package Aula15Exercicio17;
import java.util.Scanner;

public class calculadoraAnoBissexto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Lógica do ano bissexto:
		 * (ano % 4 == 0) -> Divisível por 4
		 * (ano % 100 != 0) -> E NÃO divisível por 100
		 * || (ano % 400 == 0) -> OU divisível por 400
		 */
		
		System.out.println("========================================");
		System.out.println("      VERIFICADOR DE ANO BISSEXTO       ");
		System.out.println("========================================");
		System.out.println(" Descubra se um ano tem 366 dias!");
		System.out.println("----------------------------------------\n");
		
		
		System.out.print("» Digite o ano que deseja verificar (ex: 2024): ");
		int ano = scan.nextInt();
		
		System.out.println("\n----------------------------------------");
		System.out.println("Analisando o ano de " + ano + "...");
		System.out.println("----------------------------------------\n");
		
		
		boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
		
	
		if (ehBissexto) {
			System.out.println("[RESULTADO] O ano " + ano + " É BISSEXTO! (Fevereiro tem 29 dias)");
		} else {
			System.out.println("[RESULTADO] O ano " + ano + " NÃO É bissexto. (Fevereiro tem 28 dias)");
		}
		
		System.out.println("\n================ PROGRAMA FINALIZADO ================");
		
		scan.close();
		return;
		
	}

}