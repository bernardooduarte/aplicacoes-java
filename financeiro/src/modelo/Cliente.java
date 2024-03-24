package modelo;

public class Cliente {
	private int codigo;
	private String nome;
	private String email;
	private int telefone;

	public Cliente(int codigo, String nome, String email, int telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public int getTelefone() {
		return this.telefone;
	}
}
