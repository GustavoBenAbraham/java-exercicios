package Aula13Exercicio16;

import java.util.Scanner;

public class CalculoParaPintarParede {

	public static void main(String[] args) {
		
         Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Qual o tamanho da área ?(em metros m²): ");
		 double area = scan.nextDouble();
		 
		 System.out.println("Você Digitou os seguintes valores:");
		 System.out.println("Metros: " + area + "m²");
		 
		 double litrosNecessarios =  area / 3;
		 double valorLata = 80;
		 int latas = (int) Math.ceil(litrosNecessarios / 18);
		 double precoTotal = latas * valorLata;
		 
		 System.out.println(" ===== RESUMO DE MATERIAL ===== ");
		 System.out.printf("%-28s %.2f L%n", "Litros de tinta necessários:", litrosNecessarios);
		 System.out.printf("%-28s und%n", "Latas de tinta necessárias: " + latas);
		 System.out.printf("%-28s R$ %.2f%n", "Valor total:", precoTotal);
		 
		 scan.close();
		 
	}

}
