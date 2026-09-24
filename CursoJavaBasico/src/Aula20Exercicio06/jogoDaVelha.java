package Aula20Exercicio06;

import java.util.Scanner;

public class jogoDaVelha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Matriz 3x3 representando o tabuleiro
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        char jogadorAtual = 'X';
        int jogadas = 0;
        boolean jogoTerminado = false;
        
        System.out.println("=== BEM-VINDO AO JOGO DA VELHA ===");
        
        while (!jogoTerminado) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", é a sua vez.");
            System.out.print("Digite a linha (0, 1 ou 2): ");
            int linha = scanner.nextInt();
            System.out.print("Digite a coluna (0, 1 ou 2): ");
            int coluna = scanner.nextInt();
            
            // Validação de jogada (posição inválida ou já ocupada)
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("\n[ERRO] Jogada inválida ou posição já ocupada! Tente novamente.\n");
                continue;
            }
            
            // Realiza a jogada
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;
            
            // Verifica se o jogador atual venceu
            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Fim de jogo! Parabéns, o Jogador " + jogadorAtual + " venceu!");
                jogoTerminado = true;
            } 
            // Verifica se deu empate (velha)
            else if (jogadas == 9) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Fim de jogo! O tabuleiro está cheio. Deu velha (empate)!");
                jogoTerminado = true;
            } 
            // Alterna o jogador
            else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
        
        scanner.close();
    }
    
    // Método para exibir o tabuleiro formatado na tela
    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("\n  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println(" ---+---+---");
        }
        System.out.println();
    }
    
    // Método para verificar se houve vitória nas linhas, colunas ou diagonais
    public static boolean verificarVitoria(char[][] tabuleiro, char p) {
        // Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == p && tabuleiro[i][1] == p && tabuleiro[i][2] == p) ||
                (tabuleiro[0][i] == p && tabuleiro[1][i] == p && tabuleiro[2][i] == p)) {
                return true;
            }
        }
        // Verifica diagonais
        if ((tabuleiro[0][0] == p && tabuleiro[1][1] == p && tabuleiro[2][2] == p) ||
            (tabuleiro[0][2] == p && tabuleiro[1][1] == p && tabuleiro[2][0] == p)) {
            return true;
        }
        return false;
    }
}