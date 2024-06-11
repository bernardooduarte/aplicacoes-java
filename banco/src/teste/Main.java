package teste;

import java.util.Locale;
import java.util.Scanner;

import modelo.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		Account ac1;

		System.out.print("Enter account number: ");
		int number = scan.nextInt();

		scan.nextLine();

		System.out.print("Enter account holder: ");
		String holder = scan.nextLine();

		System.out.print("Is there a initial deposit (y/n)? ");
		char answer = scan.next().charAt(0);

		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depInVal = scan.nextDouble();
			ac1 = new Account(number, holder, depInVal);
		} else {
			ac1 = new Account(number, holder);
		}

		System.out.println("\nAccount data:");
		System.out.println(ac1);

		System.out.print("Enter a deposit value: ");
		double depVal = scan.nextDouble();
		ac1.deposit(depVal);

		System.out.println("\nUpdated account data:");
		System.out.println(ac1);

		System.out.print("Enter a withdraw value: ");
		double withdraw = scan.nextDouble();
		ac1.withdraw(withdraw);

		System.out.println("\nUpdated account data:");
		System.out.println(ac1);

		// tentando mudar o nome
		ac1.setHolder("Maria Brown");

		System.out.println("\nUpdated account data:");
		System.out.println(ac1);

		scan.close();
	}

}
