package compiler.syntax.nonTerminal;

public class SentenciaDevuelve extends Sentencia {
	
	private Expresion expresion;
	
	public SentenciaDevuelve() {
		super();
		this.expresion = null;
	}
	public SentenciaDevuelve(Expresion expresion) {
		super();
		this.expresion = expresion;
	}

	public Expresion getExpresion() {
		return expresion;
	}

	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}
	
	

}
