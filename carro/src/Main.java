
public class Main {

	public static void main(String[] args) {

		Carro c1 = new Carro(0);
		c1.potencia = 150;

		Carro c2 = new Carro(0);
		c2.potencia = 150;

		if (c1 == c2) {
			System.out.println("Objetos iguais.");
		} else {
			System.out.println("Objetos diferentes.");
		}
	}

}
