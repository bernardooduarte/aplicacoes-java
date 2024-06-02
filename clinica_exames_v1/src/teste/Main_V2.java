package teste;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Agenda;
import modelo.Consulta;
import modelo.Medico;
import modelo.Paciente;
import modelo.Procedimento;

public class Main_V2 {

	public static void main(String[] args) {

		// parte 2

		// criando agenda

		Agenda a1 = new Agenda(5);

		ArrayList<Procedimento> listaProcs1 = new ArrayList<>();

		Medico med1 = new Medico("Dr(a) João da Silva Teixeira", "joaosilvateixeira@gmail.com", 999999);
		Paciente pac1 = new Paciente("Sr(a) João da Silva Teixeira", "joaosilvateixeira@gmail.com",
				LocalDate.of(1980, 10, 06));
		listaProcs1.add(new Procedimento("Exame das glândulas mamárias", 150.00));
		listaProcs1.add(new Procedimento("Toxina Botulínica", 1500.55));

		Consulta con1 = new Consulta(med1, pac1, listaProcs1);

		ArrayList<Procedimento> listaProcs2 = new ArrayList<>();

		Medico med2 = new Medico("Dr(a) João Gomes", "joaogomes@gmail.com", 888888);
		Paciente pac2 = new Paciente("Sr(a) Carlos Eduardo Lima", "joaosilvateixeira@gmail.com",
				LocalDate.of(1990, 12, 05));
		listaProcs2.add(new Procedimento("Exame de sangue", 90.00));

		Consulta con2 = new Consulta(med2, pac2, listaProcs2);

		ArrayList<Procedimento> listaProcs3 = new ArrayList<>();

		Paciente pac3 = new Paciente("Sr(a) Maria Teresa de Oliveira", "mariateresaoli@gmail.com",
				LocalDate.of(1970, 05, 25));
		listaProcs3.add(new Procedimento("Eletrocardiograma", 100.00));

		Consulta con3 = new Consulta(med1, pac3, listaProcs3);

		ArrayList<Procedimento> listaProcs4 = new ArrayList<>();

		Paciente pac4 = new Paciente("Sr(a) Cíntia Souza", "cintiasouza@gmail.com", LocalDate.of(1985, 04, 04));
		listaProcs4.add(new Procedimento("Ultrassom", 150.00));

		Consulta con4 = new Consulta(med2, pac4, listaProcs4);

		ArrayList<Procedimento> listaProcs5 = new ArrayList<>();

		Paciente pac5 = new Paciente("Sr(a) Paulo Dias", "paulodias@gmail.com", LocalDate.of(2000, 07, 03));
		listaProcs5.add(new Procedimento("Exame preventivo", 180.00));

		Consulta con5 = new Consulta(med1, pac5, listaProcs5);

		ArrayList<Procedimento> listaProcs6 = new ArrayList<>();

		Paciente pac6 = new Paciente("Sr(a) Catarina Xavier", "catarinaxavier@gmail.com", LocalDate.of(2004, 04, 05));
		listaProcs6.add(new Procedimento("Eletroencefalograma", 400.00));

		Consulta con6 = new Consulta(med1, pac6, listaProcs6);

		// imprimindo consulta

		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
		System.out.println(con4);
		System.out.println(con5);
		System.out.println(con6);

		// adicionando consultas na agenda

		a1.adicionarCons2(con1);
		a1.adicionarCons2(con2);
		a1.adicionarCons2(con3);
		a1.adicionarCons2(con4);
		a1.adicionarCons2(con5);
		a1.adicionarCons2(con6);

		// imprimindo agenda

		System.out.println(a1.imprimirFatCons2());

	}

}
