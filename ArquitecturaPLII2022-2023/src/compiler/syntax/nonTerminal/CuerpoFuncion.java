package compiler.syntax.nonTerminal;

public class CuerpoFuncion extends NonTerminal {
	
	private SeccionTipos seccionTipos;
	private SeccionVariables seccionVariables;
	private ListadoSentencias listadoSentencias;
	
	public CuerpoFuncion(SeccionTipos seccionTipos, ListadoSentencias listadoSentencias) {
		super();
		this.seccionTipos = seccionTipos;
		this.seccionVariables = null;
		this.listadoSentencias = listadoSentencias;
	}
	
	public CuerpoFuncion(SeccionTipos seccionTipos, SeccionVariables seccionVariables,
			ListadoSentencias listadoSentencias) {
		super();
		this.seccionTipos = seccionTipos;
		this.seccionVariables = seccionVariables;
		this.listadoSentencias = listadoSentencias;
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

	public ListadoSentencias getListadoSentencias() {
		return listadoSentencias;
	}

	public void setListadoSentencias(ListadoSentencias listadoSentencias) {
		this.listadoSentencias = listadoSentencias;
	}
	
	

}
