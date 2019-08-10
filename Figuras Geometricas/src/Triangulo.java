
public class Triangulo extends FiguraGeometrica {

	int area;

	public Triangulo(int medida) {

		super(medida, 3);
	}

	public double ObtenerArea() {
		return area = (int) (medida_lado * Math.sqrt(Math.pow(medida_lado, 2) - Math.pow(medida_lado / 2, 2)) / 2);
	}

	public void Figura_imprimir() {
		for (int i = 1; i < medida_lado; i++) {
			System.out.print(" ");
		}
		System.out.print("*\n");

		for (int i = 2; i <= medida_lado - 1; i++) {
			for (int j = 1; j <= medida_lado - i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 1; j <= i * 2 - 3; j++) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}

		System.out.print("*");
		for (int i = 1; i <= medida_lado - 1; i++) {
			System.out.print(" *");
		}

		System.out.println("\nArea    : " + ObtenerArea());

		System.out.println("Perimetro : " + ObtenerPerimetro());
	}

}
