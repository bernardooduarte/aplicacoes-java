package teste;

import modelo.Cliente;
import modelo.Conta;

public class TestaConta {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(1, "Bernardo", "bernardoduarte.mg@gmail.com", 912345678);
		Cliente cliente2 = new Cliente(2, "André", "andre@gmail.com", 900000000);
		
		
		Conta c1 = new Conta(200, cliente1);
		Conta c2 = new Conta(200, cliente2);

		System.out.println("Nome: " + c1.getCliente().getNome() + "; Número da conta: " + c1.getNumero());
		System.out.println("Nome: " + c2.getCliente().getNome() + "; Número da conta: " + c2.getNumero());
	}
}
