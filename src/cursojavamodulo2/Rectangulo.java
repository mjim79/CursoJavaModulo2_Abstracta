package cursojavamodulo2;

public class Rectangulo extends Figura {

	double ancho;
	double alto;
	
	public Rectangulo(Punto p, double ancho, double alto) {
		this.p = p;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	@Override
	public double area() {
		return this.ancho * this.alto;
	}

}
