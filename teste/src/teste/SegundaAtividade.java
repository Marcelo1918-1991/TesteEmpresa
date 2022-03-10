package teste;

import java.util.Scanner;

public class SegundaAtividade {

	public static void main(String[] args) {
		Scanner atv = new Scanner(System.in);

		int soma;

		System.out.println("Idade primeiro homem: ");
		Integer primeiroHomem = atv.nextInt();

		System.out.println("Idade segundo homem: ");
		Integer segundoHomem = atv.nextInt();

		System.out.println("Idade primeira mulher: ");
		Integer primeiraMulher = atv.nextInt();

		System.out.println("Idade segunda mulher: ");
		Integer segundaMulher = atv.nextInt();

		Object multiplicacao;
		if (primeiroHomem > segundoHomem && segundaMulher > primeiraMulher) {

			soma = primeiroHomem + primeiraMulher;

			multiplicacao = segundoHomem * segundaMulher;

		}

		else if (segundoHomem > primeiroHomem && primeiraMulher > segundaMulher) {

			multiplicacao = primeiroHomem * primeiraMulher;

		}

		else {

			soma = segundoHomem + primeiraMulher;

			multiplicacao = primeiroHomem * segundaMulher;

		}

		int somaSegHomemSegMulher = segundoHomem + segundaMulher;
		int produtoPrimeiroHomemSegundaMulher = primeiroHomem * segundaMulher;

		System.out.println("A soma do homem mais velho com a mulher mais nova é: " + somaSegHomemSegMulher);
		System.out.println("O produto é: " + produtoPrimeiroHomemSegundaMulher);

	}

}
