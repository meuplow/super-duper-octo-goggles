/**
 * Direitos Autorais, 2021, Gabriel Menin.
 **/

package exemplo.figuras;

/**
 * A classe <code>Retangulo<code> representa um ret�ngulo com lados A e B.
 * 
 * @author Gabriel
 *
 */

public class Retangulo extends Figura{
	
	private double ladoA;
	private double ladoB;
	
	/**
	 * Cria um ret�ngulo com lado <code>ladoA</code> e lado <code>ladoB</code>.
	 * 
	 * @param ladoA um dos lados do novo ret�ngulo
	 * @param ladoB um dos lados do novo ret�ngulo
	 * @throws IllegalArgumentException
	 * 			Quando o valor do ladoA ou ladoB � menor ou igual a zero.
	 * 			Quando o valor do ladoA � igual ao do ladoB.
	 */
	
	
	public Retangulo(double ladoA, double ladoB) {
		super();
		if (ladoA <= 0.0) {
			throw new IllegalArgumentException();
		}else if(ladoB <= 0.0) {
			throw new IllegalArgumentException();
		}else if(ladoA == ladoB) {
			throw new IllegalArgumentException();
		}
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	/**
	 * @return the area
	 */
	@Override
	public double getArea() {
		return ladoA*ladoB;
	}
	
}

