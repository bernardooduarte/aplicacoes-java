package modelo;

import java.text.DecimalFormat;

public class Procedimento {

	private String descricao;
	private double valor;
	DecimalFormat df = new DecimalFormat("###,###.00");
	private String codigo;
	private static int numSeq = 0;

	public Procedimento(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
		this.codigo = geraCodigo();
	}

	public Procedimento(Procedimento procedimento) {
		this.descricao = procedimento.descricao;
		this.valor = procedimento.valor;
		this.codigo = procedimento.geraCodigo();
	}

	private String geraCodigo() {
		numSeq++;
		return "PO" + numSeq;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public double getValor() {
		return this.valor;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String imprimeProc1() {
		return getDescricao() + " - " + "R$ " + df.format(valor);
	}

	public String toString() {
		return getDescricao() + " - " + getCodigo() + " - " + "R$ " + df.format(valor);
	}

}
