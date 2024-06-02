package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Consulta {
	
	private Medico medico;
	private Paciente paciente;
	private ArrayList<Procedimento> listaProcs;
	double valorTotal;
	DecimalFormat df = new DecimalFormat("###,###.00");

	public Consulta(Medico medico, Paciente paciente, ArrayList<Procedimento> listaProcs) {
		this.medico = medico;
		this.paciente = paciente;
		this.listaProcs = listaProcs;
	}

	public Consulta(Consulta consulta) {
		this.medico = consulta.medico;
		this.paciente = consulta.paciente;
		this.listaProcs = consulta.listaProcs;
	}

	public Medico getMedico() {
		return new Medico(this.medico);
	}

	public Paciente getPaciente() {
		return new Paciente(this.paciente);
	}

	public ArrayList<Procedimento> getListaProcs() {
		return this.listaProcs;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setListaProcs(ArrayList<Procedimento> listaProcs) {
		this.listaProcs = listaProcs;
	}

	public String calcularValor() {
		valorTotal = 0.00;
		for (Procedimento valor : listaProcs) {
			valorTotal += valor.getValor();
		}
		return df.format(valorTotal);
	}

	public double getValorTotal() {
		return this.valorTotal;
	}

	public void adicionarProc(Procedimento p) {
		listaProcs.add(p);
	}

	public void removerProc(Procedimento p) {
		listaProcs.remove(p);
	}

	public Procedimento verificarProc(String proc) {
		for (Procedimento p : listaProcs) {
			if (p.toString().contains(proc)) {
				return p;
			}
		}
		return null;
	}

	public String toString() {
		return "\nConsulta: " + "\nMédico: " + medico.getNome() + " - " + medico.getCodigo() + "\nPaciente: "
				+ paciente.getNome() + " - " + paciente.getCodigo() + "\nProcedimentos: " + getListaProcs()
				+ "\nValor da consulta: " + calcularValor();
	}
}
