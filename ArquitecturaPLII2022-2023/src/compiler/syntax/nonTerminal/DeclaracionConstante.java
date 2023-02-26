package compiler.syntax.nonTerminal;

public class DeclaracionConstante extends NonTerminal {
	
	private String valor;
	private String tipo;  
	
	/**
	 * @param valor
	 * @param tipo
	 */
	public DeclaracionConstante(String valor, String tipo) {
		this.valor = valor;
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public String getTipo() {
		return tipo;
	}
	
	
}
