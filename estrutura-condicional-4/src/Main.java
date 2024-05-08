import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int hrIn = scan.nextInt();
		int hrFin = scan.nextInt();

		int duracao;
		if (hrIn < hrFin) {
			duracao = hrFin - hrIn;
		} else {
			duracao = 24 - hrIn + hrFin;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		scan.close();

	}

}
