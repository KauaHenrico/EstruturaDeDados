package com.example;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe LDE
        LDE lde = new LDE();

        // Inserindo elementos no início da lista
        lde.insereInicio(5);
        lde.insereInicio(10);
        lde.insereInicio(15);

        // Inserindo elementos no final da lista
        lde.insereFim(20);
        lde.insereFim(25);
        lde.insereFim(30);

        // Imprimindo a lista
        lde.imprime();

        // Realizando busca de elementos
        System.out.println("Busca de elementos:");
        System.out.println("Existe o valor 15? " + lde.busca(15));
        System.out.println("Existe o valor 25? " + lde.busca(25));
        System.out.println("Existe o valor 35? " + lde.busca(35));

        // Removendo elementos da lista
        System.out.println("Removendo elementos:");
        System.out.println("Removido o valor 10? " + lde.remove(10));
        System.out.println("Removido o valor 25? " + lde.remove(25));
        System.out.println("Removido o valor 35? " + lde.remove(35));

        // Imprimindo a lista após as remoções
        lde.imprime();
    }
}

