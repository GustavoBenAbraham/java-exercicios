package Aula15Exercicio15;

import java.util.Scanner;

public class calculoTriangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro lado: ");
		double lado1 = scan.nextDouble();
		
		System.out.println("Digite o valor do primeiro lado: ");
		double lado2 = scan.nextDouble();
		
		System.out.println("Digite o valor do primeiro lado: ");
		double lado3 = scan.nextDouble();
		
		System.out.println("\\n--- Resultado ---");
		
		if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("Os valores informados FORMAM um triângulo.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Classificação: Triângulo Equilátero (três lados iguais).");
            } 
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Classificação: Triângulo Isósceles (dois lados iguais).");
            } 
            else {
                System.out.println("Classificação: Triângulo Escaleno (três lados diferentes).");
            }
            
        } else {
            
            System.out.println("Os valores informados NÃO podem formar um triângulo.");
        }

	
		scan.close();
		return;
	}

}
