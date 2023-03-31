package com.estruturadedados;
//Dab = ( xb- xa )2 + (yb - ya )2
public class Main {
    public static void main(String[] args) {
    //criando dois pontos
        PontoCartesiano ponto1 = new PontoCartesiano(1.0, 2.0);
        PontoCartesiano ponto2 = new PontoCartesiano(3.0, 4.0);
        
        
        double distancia = ponto1.calcularDistanciaEuclidiana(ponto2);
        System.out.println("A distância entre os pontos é: " + distancia);
    }
}
