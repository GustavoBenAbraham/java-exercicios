package Aula13Exercicio13;

import java.util.Scanner;

public class PesoIdealParaHomensEparaMulheres {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		   
		   System.out.println("Digite por favor sua altura (em metros): ");
		   double altura = scan.nextDouble();
		   
		   System.out.println("Digite por favor sexo (H para Homens M para mulheres): ");
		   String sexo = scan.next();
		   
		   double pesoIdeal;
		   if (sexo.equalsIgnoreCase("H")) {
			   pesoIdeal = 72.7 * altura - 58;
		   } else if (sexo.equalsIgnoreCase("M")) {
			   pesoIdeal =  62.1 * altura - 44.7;
		   } else {
			   System.out.println("Sexo inválido Use 'H' ou 'M' apenas. ");
			   scan.close();
			   return;
		   }
		   
		   System.out.println("Digite, por favor, seu peso: ");
		   double peso = scan.nextDouble();
		   
		   if (peso < pesoIdeal - 1) {
			   System.out.println("Você está abaixo do peso ideal. ");
		   } else if (peso > pesoIdeal + 1) {
			   System.out.println("Você está acima do peso ideal. ");
		   } else {
			   System.out.println("Parabéns! Você está no peso ideal. ");
		   }
		
			scan.close();
			

	}

}
