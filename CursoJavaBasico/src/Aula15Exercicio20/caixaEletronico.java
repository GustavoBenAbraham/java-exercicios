package Aula15Exercicio20;
import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do saque (entre 10 e 600): ");
        int valor = scan.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido. O saque deve estar entre 10 e 600 reais.");
        } else {
            int restante = valor;

            int[] notas = {200, 100, 50, 20, 10, 5, 2};
            
            System.out.println("Notas fornecidas para o saque de R$ " + valor + ":");
            
            for (int nota : notas) {
                int quantidade = restante / nota;
                if (quantidade > 0) {
                    System.out.println(quantidade + " nota(s) de R$ " + nota);
                    restante %= nota;
                }
            }


            if (restante > 0) {
                System.out.println("Valor residual de R$ " + restante + " não pode ser sacado (notas disponíveis apenas a partir de R$ 2).");
            }
        }

        scan.close();
        return;
    }
}