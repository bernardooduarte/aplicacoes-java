package teste;

import modelo.Medico;
import modelo.Paciente;
import modelo.Procedimento;

public class Main {

	public static void main(String[] args) {

		Medico med1 = new Medico("Dr(a) João da Silva Teixeira", "joaosilvateixeira@gmail.com", 999999);
		Paciente pac1 = new Paciente("Sr(a) João da Silva Teixeira", "joaosilvateixeira@gmail.com", "01/01/1990");
		Procedimento proc1 = new Procedimento("Exame das glândulas mamárias", 150.00);

		System.out.println(med1);
		System.out.println(pac1);
		System.out.println(proc1);

	}

}
