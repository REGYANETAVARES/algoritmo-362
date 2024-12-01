/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetormenu;
import java.util.Scanner;

public class VetorMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int op;
        boolean dadosA = false, dadosB = false;
        
        do {
            // Exibe o menu
            System.out.println("\nVETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("OPCAO: ");
            
            op = scanner.nextInt();  // Lê a opção do menu
            
            switch (op) {
                case 1:  // Dados do VETOR A
                    dadosA = Operacoes.entrada(vetorA, 5, "A", scanner);
                    break;
                
                case 2:  // Dados do VETOR B
                    dadosB = Operacoes.entrada(vetorB, 5, "B", scanner);
                    break;
                
                case 3:  // Imprime os vetores
                    if (dadosA && dadosB) {
                        Operacoes.imprime(vetorA, 5, "A");
                        Operacoes.imprime(vetorB, 5, "B");
                    } else {
                        System.out.println("\nEscolha primeiro as opções 1 e 2.");
                    }
                    break;
                
                case 4:  // Soma os vetores
                    if (dadosA && dadosB) {
                        Operacoes.soma(vetorA, vetorB, 5);
                    } else {
                        System.out.println("\nEscolha primeiro as opções 1 e 2.");
                    }
                    break;
                
                case 5:  // Subtrai os vetores
                    if (dadosA && dadosB) {
                        Operacoes.subtrai(vetorA, vetorB, 5);
                    } else {
                        System.out.println("\nEscolha primeiro as opções 1 e 2.");
                    }
                    break;
                
                case 6:  // Sai do programa
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }
            
        } while (op != 6);  // O programa continua até a opção 6 (sair)
        
        scanner.close();
    }
}
