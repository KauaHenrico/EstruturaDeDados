package com.example;

public class LDE {
    private No primeiro;
    private No ultimo;

    private class No {
        private int valor;
        private No proximo;
        private No anterior;

        public No(int valor) {
            this.valor = valor;
            this.proximo = null;
            this.anterior = null;
        }
    }

    public void insereInicio(int valor) {
        No novoNo = new No(valor);
        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            novoNo.proximo = primeiro;
            primeiro.anterior = novoNo;
            primeiro = novoNo;
        }
    }

    public void insereFim(int valor) {
        No novoNo = new No(valor);
        if (ultimo == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
            ultimo = novoNo;
        }
    }

    public boolean busca(int valor) {
        No atual = primeiro;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public boolean remove(int valor) {
        No noRemover = buscaNo(valor);
        if (noRemover != null) {
            if (noRemover == primeiro) {
                primeiro = noRemover.proximo;
                if (primeiro != null) {
                    primeiro.anterior = null;
                } else {
                    ultimo = null;
                }
            } else if (noRemover == ultimo) {
                ultimo = noRemover.anterior;
                ultimo.proximo = null;
            } else {
                noRemover.anterior.proximo = noRemover.proximo;
                noRemover.proximo.anterior = noRemover.anterior;
            }
            return true;
        }
        return false;
    }

    private No buscaNo(int valor) {
        No atual = primeiro;
        while (atual != null) {
            if (atual.valor == valor) {
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void imprime() {
        System.out.println("Impressão no sentido normal:");
        No atual = primeiro;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }

        System.out.println("Impressão no sentido reverso:");
        atual = ultimo;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.anterior;
        }
    }
}
