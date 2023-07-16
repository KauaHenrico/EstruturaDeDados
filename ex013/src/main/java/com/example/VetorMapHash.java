package com.example;

public class VetorMapHash {
    private Aluno[] vetor;
    private int size;

    public VetorMapHash() {
        this.vetor = new Aluno[20];
        this.size = 0;
    }

    private int hash(int chave) {
        return chave % this.vetor.length;
    }

    public void put(int chave, Aluno aluno) {
        int index = hash(chave);
        if (index >= vetor.length) {
            int newSize = vetor.length * 2;
            vetor = resize(vetor, newSize);
        }

        if (vetor[index] == null) {
            size++;
        }
        vetor[index] = aluno;
    }

    public Aluno get(int chave) {
        int index = hash(chave);
        return vetor[index];
    }

    public int getHash(int chave) {
        return hash(chave);
    }

    public Aluno remove(int chave) {
        int index = hash(chave);
        Aluno aluno = vetor[index];
        if (aluno != null) {
            vetor[index] = null;
            size--;
        }
        return aluno;
    }

    private Aluno[] resize(Aluno[] vetor, int newSize) {
        Aluno[] newVetor = new Aluno[newSize];
        for (int i = 0; i < vetor.length; i++) {
            newVetor[i] = vetor[i];
        }
        return newVetor;
    }

    public int size() {
        return size;
    }
}
