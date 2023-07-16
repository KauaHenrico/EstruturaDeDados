package com.example;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, Aluno> map = new HashMap<>();

        Aluno aluno1 = new Aluno("Alice", 1111);
        Aluno aluno2 = new Aluno("Bruno", 2222);
        Aluno aluno3 = new Aluno("Carolina", 3333);
        Aluno aluno4 = new Aluno("Daniel", 4444);
        Aluno aluno5 = new Aluno("Eduarda", 5555);
        Aluno aluno6 = new Aluno("Felipe", 6666);
        Aluno aluno7 = new Aluno("Gabriela", 7777);
        Aluno aluno8 = new Aluno("Hugo", 8888);
        Aluno aluno9 = new Aluno("Isabela", 9999);
        Aluno aluno10 = new Aluno("João", 1010);

        map.put(aluno1.getChave(), aluno1);
        map.put(aluno2.getChave(), aluno2);
        map.put(aluno3.getChave(), aluno3);
        map.put(aluno4.getChave(), aluno4);
        map.put(aluno5.getChave(), aluno5);
        map.put(aluno6.getChave(), aluno6);
        map.put(aluno7.getChave(), aluno7);
        map.put(aluno8.getChave(), aluno8);
        map.put(aluno9.getChave(), aluno9);
        map.put(aluno10.getChave(), aluno10);

        int chaveBusca = 3333;
        Aluno alunoEncontrado = map.get(chaveBusca);
        if (alunoEncontrado != null) {
            int hash = Integer.valueOf(chaveBusca).hashCode();
            System.out.println("Aluno encontrado: " + alunoEncontrado.getNome() + " - Hash: " + hash);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        // Removendo um aluno pela chave
        int chaveRemocao = 5555;
        Aluno alunoRemovido = map.remove(chaveRemocao);
        if (alunoRemovido != null) {
            System.out.println("Aluno removido: " + alunoRemovido.getNome());
        } else {
            System.out.println("Aluno não encontrado para remoção.");
        }

        int chaveBusca2 = 5555;
        Aluno alunoEncontrado2 = map.get(chaveBusca2);
        if (alunoEncontrado2 != null) {
            int hash = Integer.valueOf(chaveBusca2).hashCode();
            System.out.println("Aluno encontrado: " + alunoEncontrado2.getNome() + " - Hash: " + hash);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        Aluno aluno11 = new Aluno("Laura", 1212);
        Aluno aluno12 = new Aluno("Matheus", 2323);
        Aluno aluno13 = new Aluno("Natalia", 3434);
        map.put(aluno11.getChave(), aluno11);
        map.put(aluno12.getChave(), aluno12);
        map.put(aluno13.getChave(), aluno13);

        System.out.println("Tamanho do Map: " + map.size());
    }
}
