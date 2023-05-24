package com.example;

public class Main {
    public static void main(String[] args) {
        LinkedList<Aluno> listaAlunos = new LinkedList<>();

        Aluno aluno1 = new Aluno("João", 18, 8.5);
        Aluno aluno2 = new Aluno("Maria", 20, 9.0);
        Aluno aluno3 = new Aluno("Pedro", 19, 7.8);

        listaAlunos.insert(aluno1);
        listaAlunos.insert(aluno2);
        listaAlunos.insert(aluno3);

        listaAlunos.print();
    }
}
