package tarefa08_java;

public class Exercicio08 {

	public static void main(String[] args) {

		int celsius = 10;

		while (celsius <= 100) {
			double fahrenheit = (9.0 * celsius + 160) / 5;

			System.out.println(celsius + " graus Celsius = " + fahrenheit + " graus Fahrenheit");

			celsius += 10;
		}
	}
}
