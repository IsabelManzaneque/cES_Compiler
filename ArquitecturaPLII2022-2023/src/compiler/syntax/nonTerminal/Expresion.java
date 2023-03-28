package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresion extends NonTerminal {
	
	private TypeIF type;
	private int value;
	private boolean isFunction;
	
	/** 
	 * @param tipo
	 */
	public Expresion() {
		this.isFunction = false;
	};
	
	public Expresion(TypeIF type) {
		this();
		this.type = type;
		this.isFunction = false;
	}
	
	public Expresion(Expresion e1) {
		this.type = e1.type;
		this.value = e1.value;
		this.isFunction = false;
	}
	
		
	public void setType(TypeIF type) {
		this.type = type;
	}

	public TypeIF getType() {
		return type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	} 
	
		
	public boolean isFunction() {
		return isFunction;
	}

	public void setFunction(boolean isFunction) {
		this.isFunction = isFunction;
	}

	@Override
	public String toString() {		
		return "Type: " + type + ", value: " + value;
	}
//	@Override
//	public int compareTo(Expresion e) {		
//		return Double.compare(this.tipo, e.tipo);
//	} 
	
}
