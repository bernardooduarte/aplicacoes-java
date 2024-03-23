package modelo;

public class Cliente {
	int codigo;
	String nome;
	String email;
	int telefone;
	
	public Cliente(int codigo, String nome, String email, int telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return this.nome;
	}
}
