package modelo;

public class Medico {

	private String nome;
	private String email;
	private int crm;
	private String codigo;
	private static int numSeq = 0;

	public Medico(String nome, String email, int crm) {
		this.nome = nome;
		this.email = email;
		this.crm = crm;
		this.codigo = geraCodigo();
	}

	public Medico(Medico medico) {
		this.nome = medico.nome;
		this.email = medico.email;
		this.crm = medico.crm;
		this.codigo = medico.geraCodigo();
	}

	private String geraCodigo() {
		numSeq++;
		return "ME" + numSeq;
	}

	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public int getCRM() {
		return this.crm;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public int getCrm() {
		return crm;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String toString() {
		return getNome() + " - " + getCRM() + "\n" + "(" + getEmail() + ")";
	}
}
