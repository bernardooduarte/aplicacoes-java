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

	public Cliente(Cliente cliente) {
		this.nome = cliente.nome;
		this.telefone = cliente.telefone;
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

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
