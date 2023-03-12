package compiler.syntax.nonTerminal;

public class CuerpoBloque extends NonTerminal {
	
	private ListadoSentencias listadoSentencias;
	private SeccionVariables seccionVariables;
	
	public CuerpoBloque() {
		super();
		this.listadoSentencias = null;
		this.seccionVariables = null;
	}
	
	public CuerpoBloque(ListadoSentencias listadoSentencias, SeccionVariables seccionVariables) {
		super();
		this.listadoSentencias = listadoSentencias;
		this.seccionVariables = seccionVariables;
	}
	
	public CuerpoBloque(ListadoSentencias listadoSentencias) {
		super();
		this.listadoSentencias = listadoSentencias;
		this.seccionVariables = null;
	}

	public ListadoSentencias getListadoSentencias() {
		return listadoSentencias;
	}

	public void setListadoSentencias(ListadoSentencias listadoSentencias) {
		this.listadoSentencias = listadoSentencias;
	}

	public SeccionVariables getSeccionVariables() {
		return seccionVariables;
	}

	public void setSeccionVariables(SeccionVariables seccionVariables) {
		this.seccionVariables = seccionVariables;
	}
	
	
	
	

}
