package com.unopar.cars.models;

public class Carro {
	
	public String placa, marca, modelo, tipo_cambio;
	private int ano;
	private Motor motor;
	private final int marcha = 5;
	private int velocidade_atual = 0;
	private boolean ligado = false;
	
	/*
	 * Construtor da classe Carro, recebe os parâmetros da classe principal e atribui aos parâmetros do objeto
	 */
	public Carro(String placa, String marca, String modelo, String tipo_cambio, Motor motor) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo_cambio = tipo_cambio;
		this.motor = motor;
	}
	
	/*
	 * Getters and setters
	 */
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMarcha() {
		return marcha;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipoCambio() {
		return tipo_cambio;
	}

	public void setTipoCambio(String tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}

	
	/*
	 * Método para ligar o carro
	 */
	public void ligar() {
		if (this.ligado == false) {
			this.ligado = true;
			System.out.println("Carro ligado. " + getPlaca());
		} else {
			System.out.println("O carro já está ligado.");
		}
	}
	
	/*
	 * Método para acelerar o carro
	 */
	public void acelerar() {
		if (this.ligado == true) {
			if (getVelocidade_atual() < getMotor().getVelocidade_max()) {
				if (getMotor().getPotencia() == 1.0) {
					this.setVelocidade_atual(getVelocidade_atual() + 10);
					System.out.println("Acelerando carro com a placa " + getPlaca() + " a " + getVelocidade_atual() + "km/h");
				}
				if (getMotor().getPotencia() == 2.0) {
					this.setVelocidade_atual(getVelocidade_atual() + 20);
					System.out.println("Acelerando carro com a placa " + getPlaca() + " a " + getVelocidade_atual() + "km/h");
				}
			} else {
				System.out.println("O carro atingiu o limite de velocidade." + getPlaca() + " " + getVelocidade_atual() + "km/h");
			}
		} else {
			System.out.println("O carro não está ligado.");
		}
	}
	
	/*
	 * Método para freiar o carro
	 */
	public void freiar() {
		if (this.ligado == true) {
			if (this.velocidade_atual > 0) {
				this.velocidade_atual -= 20;
				System.out.println("Freiando carro " + getPlaca() + ". velocidade atual: " + getVelocidade_atual());
			}
		}
	}
	
	/*
	 * Método para desligar o carro
	 */
	public void desligar() {
		if (this.ligado == true) {
			this.ligado = false;
			System.out.println("Carro desligado.");
		} else {
			System.out.println("O carro já está desligado.");
		}
	}
	
	/*
	 * Getters and setters
	 */
	public int getVelocidade_atual() {
		return velocidade_atual;
	}

	public void setVelocidade_atual(int velocidade_atual) {
		this.velocidade_atual = velocidade_atual;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
}
