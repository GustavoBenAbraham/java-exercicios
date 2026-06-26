package Aula13Exercicio17;

import java.util.Scanner;

public class CalculadoraLojaDeTintas2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Qual o tamanho da área ?(em metros m²): ");
		 double area = scan.nextDouble();
		 
		 System.out.println("Você Digitou os seguintes valores:");
		 System.out.println("Metros: " + area + "m²");
		 
		 // Litros necessários com 10% de folga
		 double litrosNecessarios =  (area / 6) * 1.10;
		 
		 // Apenas latas
		 int latas = (int) Math.ceil(litrosNecessarios / 18);
		 double precoLatas = latas * 80;
		 
		 int galoes = (int) Math.ceil(litrosNecessarios / 3.6);
		 double precoGaloes = galoes * 25;
		 
		 // Mistura de latas e galões
		 int latasMistura = (int)(litrosNecessarios / 18);
		 double restante = litrosNecessarios - (latasMistura * 18);
		 int galoesMistura = (int) Math.ceil(restante / 3.6);
		 double precoMistura = (latasMistura * 80) + (galoesMistura * 25);

		 
		 System.out.println("\n===== RESUMO DE MATERIAL ===== ");
		 
		 System.out.printf("Litros necessários: %.2f L%n%n", litrosNecessarios);
		 
		 System.out.println("APENAS LATAS");
		 System.out.printf("Quantidade: %d lata(s)%n", galoes);
		 System.out.printf("Preço: R$ %.2f%n%n", precoLatas);
		 
		 System.out.println("APENAS GALÕES");
		 System.out.printf("Quantidade: %d galão(ões)%n", galoes);
		 System.out.printf("Preço: R$ %.2f%n%n", precoGaloes);
		 
		 System.out.println("MISTURA");
		 System.out.printf("Latas: %d%n", latasMistura);
		 System.out.printf("Galões: %d%n", galoesMistura);
		 System.out.printf("Preço: R$ %.2f%n%n", precoMistura);
		 
		 
		 scan.close();


	}

}
