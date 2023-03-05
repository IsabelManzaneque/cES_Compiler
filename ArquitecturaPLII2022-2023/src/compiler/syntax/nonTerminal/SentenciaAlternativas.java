package compiler.syntax.nonTerminal;

public class SentenciaAlternativas extends Sentencia {
	
	private Expresion expresion;
	private CasosAlternativa casosAlternativa;
	private PorDefecto porDefecto;
	
	public SentenciaAlternativas(Expresion expresion, CasosAlternativa casosAlternativa, PorDefecto porDefecto) {
		super();
		this.expresion = expresion;
		this.casosAlternativa = casosAlternativa;
		this.porDefecto = porDefecto;
	}

	public Expresion getExpresion() {
		return expresion;
	}

	public CasosAlternativa getCasosAlternativa() {
		return casosAlternativa;
	}

	public PorDefecto getPorDefecto() {
		return porDefecto;
	}
	
	
	

}
