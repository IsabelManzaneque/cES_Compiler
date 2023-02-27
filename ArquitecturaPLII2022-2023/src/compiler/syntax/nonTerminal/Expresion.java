package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion extends NonTerminal {
	
	private TypeIF type;
	
	/** 
	 * @param tipo
	 */
	public Expresion() {};
	
	public Expresion(TypeIF type) {
		this();
		this.type = type;
	}
	
	public Expresion(Expresion e1) {
		this.type = e1.type;
	}
	
	public Expresion(Expresion e1, Expresion e2) {
		this();
	}

	
	public void setType(TypeIF type) {
		this.type = type;
	}

	public TypeIF getType() {
		return type;
	} 
	
//	@Override
//	public int compareTo(Expresion e) {		
//		return Double.compare(this.tipo, e.tipo);
//	} 
	
}
