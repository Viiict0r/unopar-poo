package com.unopar.cars;

import com.unopar.cars.models.Carro;
import com.unopar.cars.models.Motor;

public class CarsApp {

	
	/*
	 * M�todo principal do projeto
	 */
	public static void main(String[] args) {
		
		/*
		 * Cria os dois objetos, motor, carro e passa os par�metros com as informa��es respectivas de cada um.
		 */
		
		Motor motor_carro1 = new Motor(2.0, 8451208, 140);
		Carro carro1 = new Carro("ABC1515", "FIAT", "UNO", "Automatico", motor_carro1);
		
		Motor motor_carro2 = new Motor(1.0, 8751208, 100);
		Carro carro2 = new Carro("DEF2415", "FORD", "QUALQUER", "Automatico", motor_carro2);
		
		/*
		 * Chama os m�todos de cada carro
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
		 * Compara qual carro est� mais r�pido
		 */
		
		if (carro1.getVelocidade_atual() > carro2.getVelocidade_atual()) {
			System.out.println("O carro 1 est� mais veloz a " + carro1.getVelocidade_atual() + " km/h");
		}
		if (carro2.getVelocidade_atual() > carro1.getVelocidade_atual()) {
			System.out.println("O carro 2 est� mais veloz a " + carro2.getVelocidade_atual() + " km/h");
		}
		if (carro2.getVelocidade_atual() == carro1.getVelocidade_atual()) {
			System.out.println("Os dois carros est�o na mesma velocidade.");
		}
		
	}
}
