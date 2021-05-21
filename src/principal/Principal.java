package principal;

import vehiculos.Automovil;

public class Principal {

	public static void main(String[] args) {
		
		Automovil miAuto = new Automovil("Ford", "Falcon", 160, "aaa111", "Celeste");
		Automovil miSegundoAuto = new Automovil("Chevrolet", "Corsa",160,"ccc222");
		System.out.println(miAuto.getMarca());
		System.out.println(miSegundoAuto.getColor());
		miAuto.encender();
		miAuto.acelerar(30);
		System.out.println(miAuto.getVelocidadActual());
		miAuto.acelerar(50);
		System.out.println(miAuto.getVelocidadActual());
		miAuto.setVelocidadMaxima(18000);
		System.out.println(miAuto.getVelocidadMaxima());
		
	}

}

//