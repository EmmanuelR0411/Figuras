
public class FigurasGeometricas {
	protected String nombre = "";
	protected int base;
	protected int altura;
	protected String color = "";
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public FigurasGeometricas(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	
	public float CalcularArea(int base, int altura) {
		return base * altura;
	}

}
