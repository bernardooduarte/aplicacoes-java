package teste;

import modelo.Cliente;
import modelo.Conta;

public class TestaConta {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(1, "Bernardo", "teste@teste.com", 321234567);
		Conta c1 = new Conta(200, cliente1);
		System.out.println(c1);

		Cliente teste = c1.getCliente();
		teste.setTelefone(320000000);
		System.out.println(c1);
	}
}
