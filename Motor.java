package com.unopar.cars.models;

public class Motor {
	
	private double potencia;
	private int numero_motor;
	private int velocidade_max = 0;
	
	/*
	 * Construtor da classe Motor, recebe os parâmetros da classe principal e atribui aos parâmetros do objeto
	 */
	public Motor(double potencia, int numero_motor, int velocidade_max) {
		
		this.potencia = potencia;
		this.setVelocidade_max(velocidade_max);
		this.numero_motor = numero_motor;
	}
	
	/*
	 * Métodos getters and setters
	 */
	
	public double getPotencia() {
		return potencia;
	}
	
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public int getNumero_motor() {
		return numero_motor;
	}
	
	public void setNumero_motor(int numero_motor) {
		this.numero_motor = numero_motor;
	}

	public int getVelocidade_max() {
		return velocidade_max;
	}

	public void setVelocidade_max(int velocidade_max) {
		this.velocidade_max = velocidade_max;
	}
	

}
