/**
 * Direitos Autorais, 2021, Gabriel Menin.
 */
package exemplo.uri1002;

import java.util.Scanner;

import exemplo.figuras.Circulo;
import exemplo.figuras.Figura;

/**
 * @author Gabriel
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada;
		double raio;
		Figura c1;
		double area;
		
		entrada = new Scanner(System.in);
		raio = entrada.nextDouble();
		entrada.close();
		
		c1 = new Circulo(raio);
		area = c1.getArea();
		
		System.out.printf("A = %.4f\n", area);
	}

}
