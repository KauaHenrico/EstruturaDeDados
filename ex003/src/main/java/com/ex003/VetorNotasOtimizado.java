package com.ex003;

import java.sql.Time;

public class VetorNotasOtimizado implements IVetor{
	private double notas[] = new double[5];
	private int totalNotas = 0;
	
	public void adiciona(double nota) {
		this.notas[totalNotas] = nota;
		totalNotas++;
	}
	
	public int tamanho() {
		return totalNotas;
	}
	
	public boolean contem(double nota) {
		for (int i = 0; i < totalNotas; i++){
			if
		}
	}

	public boolean cheio() {
		return totalNotas == notas.length;
	}
	
	
}
