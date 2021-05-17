package vehiculos;

public class Automovil {
	private String marca;
	private String modelo;
	private int velocidadMaxima;
	private int velocidadActual=0;
	private boolean encendido;
	private String patente;
	private String color;
	
	public void setMarca(String m) {
		marca = m;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void acelerar(int velocidad) {
		//Funcionalidad para que no haya velocidad actual superior a la maxima
		velocidadActual = velocidadActual + velocidad;
	}
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	
	public void frenar(int velocidad) {
		//TODO: Implementar el freno
	}
	
	public void encender() {
		
	}
	
	public void apagar() {
		
	}

	

}
