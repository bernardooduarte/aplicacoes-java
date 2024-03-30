package modelo;

public class Medico {

	private String nome;
	private String email;
	private int crm;

	public Medico(String nome, String email, int crm) {
		this.nome = nome;
		this.email = email;
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "\nMédico: " + nome + " - " + "CRM: " + crm + "\n" + "(" + email + ")";
	}
}
