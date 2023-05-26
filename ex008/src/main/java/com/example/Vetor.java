package com.example;

public class Vetor {
        protected int[] elementos;
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

    // Pesquisa binária com laço de repetição
    public int pesquisaBinariaIterativa(int chave) {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (elementos[meio] == chave) {
                return meio;
            } else if (elementos[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // Retorna -1 se o elemento não for encontrado
    }

    // Pesquisa binária com recursão
    public int pesquisaBinariaRecursiva(int chave) {
        return pesquisaBinariaRecursivaAux(chave, 0, tamanho - 1);
    }

    private int pesquisaBinariaRecursivaAux(int chave, int inicio, int fim) {
        if (inicio > fim) {
            return -1; // Retorna -1 se o elemento não for encontrado
        }

        int meio = (inicio + fim) / 2;

        if (elementos[meio] == chave) {
            return meio;
        } else if (elementos[meio] < chave) {
            return pesquisaBinariaRecursivaAux(chave, meio + 1, fim);
        } else {
            return pesquisaBinariaRecursivaAux(chave, inicio, meio - 1);
        }
    }
}
