package compiler.syntax.nonTerminal;

import compiler.semantic.type.TypeArray;

public class DeclaracionTipo extends NonTerminal {
	
	
	private TypeArray typeArray;

	public DeclaracionTipo(TypeArray typeArray) {
		super();
		this.typeArray = typeArray;
	}

	public TypeArray getTypeArray() {
		return typeArray;
	}

	public void setTypeArray(TypeArray typeArray) {
		this.typeArray = typeArray;
	}
	
	

}
