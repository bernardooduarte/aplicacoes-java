package modelo;

public class Paciente {

	private String nome;
	private String email;
	private String data_nascimento;

	public Paciente(String nome, String email, String data_nascimento) {
		this.nome = nome;
		this.email = email;
		this.data_nascimento = data_nascimento;
	}

	@Override
	public String toString() {
		return "\nPaciente: " + nome + "\n(" + email + ")";
	}
}
