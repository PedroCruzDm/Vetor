package com.mycompany.arrayvetor;
import java.util.Scanner;

public class ArrayVetor {
    
    public static void main(String[] args) {
        int max = 10;
        int[] numeros = new int[max];
        Scanner a = new Scanner(System.in);
        int soma = 0;

        // Inserindo valores no vetor
        for (int i = 0; i < numeros.length; i++) { 
            System.out.print("Digite um numero para a posicao " + i + ": ");
            numeros[i] = a.nextInt();  // Lê o valor e insere no vetor
            soma += numeros[i];
        }

        System.out.println("\nValores inseridos no vetor:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\nA soma total é: " + soma);
        
        // Chamando a função para encontrar o maior valor
        int maiorValor = encontrarMaiorValor(numeros);
        System.out.println("O maior valor no vetor é: " + maiorValor);

        // Chamando a função para encontrar o menor valor
        int menorValor = encontrarMenorValor(numeros);
        System.out.println("O menor valor no vetor é: " + menorValor);
        
        a.close();
    }
    
    // Função para encontrar o maior valor no vetor
    public static int encontrarMaiorValor(int[] vetor) {
        int maior = vetor[0]; // Começa assumindo que o primeiro é o maior
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i]; // Atualiza o maior se encontrar um valor maior
            }
        }
        return maior;
    }

    // Função para encontrar o menor valor no vetor
    public static int encontrarMenorValor(int[] vetor) {
        int menor = vetor[0]; // Começa assumindo que o primeiro é o menor
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i]; // Atualiza o menor se encontrar um valor menor
            }
        }
        return menor;
    }
}
