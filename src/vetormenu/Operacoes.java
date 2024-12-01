/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Operacoes {

    // Método para entrada dos dados dos vetores
    public static boolean entrada(int[] vetor, int tamanho, String nomeVetor, Scanner scanner) {
        System.out.println("Entrada do VETOR " + nomeVetor);
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        return true;  // Indica que os dados foram preenchidos
    }

    // Método para imprimir os vetores
    public static void imprime(int[] vetor, int tamanho, String nomeVetor) {
        System.out.println("VETOR " + nomeVetor);
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }

    // Método para somar os vetores
    public static void soma(int[] vetorA, int[] vetorB, int tamanho) {
        System.out.println("\nSOMA");
        for (int i = 0; i < tamanho; i++) {
            int soma = vetorA[i] + vetorB[i];
            System.out.println("Soma dos elementos " + (i + 1) + ": " + soma);
        }
    }

    // Método para subtrair os vetores
    public static void subtrai(int[] vetorA, int[] vetorB, int tamanho) {
        System.out.println("\nDIFERENCA");
        for (int i = 0; i < tamanho; i++) {
            int diferenca = vetorA[i] - vetorB[i];
            System.out.println("Diferenca dos elementos " + (i + 1) + ": " + diferenca);
        }
    }
}
