package modelo;
import java.time.LocalDate;

public class Paciente {

	private String nome;
	private String email;
	private LocalDate data_nascimento;
	private String codigo;
	private static int numSeq = 0;

	public Paciente(String nome, String email, LocalDate data_nascimento) {
		this.nome = nome;
		this.email = email;
		this.data_nascimento = data_nascimento;
		this.codigo = geraCodigo();
	}
	
	public Paciente(Paciente paciente) {
		this.nome = paciente.nome;
		this.email = paciente.email;
		this.data_nascimento = paciente.data_nascimento;
		this.codigo = paciente.geraCodigo();
	}

	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public LocalDate getData_nascimento() {
		return this.data_nascimento;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	private String geraCodigo() {
		numSeq++;
		return "PA" + numSeq;
	}
	
	public String toString() {
		return getNome() + "\n(" + getEmail() + ")";
	}
}
