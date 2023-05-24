package com.ex003;

public interface IVetorAluno {
    void adiciona(Aluno aluno);
    int tamanho();
    boolean contem(Aluno aluno);
    boolean cheio();
    boolean remove(Aluno aluno);
}
