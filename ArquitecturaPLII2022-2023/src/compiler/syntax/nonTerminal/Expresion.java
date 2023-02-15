package compiler.syntax.nonTerminal;

public class Expresion extends NonTerminal {
	
	private String tipo;
	
	/** 
	 * @param tipo
	 */
	public Expresion(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	} 
	
}
