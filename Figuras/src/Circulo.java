
public class Circulo extends FigurasGeometricas {
	private float pi = 3.1416f;
	protected float area;
	protected float radio;
	
	public Circulo (String nombre, String color, float radio) {
		super(nombre,color);
		this.radio = radio;
	}
	
	public float CalcularArea() {
		area = pi*(radio * radio);
		
		System.out.println("\n¡CIRCULO!");
		System.out.println("  ***** ");
		System.out.println(" ******* ");
		System.out.println(" ******* ");
		System.out.println("  ***** ");
		
		System.out.println("Radio: " + this.radio + "\nPi: " + this.pi);
		System.out.println("El area del triangulo es: " + area);
		return 0f;
	}
}
