package cursojavamodulo2;

public abstract class Figura {
	Punto p;
	
	public abstract double area();
	public void mover(double dx, double dy) {
		p.setX(p.getX() + dx);
		p.setY(p.getY() + dy);
		System.out.println("Figura movida a la posición (" + p.getX() + "," + p.getY() + ")");
	}
	public void pintar() {
		System.out.println("Pintando figura en la posición (" + p.getX() + "," + p.getY() + ")");
	}
}
