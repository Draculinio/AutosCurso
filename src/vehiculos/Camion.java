package vehiculos;

public class Camion {
	private String marca;
	private String modelo;
	private String color;
	private String capacidad;
	private String patente;
	private int velocidadMax;
	private int velocidadActual;
	private boolean encendido;

	public Camion(String marca,String modelo,String color,String capacidad,String patente,int velocidadMaxima,int velocidadActual) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.capacidad = capacidad;
		this.patente = patente;
		this.velocidadMax = velocidadMaxima;
		this.velocidadActual = velocidadActual;
		}
}
