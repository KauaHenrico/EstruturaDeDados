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
    
    public double calcularDistanciaEuclidiana(PontoCartesiano outroPonto) {
        double dx = this.x - outroPonto.x;
        double dy = this.y - outroPonto.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
