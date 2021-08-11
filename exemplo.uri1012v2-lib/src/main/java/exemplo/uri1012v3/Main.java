/**
 * Direitos Autorais, 2021, Gabriel Menin.
 */
package exemplo.uri1012v3;

import java.util.ArrayList;
import java.util.Scanner;

import exemplo.figuras.Circulo;
import exemplo.figuras.Figura;
import exemplo.figuras.Quadrado;
import exemplo.figuras.Retangulo;
import exemplo.figuras.Trapezio;
import exemplo.figuras.Triangulo;

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
		double a;
		double b;
		double c;
		ArrayList<Figura> fs;
		
		entrada = new Scanner(System.in);
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		entrada.close();
		
		fs = new ArrayList<Figura>();
		fs.add(new Triangulo(a, c));
		fs.add(new Circulo(c));
		fs.add(new Trapezio(a, b, c));
		fs.add(new Quadrado(b));
		fs.add(new Retangulo(a, b));
		
		for (Figura f : fs) {
			System.out.printf("%s: %.3f\n", 
					f.getClass().getSimpleName(), 
					f.getArea());
		}

	}

}
