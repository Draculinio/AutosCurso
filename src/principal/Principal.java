package principal;

import vehiculos.Automovil;

public class Principal {

	public static void main(String[] args) {
		
		String var = "Hola Mundo";
		
		Automovil auto = new Automovil();
		auto.setMarca("Ferrari");
		System.out.println(auto.getMarca());
		auto.acelerar(100);
		System.out.println(auto.getVelocidadActual());
		auto.frenar();
		
	}

}
