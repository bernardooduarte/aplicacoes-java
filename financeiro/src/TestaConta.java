public class TestaConta {

	public static void main(String[] args) {

		Conta c1 = new Conta(12345, "José da Silva", 2000);
		c1.deposita(1000);

		System.out.println("Saldo do " + c1.titular + ": " + c1.saldo);

		c1.deposita(-10);

		System.out.println("Saldo do " + c1.titular + ": " + c1.saldo);

		c1.saca(500);

		System.out.println("Saldo do " + c1.titular + ": " + c1.saldo);

		c1.saca(50000);

		System.out.println("Saldo do " + c1.titular + ": " + c1.saldo);
	}

}
