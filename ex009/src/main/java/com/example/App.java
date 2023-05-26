package com.example;

public class App 
{
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);

        // Gere um vetor aleatório com números inteiros
        vetor.gerarAleatorio(0, 1000);

        // Clone o vetor para cada método de ordenação
        Vetor vetorBubbleSort = cloneVetor(vetor);
        Vetor vetorInsertionSort = cloneVetor(vetor);
        Vetor vetorSelectionSort = cloneVetor(vetor);

        // Medição do tempo de execução do Bubble Sort
        long tempoInicialBubbleSort = System.nanoTime();
        vetorBubbleSort.bubbleSort();
        long tempoFinalBubbleSort = System.nanoTime();
        long tempoExecucaoBubbleSort = (tempoFinalBubbleSort - tempoInicialBubbleSort) / 1000000; // Converter para milissegundos

        // Medição do tempo de execução do Insertion Sort
        long tempoInicialInsertionSort = System.nanoTime();
        vetorInsertionSort.insertionSort();
        long tempoFinalInsertionSort = System.nanoTime();
        long tempoExecucaoInsertionSort = (tempoFinalInsertionSort - tempoInicialInsertionSort) / 1000000; // Converter para milissegundos

        // Medição do tempo de execução do Selection Sort
        long tempoInicialSelectionSort = System.nanoTime();
        vetorSelectionSort.selectionSort();
        long tempoFinalSelectionSort = System.nanoTime();
        long tempoExecucaoSelectionSort = (tempoFinalSelectionSort - tempoInicialSelectionSort) / 1000000; // Converter para milissegundos

        System.out.println("Tempo de execução do Bubble Sort: " + tempoExecucaoBubbleSort + " milissegundos");
        System.out.println("Tempo de execução do Insertion Sort: " + tempoExecucaoInsertionSort + " milissegundos");
        System.out.println("Tempo de execução do Selection Sort: " + tempoExecucaoSelectionSort + " milissegundos");
    }

    // Método auxiliar para clonar um vetor
    private static Vetor cloneVetor(Vetor vetor) {
        Vetor novoVetor = new Vetor(vetor.obterTamanho());
        for (int i = 0; i < vetor.obterTamanho(); i++) {
            novoVetor.inserir(vetor.obterElemento(i));
        }
        return novoVetor;
    }
}