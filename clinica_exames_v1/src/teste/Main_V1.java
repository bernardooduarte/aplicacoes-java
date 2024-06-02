package teste;

import java.time.LocalDate;

import modelo.Medico;
import modelo.Paciente;
import modelo.Procedimento;

public class Main_V1 {

	public static void main(String[] args) {

		// parte 1

		Medico med1 = new Medico("Dr(a) João da Silva Teixeira", "joaosilvateixeira@gmail.com", 999999);
		Paciente pac1 = new Paciente("Sr(a) João da Silva Teixeira", "joaosilvateixeira@gmail.com",
				LocalDate.of(1980, 06, 10));
		Procedimento proc1 = new Procedimento("Exame das glândulas mamárias", 150.00);

		System.out.println("\nMédico: " + med1);
		System.out.println("\nPaciente: " + pac1);
		System.out.println("\nProcedimento: " + proc1.imprimeProc1());
	}

}
