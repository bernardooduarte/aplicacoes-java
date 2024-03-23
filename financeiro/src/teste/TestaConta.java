package teste;

import modelo.Cliente;
import modelo.Conta;

public class TestaConta {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(1, "Bernardo", "bernardoduarte.mg@gmail.com", 912345678);

		Conta c1 = new Conta(1234, 200, cliente1);

		System.out.println("Titular: " + cliente1.getNome() + 
				"; Número: " + 
				c1.numero + 
				"; Saldo: " 
				+ c1.saldo);

	}
}
