package com.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);
        Random random = new Random();

        // Preencha o vetor com números inteiros aleatórios
        for (int i = 0; i < 1000; i++) {
            vetor.inserir(random.nextInt(1000));
        }

        long tempoInicial, tempoFinal;
        int maiorElemento;

        // Medição do tempo de execução do método recursivo
        tempoInicial = System.nanoTime();
        maiorElemento = vetor.encontrarMaiorRecursivo();
        tempoFinal = System.nanoTime();

        System.out.println("Maior elemento (recursivo): " + maiorElemento);
        System.out.println("Tempo de execução (recursivo): " + (tempoFinal - tempoInicial) + " nanosegundos");

        // Medição do tempo de execução do método iterativo
        tempoInicial = System.nanoTime();
        maiorElemento = vetor.encontrarMaiorIterativo();
        tempoFinal = System.nanoTime();

        System.out.println("Maior elemento (iterativo): " + maiorElemento);
        System.out.println("Tempo de execução (iterativo): " + (tempoFinal - tempoInicial) + " nanosegundos");
    }
}

