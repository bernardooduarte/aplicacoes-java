package modelo;

public class Procedimento {

	private String descricao;
	private double valor;

	public Procedimento(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "\nProcedimento: " + descricao + " - " + "R$ " + valor;
	}

}
