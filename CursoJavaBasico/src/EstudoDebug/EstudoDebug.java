package EstudoDebug;

 public class EstudoDebug {
    public static void main(String[] args) {
    	
    	
        System.out.println("Iniciando o programa de testes de Debug...");
        
        int[] numeros = {10, 20, 30, 40, 50};
        int total = 0;
        
        // Vamos somar os elementos do array
        for (int i = 0; i <= numeros.length; i++) {
            total = total + numeros[i];
            System.out.println("Somando o número: " + numeros[i] + " | Total parcial: " + total);
        }
        
        double media = calcularMedia(total, numeros.length);
        System.out.println("A média final é: " + media);
    }
    
    public static double calcularMedia(int soma, int quantidade) {
        return soma / quantidade;
    }
}