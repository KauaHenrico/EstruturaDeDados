package com.example;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe LDE
        LDE<Aluno> lde = new LDE<>();

        // Inserindo alunos na lista
        Aluno aluno1 = new Aluno(1, " João");
        Aluno aluno2 = new Aluno(2, " Maria");
        Aluno aluno3 = new Aluno(3, " Pedro");
        Aluno aluno4 = new Aluno(4, " Kauã");

        lde.insereInicio(aluno1);
        lde.insereFim(aluno2);
        lde.insereFim(aluno3);
        lde.insereFim(aluno4);

        // Imprimindo a lista de alunos
        lde.imprime();

        // Realizando busca de alunos
        System.out.println("Busca de alunos:");
        Aluno alunoBusca = new Aluno(2, "Maria");
        System.out.println("Existe o aluno " + alunoBusca.getNome() + "? " + lde.busca(alunoBusca));

        // Removendo um aluno da lista
        System.out.println("Removendo aluno:");
        System.out.println("Removido o aluno " + aluno2.getNome() + "? " + lde.remove(aluno2));

        // Imprimindo a lista de alunos após a remoção
        lde.imprime();
    }
}
