package com.ex002;

public class App {
    public static void main(String[] args) {
        // criando alguns alunos
        Aluno aluno1 = new Aluno("João", 20, 8.5);
        Aluno aluno2 = new Aluno("Maria", 22, 9.0);
        Aluno aluno3 = new Aluno("Pedro", 19, 7.0);

        // criando um vetor de alunos com capacidade para 3 elementos
        Vetor alunos = new Vetor(3);

        // adicionando os alunos no vetor
        alunos.adiciona(aluno1);
        alunos.adiciona(aluno2);
        alunos.adiciona(aluno3);

        // verificando o tamanho do vetor
        System.out.println("Tamanho do vetor: " + alunos.tamanho()); // saída: Tamanho do vetor: 3

        // verificando se um aluno está presente no vetor
        Aluno aluno4 = new Aluno("João", 20, 8.5);
        boolean contemAluno4 = alunos.contem(aluno4);
        System.out.println("O vetor contém o aluno4? " + contemAluno4); // saída: O vetor contém o aluno4? true

        // criando mais alguns alunos
        Aluno aluno5 = new Aluno("Ana", 21, 9.5);
        Aluno aluno6 = new Aluno("Lucas", 23, 6.5);

        // adicionando mais alunos no vetor
        alunos.adiciona(aluno5);
        alunos.adiciona(aluno6);

        // verificando o tamanho do vetor novamente
        System.out.println("Tamanho do vetor: " + alunos.tamanho()); // saída: Tamanho do vetor: 5

        // verificando se um aluno está presente no vetor novamente
        Aluno aluno7 = new Aluno("Carlos", 20, 8.5);
        boolean contemAluno7 = alunos.contem(aluno7);
        System.out.println("O vetor contém o aluno7? " + contemAluno7); // saída: O vetor contém o aluno7? false
    }
}
