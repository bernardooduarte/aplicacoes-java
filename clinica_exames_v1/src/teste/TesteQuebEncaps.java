package teste;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Agenda;
import modelo.Consulta;
import modelo.Medico;
import modelo.Paciente;
import modelo.Procedimento;

public class TesteQuebEncaps {

	public static void main(String[] args) {

		Agenda a1 = new Agenda();

		ArrayList<Procedimento> listaProcs1 = new ArrayList<>();

		Medico med1 = new Medico("Dr(a) João da Silva Teixeira", "joaosilvateixeira@gmail.com", 999999);
		Paciente pac1 = new Paciente("Sr(a) João da Silva Teixeira", "joaosilvateixeira@gmail.com",
				LocalDate.of(1980, 10, 06));
		Procedimento proc1 = new Procedimento("Exame das glândulas mamárias", 150.00);
		listaProcs1.add(proc1);
		Procedimento proc2 = new Procedimento("Exame de colesterol", 55.00);
		listaProcs1.add(proc2);

		Consulta con1 = new Consulta(med1, pac1, listaProcs1);

		a1.adicionaCons3(con1);

		System.out.println(med1);

		Medico testemed = con1.getMedico();

		testemed.setCrm(000000);

		System.out.println("\nTentando quebra de encapsulamento para médico:");
		System.out.println(med1);

		Paciente testepac = con1.getPaciente();

		testepac.setNome("Sr(a) Flávio Alves");

		System.out.println("\nTentando quebra de encapsulamento para paciente:");
		System.out.println(pac1);

	}
}
