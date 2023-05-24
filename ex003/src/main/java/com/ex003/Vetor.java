package com.ex003;

public class Vetor implements IVetor {
    private Object[] elementos;
    private int totalElementos;

    public Vetor() {
        elementos = new Object[5];
        totalElementos = 0;
    }

    @Override
    public void adiciona(double elem) {
        adiciona((Object) elem);
    }

    @Override
    public int tamanho() {
        return totalElementos;
    }

    @Override
    public boolean contem(int elem) {
        for (int i = 0; i < totalElementos; i++) {
            if (elementos[i] instanceof Integer) {
                if ((int) elementos[i] == elem) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean cheio() {
        return totalElementos == elementos.length;
    }

    @Override
    public boolean remove(double elem) {
        return remove((Object) elem);
    }

    @Override
    public void adiciona(Object elem) {
        if (totalElementos < elementos.length) {
            elementos[totalElementos] = elem;
            totalElementos++;
        } else {
            // Vetor cheio, redimensionar o vetor se necessário
            Object[] novoVetor = new Object[elementos.length * 2];
            System.arraycopy(elementos, 0, novoVetor, 0, totalElementos);
            novoVetor[totalElementos] = elem;
            totalElementos++;
            elementos = novoVetor;
        }
    }

    @Override
    public boolean contem(Object elem) {
        for (int i = 0; i < totalElementos; i++) {
            if (elementos[i] != null && elementos[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object elem) {
        for (int i = 0; i < totalElementos; i++) {
            if (elementos[i] != null && elementos[i].equals(elem)) {
                // Deslocar os elementos para preencher o espaço vazio
                for (int j = i; j < totalElementos - 1; j++) {
                    elementos[j] = elementos[j + 1];
                }
                elementos[totalElementos - 1] = null;
                totalElementos--;
                return true;
            }
        }
        return false;
    }
}
