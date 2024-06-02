package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Agenda {

	private Consulta[] listaCons2;
	private ArrayList<Consulta> listaCons3;
	double fatTotal;
	DecimalFormat df = new DecimalFormat("###,###.00");
	private Consulta consulta;
	int MAX;

	public Agenda(int MAX) {
		this.listaCons2 = new Consulta[MAX];
		this.MAX = MAX;
	}

	public Agenda() {
		this.listaCons3 = new ArrayList<Consulta>();
	}

	// calcula faturamento total para a parte 3

	public String calcFat3() {
		fatTotal = 0.00;
		for (Consulta c : listaCons3) {
			if (c != null) {
				fatTotal += c.getValorTotal();
			}
		}
		return "R$ " + df.format(fatTotal);
	}

	// calcula faturamento total para a parte 2

	public String calcFat2() {
		fatTotal = 0.00;
		for (Consulta c : listaCons2) {
			if (c != null) {
				fatTotal += c.getValorTotal();
			}
		}
		return "R$ " + df.format(fatTotal);
	}

	// adiciona conta para a parte 2

	public boolean adicionarCons2(Consulta c) {
		for (int i = 0; i < listaCons2.length; i++) {
			if (listaCons2[i] == null) {
				listaCons2[i] = c;
				return true;
			}
		}
		return false;
	}

	public double getFatTotal() {
		return this.fatTotal;
	}

	// adiciona conta para a parte 3

	public void adicionaCons3(Consulta c) {
		listaCons3.add(c);
	}

	public void removeCons(Consulta c) {
		listaCons3.remove(c);
	}

	public Consulta getConsulta() {
		return this.consulta;
	}

	public Consulta verificarCons(String e) {
		for (Consulta c : listaCons3) {
			if (c.toString().contains(e)) {
				return c;
			}
		}
		return null;
	}

	// get total de contas para a parte 2

	public int getTotalCons2() {
		int qtd = 0;
		for (Consulta c : listaCons2) {
			if (c != null) {
				qtd++;
			}
		}
		return qtd;
	}

	// get total de contas para a parte 3

	public int getTotalCons3() {
		return listaCons3.size();
	};

	// string para a parte 2

	public String imprimirFatCons2() {
		return "\nFaturamento total: " + calcFat2() + "\nConsultas agendadas: " + getTotalCons2();
	}

	// string para a parte 3

	public String toString() {
		return "\nFaturamento total: " + calcFat3() + "\nConsultas agendadas: " + getTotalCons3();
	}

}
