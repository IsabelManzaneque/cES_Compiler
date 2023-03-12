package compiler.syntax.nonTerminal;

public class Funcion extends NonTerminal {
	
	private CuerpoFuncion cuerpoFuncion;

	public Funcion(CuerpoFuncion cuerpoFuncion) {
		super();
		this.cuerpoFuncion = cuerpoFuncion;
	}

	public CuerpoFuncion getCuerpoFuncion() {
		return cuerpoFuncion;
	}

	public void setCuerpoFuncion(CuerpoFuncion cuerpoFuncion) {
		this.cuerpoFuncion = cuerpoFuncion;
	}
	
	
	
}
