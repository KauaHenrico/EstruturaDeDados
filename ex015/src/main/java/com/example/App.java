package com.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {

        AAB arvore = new AAB();

        arvore.add(10);

        System.out.println("Árvore: " + arvore);

        arvore.add(5);

        System.out.println("Árvore: " + arvore);

        arvore.add(2);
        arvore.add(5);
        arvore.add(7);
        arvore.add(15);

        System.out.println("Árvore: " + arvore);

        System.out.println("Busca 5: " + arvore.contains(5));
        System.out.println("Busca 7: " + arvore.contains(7));
        System.out.println("Busca 15: " + arvore.contains(15));
        System.out.println("Busca 20: " + arvore.contains(20));

    }
    
}