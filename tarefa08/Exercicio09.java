package tarefa08_java;

import java.util.Scanner;

public class Exercicio09 {
	/*
	 * 9) Elaborar um programa que efetue a leitura de 10 valores numéricos e
	 * apresente no final o total do somatório e a média aritmética dos valores
	 * lidos.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;
		double media;

		System.out.println("Digite 10 valores numéricos:");

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			int valor = sc.nextInt();
			total += valor;
		}

		media = (double) total / 10;

		System.out.println("O total do somatório é: " + total);
		System.out.println("A média aritmética dos valores é: " + media);

		sc.close();
	}

}
