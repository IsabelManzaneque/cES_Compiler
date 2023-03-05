package compiler.syntax.nonTerminal;

public class PorDefecto extends NonTerminal {
	
	private Bloque bloque;

	public PorDefecto(Bloque bloque) {
		super();
		this.bloque = bloque;
	}

	public Bloque getBloque() {
		return bloque;
	}

	public void setBloque(Bloque bloque) {
		this.bloque = bloque;
	}
	
	

}
