package compiler.syntax.nonTerminal;

public class Axiom2 extends NonTerminal {
	
	private SeccionConstantes seccionConstantes;
	private SeccionTipos seccionTipos;
	private SeccionVariables seccionVariables;
	private SeccionFunciones seccionFunciones;
	
	
	/**
     * Constructor for Axiom.
     */
    public Axiom2() {
        super (); 
    }

	public Axiom2(SeccionConstantes seccionConstantes, SeccionTipos seccionTipos, SeccionVariables seccionVariables,
			SeccionFunciones seccionFunciones) {
		super();
		this.seccionConstantes = seccionConstantes;
		this.seccionTipos = seccionTipos;
		this.seccionVariables = seccionVariables;
		this.seccionFunciones = seccionFunciones;
	}
	
	public Axiom2(SeccionConstantes seccionConstantes, SeccionTipos seccionTipos, SeccionFunciones seccionFunciones) {
		super();
		this.seccionConstantes = seccionConstantes;
		this.seccionTipos = seccionTipos;
		this.seccionVariables = null;
		this.seccionFunciones = seccionFunciones;
	}

	public SeccionConstantes getSeccionConstantes() {
		return seccionConstantes;
	}

	public void setSeccionConstantes(SeccionConstantes seccionConstantes) {
		this.seccionConstantes = seccionConstantes;
	}

	public SeccionTipos getSeccionTipos() {
		return seccionTipos;
	}

	public void setSeccionTipos(SeccionTipos seccionTipos) {
		this.seccionTipos = seccionTipos;
	}

	public SeccionVariables getSeccionVariables() {
		return seccionVariables;
	}

	public void setSeccionVariables(SeccionVariables seccionVariables) {
		this.seccionVariables = seccionVariables;
	}

	public SeccionFunciones getSeccionFunciones() {
		return seccionFunciones;
	}

	public void setSeccionFunciones(SeccionFunciones seccionFunciones) {
		this.seccionFunciones = seccionFunciones;
	}

}
