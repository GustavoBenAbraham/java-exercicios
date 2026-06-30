package Aula15Exercicio14;

import java.util.Scanner;

public class leitorDeNotasParciais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite suas duas últimas notas: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
        
        double media = (nota1 + nota2) / 2;
        
        
        String conceito;
        String situacao;
        
        
        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
        } else {
            conceito = "E";
        } 
       
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            situacao = "APROVADO";
        } else {
            situacao = "REPROVADO";
        }
        
        System.out.println("\n-----------------------------");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);
        System.out.println("-----------------------------");
		
       
		
		scan.close();
		return;

	}

}
