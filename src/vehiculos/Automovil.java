package vehiculos;

public class Automovil {
	private String marca;
	private String modelo;
	private int velocidadMaxima;
	private int velocidadActual=0;
	private boolean encendido= false;
	private String patente;
	private String color;
	
	public Automovil(String marca,String modelo,int velocidadMaxima,String patente,String color) {
		this.marca = marca;
		this.setModelo(modelo);
		this.velocidadMaxima = velocidadMaxima;
		this.setPatente(patente);
		this.setColor(color);
	}
	
	public Automovil(String marca,String modelo, int velocidadMaxima, String patente) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
		this.patente = patente;
		this.color = "Marron";
	}
	
	public void setMarca(String m) {
		marca = m;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void acelerar(int velocidadActual) {
		int velocidadFinal = this.velocidadActual + velocidadActual;
		if(velocidadFinal<velocidadMaxima) {
			this.velocidadActual = velocidadFinal;
		} else {
			this.velocidadActual = velocidadMaxima;
		}
		
		//this.velocidadActual = this.velocidadActual + velocidadActual;
	}
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	
	public void frenar(int velocidad) {
		int velocidadFinal = this.velocidadActual - velocidadActual;
		if(velocidadFinal>0) {
			this.velocidadActual = velocidadFinal;
		} else {
			this.velocidadActual = 0;
		}
	}
	
	public void encender() {
		
	}
	
	public void apagar() {
		
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

}
