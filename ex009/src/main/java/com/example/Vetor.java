package com.example;

import java.util.Random;

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

    // Método de ordenação Bubble Sort
    public void bubbleSort() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    int temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }
    }

    // Método de ordenação Insertion Sort
    public void insertionSort() {
        for (int i = 1; i < tamanho; i++) {
            int chave = elementos[i];
            int j = i - 1;

            while (j >= 0 && elementos[j] > chave) {
                elementos[j + 1] = elementos[j];
                j--;
            }

            elementos[j + 1] = chave;
        }
    }

    // Método de ordenação Selection Sort
    public void selectionSort() {
        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < tamanho; j++) {
                if (elementos[j] < elementos[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int temp = elementos[i];
            elementos[i] = elementos[indiceMinimo];
            elementos[indiceMinimo] = temp;
        }
    }

    // Método para gerar números inteiros aleatórios
    public void gerarAleatorio(int min, int max) {
        Random random = new Random();
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = random.nextInt(max - min + 1) + min;
            tamanho++;
        }
    }
}
