package compiler.syntax.nonTerminal;

public class SeccionParametros extends NonTerminal {
	
	private DeclaracionParametros declaracionParametros;

	public SeccionParametros(DeclaracionParametros declaracionParametros) {
		super();
		this.declaracionParametros = declaracionParametros;
	}

	public DeclaracionParametros getDeclaracionParametros() {
		return declaracionParametros;
	}

	public void setDeclaracionParametros(DeclaracionParametros declaracionParametros) {
		this.declaracionParametros = declaracionParametros;
	}
	
	

}
