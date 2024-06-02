package teste;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Agenda;
import modelo.Consulta;
import modelo.Medico;
import modelo.Paciente;
import modelo.Procedimento;

public class Main_V3 {

	public static void main(String[] args) {

		// parte 3

		// criando agenda

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

		ArrayList<Procedimento> listaProcs2 = new ArrayList<>();

		Medico med2 = new Medico("Dr(a) João Gomes", "joaogomes@gmail.com", 888888);
		Paciente pac2 = new Paciente("Sr(a) Carlos Eduardo Lima", "joaosilvateixeira@gmail.com",
				LocalDate.of(1990, 12, 05));
		Procedimento proc3 = new Procedimento("Exame de sangue", 90.00);
		listaProcs2.add(proc3);

		Consulta con2 = new Consulta(med2, pac2, listaProcs2);

		ArrayList<Procedimento> listaProcs3 = new ArrayList<>();

		Paciente pac3 = new Paciente("Sr(a) Maria Teresa de Oliveira", "mariateresaoli@gmail.com",
				LocalDate.of(1970, 05, 25));
		Procedimento proc4 = new Procedimento("Eletrocardiograma", 100.00);
		listaProcs3.add(proc4);

		Consulta con3 = new Consulta(med1, pac3, listaProcs3);

		ArrayList<Procedimento> listaProcs4 = new ArrayList<>();

		Paciente pac4 = new Paciente("Sr(a) Cíntia Souza", "cintiasouza@gmail.com", LocalDate.of(1985, 04, 04));
		Procedimento proc5 = new Procedimento("Ultrassom", 150.00);
		listaProcs4.add(proc5);

		Consulta con4 = new Consulta(med2, pac4, listaProcs4);

		ArrayList<Procedimento> listaProcs5 = new ArrayList<>();

		Paciente pac5 = new Paciente("Sr(a) Paulo Dias", "paulodias@gmail.com", LocalDate.of(2000, 07, 03));
		Procedimento proc6 = new Procedimento("Exame preventivo", 180.00);
		listaProcs5.add(proc6);

		Consulta con5 = new Consulta(med1, pac5, listaProcs5);

		ArrayList<Procedimento> listaProcs6 = new ArrayList<>();

		Paciente pac6 = new Paciente("Sr(a) Catarina Xavier", "catarinaxavier@gmail.com", LocalDate.of(2004, 04, 05));
		Procedimento proc7 = new Procedimento("Eletroencefalograma", 400.00);
		listaProcs6.add(proc7);

		Consulta con6 = new Consulta(med1, pac6, listaProcs6);

		// imprimindo consulta

		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
		System.out.println(con4);
		System.out.println(con5);
		System.out.println(con6);

		// adicionando consultas na agenda

		a1.adicionaCons3(con1);
		a1.adicionaCons3(con2);
		a1.adicionaCons3(con3);
		a1.adicionaCons3(con4);
		a1.adicionaCons3(con5);
		a1.adicionaCons3(con6);

		// imprimindo agenda

		System.out.println(a1);

		// removendo consulta

		a1.removeCons(con1);

		System.out.println(a1);

		Consulta verificarcons1 = a1.verificarCons("PA6");

		System.out.println("\nBuscando consulta:");

		if (verificarcons1 != null) {
			System.out.println(verificarcons1);
		} else {
			System.out.println("Consulta inexistente");
		}

		Consulta verificarcons2 = a1.verificarCons("PA100");

		System.out.println("\nBuscando consulta:");

		if (verificarcons2 != null) {
			System.out.println(verificarcons2);
		} else {
			System.out.println("Consulta inexistente");
		}

		con1.removerProc(proc1);

		System.out.println(con1);

		Procedimento verificaproc1 = con1.verificarProc("Exame de colesterol");

		System.out.println("\nVerificando procedimento:");

		if (verificaproc1 != null) {
			System.out.println(con1.getListaProcs());
		} else {
			System.out.println("Procedimento inexistente.");
		}

		Procedimento verificaproc2 = con1.verificarProc("Exame de urina");

		System.out.println("\nVerificando procedimento:");

		if (verificaproc2 != null) {
			System.out.println(con1.getListaProcs());
		} else {
			System.out.println("Procedimento inexistente");
		}
	}

}
