package tarefa08_java;

public class Exercicio05 {

	// 5) Apresentar os resultados das potências de 3, variando do expoente 0 até o
	// expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e
	// elevado a 1 é ele próprio. Observe que neste exercício não pode ser utilizado
	// o operador de exponenciação do portuguol (^).

	public static long calcular(int expoente) {
		if (expoente == 0) {
			return 1;
		} else if (expoente == 1) {
			return 3;
		} else {
			long res = 3;
			for (int i = 2; i <= expoente; i++) {
				res *= 3;
			}
			return res;
		}
	}

	public static void main(String[] args) {

		System.out.println("Resultados das potências de 3, variando do expoente 0 até o expoente 15:");

		for (int expoente = 0; expoente <= 15; expoente++) {
			long res = calcular(expoente);
			System.out.println("3^" + expoente + " = " + res);

		}
	}
}
