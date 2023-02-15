package compiler.syntax.nonTerminal;

public class DeclaracionConstante extends NonTerminal {
	
	private String valor;
	private String tipo;  // con string para ejemplo, pero hay que usar la estructura de tipos
	
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
