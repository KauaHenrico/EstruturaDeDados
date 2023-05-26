package com.example;

public class Vetor {
    private int[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
    }

    public void inserir(int elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public int obterTamanho() {
        return tamanho;
    }

    public int obterElemento(int indice) {
        return elementos[indice];
    }

    // Implemente o método recursivo para encontrar o maior elemento
    public int encontrarMaiorRecursivo() {
        return encontrarMaiorRecursivoAux(tamanho - 1);
    }

    private int encontrarMaiorRecursivoAux(int indice) {
        if (indice == 0) {
            return elementos[0];
        }

        int maiorAnterior = encontrarMaiorRecursivoAux(indice - 1);
        return Math.max(maiorAnterior, elementos[indice]);
    }

    // Implemente o método iterativo para encontrar o maior elemento
    public int encontrarMaiorIterativo() {
        int maior = elementos[0];
        for (int i = 1; i < tamanho; i++) {
            if (elementos[i] > maior) {
                maior = elementos[i];
            }
        }
        return maior;
    }
}
