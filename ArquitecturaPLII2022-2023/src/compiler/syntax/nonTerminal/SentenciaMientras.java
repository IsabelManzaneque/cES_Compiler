package compiler.syntax.nonTerminal;

public class SentenciaMientras extends Sentencia {
	
	private Expresion expresion;
	private Sentencia sentencia;
	
	public SentenciaMientras(Expresion expresion, Sentencia sentencia) {
		super();
		this.expresion = expresion;
		this.sentencia = sentencia;
	}

	public Expresion getExpresion() {
		return expresion;
	}

	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}

	public Sentencia getSentencia() {
		return sentencia;
	}

	public void setSentencia(Sentencia sentencia) {
		this.sentencia = sentencia;
	}
	
	

}
