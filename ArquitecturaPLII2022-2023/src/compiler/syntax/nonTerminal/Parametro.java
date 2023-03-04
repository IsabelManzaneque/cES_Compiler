package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Parametro extends NonTerminal {
	
	private TypeIF type;
	private String name;
	
	public Parametro(TypeIF type, String name) {
		this.type = type;
		this.name = name;
	}

	public TypeIF getType() {
		return type;
	}

	public void setType(TypeIF type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {		
		return type.getName() + " " + name;
	} 
	

}
