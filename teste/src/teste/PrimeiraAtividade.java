package teste;

import java.util.Scanner;

public class PrimeiraAtividade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual � o valor de X ? : ");
		Integer x = scan.nextInt();

		System.out.println("Qual � o valor de Y ? : ");
		Integer y = scan.nextInt();

		Integer z = (x * y) + 5;

		String resposta = null;

		if (z <= 0) {
			resposta = "A";
		} else if (z <= 100) {
			resposta = "B";

		} else {
			resposta = "C";
		}

		System.out.println("Z = " + z);
		System.out.println("Resposta: " + resposta);
	}

}