/**
 * Direitos Autorais, 2021, Gabriel Menin.
 */
package exemplo.figuras;

/**
 * 
 * A classe <code>Quadrado<code> representa um quadrado com lado.
 * 
 * @author Gabriel
 *
 */
public class Quadrado extends Figura {
	
	private double lado;
	
	/**
	 * Cria um quadrado com lado <code>lado</code>.
	 * 
	 * @param lado o lado do novo quadrado
	 * @throws IllegalArgumentException
	 * 			Quando o valor do lado � menor ou igual a zero.
	 */
	public Quadrado(double lado) {
		super();
		if (lado <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.lado = lado;
	}
	
	/**
	 * @return the area
	 */
	@Override
	public double getArea() {
		return lado*lado;
	}

}
