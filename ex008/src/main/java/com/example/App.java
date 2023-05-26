package com.example;

import java.util.Arrays;
import java.util.Random;

public class App {
        public static void main(String[] args) {
            Vetor vetor = new Vetor(1000);
            Random random = new Random();
    
            // Preencha o vetor com números inteiros aleatórios
            for (int i = 0; i < 1000; i++) {
                vetor.inserir(random.nextInt(1000));
            }
    
            // Ordena o vetor para garantir a corretude da pesquisa binária
            Arrays.sort(vetor.elementos, 0, vetor.obterTamanho());
    
            int elementoPesquisado = vetor.obterElemento(vetor.obterTamanho() - 1);
    
            long tempoInicial, tempoFinal;
            int indiceEncontrado;
    
            // Medição do tempo de execução da pesquisa binária iterativa
            tempoInicial = System.nanoTime();
            indiceEncontrado = vetor.pesquisaBinariaIterativa(elementoPesquisado);
            tempoFinal = System.nanoTime();
    
            System.out.println("Pesquisa binária iterativa:");
            System.out.println("Elemento encontrado no índice: " + indiceEncontrado);
            System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + " nanosegundos");
    
            // Medição do tempo de execução da pesquisa binária recursiva
            tempoInicial = System.nanoTime();
            indiceEncontrado = vetor.pesquisaBinariaRecursiva(elementoPesquisado);
            tempoFinal = System.nanoTime();
    
            System.out.println("\nPesquisa binária recursiva:");
            System.out.println("Elemento encontrado no índice: " + indiceEncontrado);
            System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + " nanosegundos");
        }
    }
    