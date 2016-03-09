package cursojavamodulo2;

public class Triangulo extends Figura {
	
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(Punto p, double l1, double l2, double l3) {
		this.p = p;
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
	}
	
	@Override
	public double area() {
		return (lado1 + lado2 + lado3)/2;
	}



}
