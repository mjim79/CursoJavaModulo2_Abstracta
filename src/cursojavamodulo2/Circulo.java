package cursojavamodulo2;

public class Circulo extends Figura {
	// atributos de la clase
	private double radio;
	
	// constructor
	public Circulo(Punto punto, double radio) {
		this.p = punto;
		this.radio=radio;
	}
	
	// implementación de métodos de la clase abstracta
	@Override
	public double area() {
		return PI * radio * radio;
	}
}
