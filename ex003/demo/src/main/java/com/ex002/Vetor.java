package com.ex002;

public class Vetor {
    private Aluno[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new Aluno[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Aluno aluno) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = aluno;
            this.tamanho++;
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }
}
