package Aula17Exercicio04;

public class indicePopulacional {

	public static void main(String[] args) {
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while (popA <= popB) {
			
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			cont++;
			
		}
		System.out.println("Populção A: " + popA);
		System.out.println("Populção B: " + popB);
		System.out.println("Qts anos: " + cont);
		
		return;
	}

}
