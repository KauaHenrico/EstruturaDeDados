package com.example;


public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Joao", 20, "123456789");
        Pessoa p2 = new Pessoa("Maria", 30, "987654321");
        Pessoa p3 = new Pessoa("Jose", 40, "123123123");
        Pessoa p4 = new Pessoa("kauã", 10, "0606737020");


            Pilha pilha = new Pilha();

            pilha.push(p1);
            pilha.push(p2);
            pilha.push(p3);
            pilha.push(p4);

          

            pilha.pop();
            System.out.println("Topo da pilha aqui: ");
            pilha.topString();
            pilha.pop();

            pilha.printAlunos();





    }
}