
public class Cuadrado extends FigurasGeometricas {
	protected int lados;
	protected float area;
	
	public Cuadrado (String nombre, String color, int lados) {
		super(nombre,color);
		this.lados = lados;
	}
	
	
	public float CalcularArea(int base, int altura) {
		area = super.CalcularArea(base, altura);
		
		System.out.println("\n¡CUADRADO!");
		System.out.println("********");
		System.out.println("********");
		System.out.println("********");
		System.out.println("********");
		System.out.println("Base: " + base + "\nAltura: " + altura);
		System.out.println("El area del cuadrado es: " + area);
		return 0f;
	}
}
