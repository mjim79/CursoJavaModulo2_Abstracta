package cursojavamodulo2;

public class Circulo extends Figura {
	// atributos de la clase
	double radio;
	
	// constructor
	public Circulo(Punto punto, double radio) {
		this.p = punto;
		this.radio=radio;
	}
	
	// implementaci�n de m�todos del interfaz
	@Override
	public double area() {
		return 3.14 * radio * radio;
	}
}
