package compiler.syntax.nonTerminal;

public class SentenciaLlamadaFuncion extends Sentencia {
	
	private LlamadaFuncion llamadaFuncion;

	public SentenciaLlamadaFuncion(LlamadaFuncion llamadaFuncion) {
		super();
		this.llamadaFuncion = llamadaFuncion;
	}

	public LlamadaFuncion getLlamadaFuncion() {
		return llamadaFuncion;
	}

	public void setLlamadaFuncion(LlamadaFuncion llamadaFuncion) {
		this.llamadaFuncion = llamadaFuncion;
	}
	
	

}
