package compiler.syntax.nonTerminal;

public class Bloque extends Sentencia {
	
	private CuerpoBloque cuerpoBloque;

	public Bloque() {
		super();
		this.cuerpoBloque = null;
	}
	
	public Bloque(CuerpoBloque cuerpoBloque) {
		super();
		this.cuerpoBloque = cuerpoBloque;
	}

	public CuerpoBloque getCuerpoBloque() {
		return cuerpoBloque;
	}

	public void setCuerpoBloque(CuerpoBloque cuerpoBloque) {
		this.cuerpoBloque = cuerpoBloque;
	}
	
		

}
