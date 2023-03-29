package com.estruturadedados;
public class PontoCartesiano {
    private double x;
    private double y;
    //Dab = ( xb- xa )2 + (yb - ya )2

    //construtor
    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //getters e setters
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    //método para calcular a distância euclidiana
    public double calcularDistanciaEuclidiana(PontoCartesiano outroPonto) {
        double ax = this.x - outroPonto.x;
        double by = this.y - outroPonto.y;
        return Math.sqrt(Math.pow(ax, 2) + Math.pow(by, 2));
    }
}
