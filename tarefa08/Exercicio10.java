package tarefa08_java;

public class Exercicio10 {

	/*
	 * 10) Elaborar um programa que apresente os resultados da soma e da média
	 * aritmética dos valores pares situados na faixa numérica de 50 a 70.
	 */

	public static void main(String[] args) {
		int soma = 0;
		int quantidade = 0;

		for (int i = 50; i <= 70; i++) {
			if (i % 2 == 0) {
				soma += i;
				quantidade++;
			}
		}

		double media = (double) soma / quantidade;

		System.out.println("A soma dos valores pares entre 50 e 70 é: " + soma);
		System.out.println("A média aritmética dos valores pares entre 50 e 70 é: " + media);
	}
}
