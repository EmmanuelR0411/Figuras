
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea una clase padre FigurasGeometricas con un método calcular área. 
		 * Escribir 3 clases hijos que hereden de figuras geométricas, definir 
		 * los atributos y métodos necesarios para calcular el área, y al final 
		 * crear objetos de esas 3 clases que sean capaces de calcular las 
		 * respectivas areas 
		 */
		
		Cuadrado cuadrado = new Cuadrado("Circulo", "Rojo",4);
		cuadrado.CalcularArea(5,5);
		
		Circulo circulo = new Circulo("Triangulo", "Azul", 10f);
		circulo.CalcularArea();
		
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "Rosa",4);
		rectangulo.CalcularArea(12, 6);
		
		Triangulo triangulo = new Triangulo("Triangulo", "Verde","Isósceles");
		triangulo.CalcularArea(9,11);

	}

}
