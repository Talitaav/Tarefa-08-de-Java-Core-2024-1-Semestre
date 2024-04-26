package tarefa08_java;

public class Exercicio07 {

	/*
	 * 7) Escreva um programa que apresente a série de Fibonacci até o décimo quinto
	 * termo. A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13,
	 * 21, 34, ..., etc. Esta série se caracteriza pela soma de um termo atual com o
	 * seu anterior subseqüente, para que seja formado o próximo valor da seqüência.
	 * Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é
	 * 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
	 * 
	 */

	public static void main(String[] args) {

		int n = 15;

		System.out.println("Série de Fibonacci até o décimo quinto termo:");

		int termo1 = 1;
		int termo2 = 1;

		System.out.print(termo1 + ", " + termo2);
		for (int i = 3; i <= n; i++) {
			int proximoTermo = termo1 + termo2;
			System.out.print(", " + proximoTermo);
			termo1 = termo2;
			termo2 = proximoTermo;
		}

	}

}
