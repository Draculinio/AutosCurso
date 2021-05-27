
//Paquete en el que tenemos nuestra clase Automovil. Recuerden ponerlo en min�scula
package vehiculos;

public class Automovil {
	/*
	 * Declaramos todo como privado por el principio de "ocultamiento de datos"
	 * Seg�n el cual no queremos exponer directamente los datos para que no sean
	 * manipulados directamente
	 */
	private String marca;
	private String modelo;
	private int velocidadMaxima;
	private int velocidadActual = 0;
	private boolean encendido = false;
	private String patente;
	private String color;

	/*
	 * Constructor de clase. Lo llamamos para construir un objeto de nuestra clase
	 * Le pasamos todos los par�metros que queremos que tomen valor desde un
	 * principio Cuando el par�metro y la variable de la clase se llaman igual, la
	 * manera de distinguirlo es ponerle this a la variable de la clase.
	 */
	public Automovil(String marca, String modelo, int velocidadMaxima, String patente, String color) {
		this.marca = marca;
		this.setModelo(modelo);
		this.velocidadMaxima = velocidadMaxima;
		this.setPatente(patente);
		this.setColor(color);
	}

	/*
	 * Podemos crear cuantos constructores queramos siempre y cuando los par�metros
	 * sean distintos o est�n en distinta cantidad
	 */
	public Automovil(String marca, String modelo, int velocidadMaxima, String patente) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
		this.patente = patente;
		this.color = "Marron";
	}

	/*
	 * Setter: Cambiamos el valor de marca. Los setter son importantes ya que Como
	 * dijimos antes, ocultamos los datos y estos no pueden ser modificados
	 * externamente Le pasamos un par�metro de tipo String al que llamamos m y le
	 * decimos a marca que valga m
	 */
	public void setMarca(String m) {
		marca = m;
	}

	/*
	 * Getter: Como los datos de la clase son ocultos entonces la �nica forma de
	 * devolver datos es mediante un getter Lo que hago es decir que tipo voy a
	 * devolver (en este caso un String) y retornar la marca
	 */
	public String getMarca() {
		return marca;
	}

	/*
	 * Quiero acelerar mi auto (esto es un setter) dependo de que la velocidad
	 * actual + la velocidad que acelero (que viene del par�metro velocidadActual)
	 * sean menor o igual a la velocidad m�xima. Caso contrario la velocidad actual
	 * tiene que valer lo mismo que la velocidad m�xima
	 */
	public void acelerar(int velocidadActual) {
		int velocidadFinal = this.velocidadActual + velocidadActual;
		if (velocidadFinal < velocidadMaxima) {
			this.velocidadActual = velocidadFinal;
		} else {
			this.velocidadActual = velocidadMaxima;
		}

		// this.velocidadActual = this.velocidadActual + velocidadActual;
	}

	/*
	 * Otro getter, retorna un int con la velocidad actual
	 */
	public int getVelocidadActual() {
		return velocidadActual;
	}

	/*
	 * frenar frena nuestro auto. Le pasamos un int que es la velocidad y si la
	 * velocidad actual - la velocidad de freno son mayores a 0 entonces esa pasa a
	 * ser la velocidad actual. Caso contrario es 0.
	 */
	public void frenar(int velocidad) {
		int velocidadFinal = this.velocidadActual - velocidadActual;
		if (velocidadFinal > 0) {
			this.velocidadActual = velocidadFinal;
		} else {
			this.velocidadActual = 0;
		}
	}

	/*
	 * encender y apagar son dos setter que modifican el estado del encendido
	 */
	public void encender() {
		if (encendido == true) {
			encendido = false;
		} else {
			System.out.println("El auto ya esta encendido");
		}
	}

	public void apagar() {
		if (encendido == true) {
			encendido = false;
		} else {
			System.out.println("El auto ya esta apagado");
		}
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
