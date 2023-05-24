package com.example;

public class LDE<T> {
    private No<T> inicio;
    private No<T> fim;

    public void insereInicio(T objeto) {
        No<T> novoNo = new No<>(objeto);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.setProximo(inicio);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
        }
    }

    public void insereFim(T objeto) {
        No<T> novoNo = new No<>(objeto);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            novoNo.setAnterior(fim);
            fim = novoNo;
        }
    }

    public boolean busca(T objeto) {
        No<T> atual = inicio;

        while (atual != null) {
            if (atual.getObjeto().equals(objeto)) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
    }

    public boolean remove(T objeto) {
        No<T> atual = inicio;

        while (atual != null) {
            if (atual.getObjeto().equals(objeto)) {
                if (atual == inicio) {
                    inicio = inicio.getProximo();
                    if (inicio != null) {
                        inicio.setAnterior(null);
                    } else {
                        fim = null;
                    }
                } else if (atual == fim) {
                    fim = fim.getAnterior();
                    if (fim != null) {
                        fim.setProximo(null);
                    } else {
                        inicio = null;
                    }
                } else {
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                }
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
    }

    public void imprime() {
        System.out.println("Elementos da lista (do início ao fim):");
        No<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.getObjeto());
            atual = atual.getProximo();
        }

        System.out.println("Elementos da lista (do fim ao início):");
        atual = fim;
        while (atual != null) {
            System.out.println(atual.getObjeto());
            atual = atual.getAnterior();
        }
    }

    private static class No<T> {
        private T objeto;
        private No<T> anterior;
        private No<T> proximo;

        public No(T objeto) {
            this.objeto = objeto;
        }

        // Getters e setters

        public T getObjeto() {
            return objeto;
        }

        public void setObjeto(T objeto) {
            this.objeto = objeto;
        }

        public No<T> getAnterior() {
            return anterior;
        }

        public void setAnterior(No<T> anterior) {
            this.anterior = anterior;
        }

        public No<T> getProximo() {
            return proximo;
        }

        public void setProximo(No<T> proximo) {
            this.proximo = proximo;
        }
    }
}
