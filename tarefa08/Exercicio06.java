package tarefa08_java;

import java.util.Scanner;

public class Exercicio06 {
	/*
	 * 6) Elaborar um programa que apresente como resultado o valor de uma potência
	 * de uma base qualquer elevada a um expoente qualquer, ou seja, de BE, em que B
	 * é o valor da base e E o valor do expoente. Observe que neste exercício não
	 * pode ser utilizado o operador de exponenciação do portuguol (^).
	 */

	public static double calcular(double base, int expoente) {
		if (expoente == 0) {
			return 1;
		} else if (expoente == 1) {
			return base;
		} else {
			double resultado = base;
			for (int i = 2; i <= Math.abs(expoente); i++) {
				resultado *= base;
			}
			if (expoente < 0) {
				resultado = 1 / resultado;
			}
			return resultado;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da base (B): ");
		double base = sc.nextDouble();

		System.out.print("Digite o valor do expoente (E): ");
		int expoente = sc.nextInt();

		double resultado = calcular(base, expoente);

		System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
		sc.close();
	}
}
