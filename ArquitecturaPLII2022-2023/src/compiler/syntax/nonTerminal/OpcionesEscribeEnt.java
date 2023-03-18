package compiler.syntax.nonTerminal;

public class OpcionesEscribeEnt extends NonTerminal {
	
	private Expresion opciones;

	public OpcionesEscribeEnt(Expresion opciones) {
		super();
		this.opciones = opciones;
	}

	public Expresion getOpciones() {
		return opciones;
	}

	public void setOpciones(Expresion opciones) {
		this.opciones = opciones;
	}
	
	
	
}
