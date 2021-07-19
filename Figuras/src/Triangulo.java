
public class Triangulo extends FigurasGeometricas {
	protected String tipo = "";
	protected float area;
	
	public Triangulo (String nombre, String color, String tipo) {
		super(nombre,color);
		this.tipo = tipo;
	}
	
	public float CalcularArea(int base, int altura) {
		area = super.CalcularArea(base, altura)/2;
		
		System.out.println("\n¡TRIANGULO!");
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("*******");
		System.out.println("Base: " + base + "\nAltura: " + altura);
		System.out.println("El area del triangulo es: " + area);
		return 0f;
	}
}
