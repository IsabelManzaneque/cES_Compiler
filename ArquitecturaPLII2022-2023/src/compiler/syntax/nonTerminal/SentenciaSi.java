package compiler.syntax.nonTerminal;

public class SentenciaSi extends Sentencia {
	
	private Expresion expresion;     // solo necesito una variable sentencia ya que solo se evaluara una?
	private Sentencia sentenciaSi;
	private Sentencia sentenciaSino;
	
	
	public SentenciaSi(Expresion expresion) {
		super();
		this.expresion = expresion;
		this.sentenciaSi = null;
		this.sentenciaSino = null;
	}
	public SentenciaSi(Expresion expresion, Sentencia sentenciaSi, Sentencia sentenciaSino) {
		super();
		this.expresion = expresion;
		this.sentenciaSi = sentenciaSi;
		this.sentenciaSino = sentenciaSino;
	}
	public Expresion getExpresion() {
		return expresion;
	}
	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}
	public Sentencia getSentenciaSi() {
		return sentenciaSi;
	}
	public void setSentenciaSi(Sentencia sentenciaSi) {
		this.sentenciaSi = sentenciaSi;
	}
	public Sentencia getSentenciaSino() {
		return sentenciaSino;
	}
	public void setSentenciaSino(Sentencia sentenciaSino) {
		this.sentenciaSino = sentenciaSino;
	}
	
	
}
