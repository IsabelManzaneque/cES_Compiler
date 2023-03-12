package compiler.syntax.nonTerminal;

public class FuncionPrincipal extends NonTerminal {
	
	
	private CuerpoFuncion cuerpoFuncion;

	public FuncionPrincipal(CuerpoFuncion cuerpoFuncion) {
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
