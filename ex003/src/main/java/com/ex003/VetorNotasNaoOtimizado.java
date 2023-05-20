package com.ex003;

public class VetorNotasNaoOtimizado implements IVetor {
	
	private double notas[] = new double[5];
	
	public void adiciona(double nota) {
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == 0) {
				this.notas[i] = nota;
				break;
			}
		}
	}
	
	public int tamanho() {
		int tamanho = 0;
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == 0) {
				
				break;
			}
			tamanho++;
		}
		return tamanho;
	}
	
	public boolean contem(int nota) {
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == nota) {
				return true;
			}
		}
		return false;
	}

	public boolean cheio() {
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean removed() {
		
}
