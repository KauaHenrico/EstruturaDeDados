package com.ex003;

public class Main {
    public static void main(String[] args) {
        VetorAluno vetorAluno = new VetorAluno();

        Aluno a = new Aluno("Kauã Henrico", 10, 20);
        Aluno b = new Aluno("João", 10, 20);
        Aluno c = new Aluno("Lucia", 10, 20);
        Aluno d = new Aluno("Ricardo", 10, 20);
        Aluno e = new Aluno("Jubileu", 10, 20);

        vetorAluno.adiciona(a);
        vetorAluno.adiciona(b);
        vetorAluno.adiciona(c);
        vetorAluno.adiciona(d);
        vetorAluno.adiciona(e);

        System.out.println("Tamanho do vetor de alunos: " + vetorAluno.tamanho());

        vetorAluno.remove(b);

        System.out.println("Tamanho do vetor de alunos após remover um aluno: " + vetorAluno.tamanho());

        System.out.println("O vetor de alunos contém o aluno 'João'? " + vetorAluno.contem(b));
    }
}
