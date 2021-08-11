/**
 * Direitos Autorais, 2021, Gabriel Menin.
 */
package exemplo.figuras;

/**
 * @author Gabriel
 *
 */
public class Triangulo extends Figura {
	
	private double base;
	private double altura;
	
	/**
	 * Cria um tri�ngulo ret�ngulo com base <code>base</code> e altura <code>altura</code>.
	 * 
	 * @param base a base do novo tri�ngulo
	 * @param altura a altura do novo tri�ngulo
	 * @throws IllegalArgumentException
	 * 			Quando o valor da base ou da altura � menor ou igual a zero.
	 */
	
	public Triangulo(double base, double altura) {
		super();
		if (base <= 0.0) {
			throw new IllegalArgumentException();
		}else if(altura <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @return the area
	 */
	@Override
	public double getArea() {
		return (base*altura)/2;
	}

}
