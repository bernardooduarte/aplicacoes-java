public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta(12345, "José da Silva", 2000);
		c1.deposita(-1000);
		System.out.println("Saldo do " + c1.titular + ": " + c1.saldo);
		System.out.println("Numero da Conta: " + c1.numero);
		
		Conta c2 = new Conta("Ana Maria", 1000);
		System.out.println("Saldo do " + c2.titular + ": " + c2.saldo);
		System.out.println("Numero da Conta: " + c2.numero);
		
		Conta c3 = new Conta("Rodrigo");
		System.out.println("Saldo do " + c3.titular + ": " + c3.saldo);
		System.out.println("Numero da Conta: " + c3.numero);
	}
}
