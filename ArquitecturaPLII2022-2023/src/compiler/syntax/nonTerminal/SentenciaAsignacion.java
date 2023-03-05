package compiler.syntax.nonTerminal;

public class SentenciaAsignacion extends Sentencia {
	
	private Ref ref;
	private Expresion expresion;
	
	public SentenciaAsignacion() {
		super();
		this.ref = null;
		this.expresion = null;
	}
	
	public SentenciaAsignacion(Ref ref, Expresion expresion) {
		super();
		this.ref = ref;
		this.expresion = expresion;
	}

	public Ref getRef() {
		return ref;
	}

	public void setRef(Ref ref) {
		this.ref = ref;
	}

	public Expresion getExpresion() {
		return expresion;
	}

	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}
	
	

}
