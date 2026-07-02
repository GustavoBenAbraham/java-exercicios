   import java.util.Scanner;
   import java.util.Random;

    public class JogoAdivinhacao {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns! Você acertou!");
                System.out.println("Tentativas: " + tentativas);
            }
        } while (tentativa != numeroSecreto);

        scanner.close();
    }
}