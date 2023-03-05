package compiler.syntax.nonTerminal;

public class CasoAlt extends NonTerminal {
	
	int numero;
	Bloque bloque;
	
	public CasoAlt(int numero, Bloque bloque) {
		super();
		this.numero = numero;
		this.bloque = bloque;
	}

	public int getNumero() {
		return numero;
	}

	public Bloque getBloque() {
		return bloque;
	}	

}
