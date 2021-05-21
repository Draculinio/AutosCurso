package principal;

import vehiculos.Automovil;

public class Principal {

	public static void main(String[] args) {
		//creo un objeto de la clase Automovil llamado miAuto y llamo al primer constructor
		Automovil miAuto = new Automovil("Ford", "Falcon", 160, "aaa111", "Celeste");
		//creo un objeto de la clase Automovil llamado miSegundoAuto y llamo al segundo constructor
		Automovil miSegundoAuto = new Automovil("Chevrolet", "Corsa",160,"ccc222");
		//imprimo la velocidad del primer auto
		System.out.println(miAuto.getMarca());
		//imprimo la velocidad del segundo auto
		System.out.println(miSegundoAuto.getColor());
		//enciendo el auto
		miAuto.encender();
		//acelero el auto
		miAuto.acelerar(30);
		System.out.println(miAuto.getVelocidadActual());
		//lo vuelvo a acelerar
		miAuto.acelerar(50);
		System.out.println(miAuto.getVelocidadActual());
		//intento acelerar el vehículo más allá de su velocidad máxima
		miAuto.setVelocidadMaxima(18000);
		System.out.println(miAuto.getVelocidadMaxima());
		
	}

}

//