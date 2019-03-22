package com.unopar.cars;

import com.unopar.cars.models.Carro;
import com.unopar.cars.models.Motor;

public class CarsApp {

	
	/*
	 * Método principal do projeto
	 */
	public static void main(String[] args) {
		
		/*
		 * Cria os dois objetos, motor, carro e passa os parâmetros com as informações respectivas de cada um.
		 */
		
		Motor motor_carro1 = new Motor(2.0, 8451208, 140);
		Carro carro1 = new Carro("ABC1515", "FIAT", "UNO", "Automatico", motor_carro1);
		
		Motor motor_carro2 = new Motor(1.0, 8751208, 100);
		Carro carro2 = new Carro("DEF2415", "FORD", "QUALQUER", "Automatico", motor_carro2);
		
		/*
		 * Chama os métodos de cada carro
		 */
		
		carro1.ligar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		
		carro2.ligar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		carro2.acelerar();
		
		/*
		 * Compara qual carro está mais rápido
		 */
		
		if (carro1.getVelocidade_atual() > carro2.getVelocidade_atual()) {
			System.out.println("O carro 1 está mais veloz a " + carro1.getVelocidade_atual() + " km/h");
		}
		if (carro2.getVelocidade_atual() > carro1.getVelocidade_atual()) {
			System.out.println("O carro 2 está mais veloz a " + carro2.getVelocidade_atual() + " km/h");
		}
		if (carro2.getVelocidade_atual() == carro1.getVelocidade_atual()) {
			System.out.println("Os dois carros estão na mesma velocidade.");
		}
		
	}
}
