package compiler.syntax.nonTerminal;

import compiler.semantic.symbol.SymbolVariable;

public class DeclaracionVariable extends NonTerminal {
	
	private SymbolVariable symbolVariable;

	public DeclaracionVariable(SymbolVariable symbolVariable) {
		super();
		this.symbolVariable = symbolVariable;
	}

	public SymbolVariable getSymbolVariable() {
		return symbolVariable;
	}

	public void setSymbolVariable(SymbolVariable symbolVariable) {
		this.symbolVariable = symbolVariable;
	}
	
	@Override
	public String toString() {		
		return "name: " + symbolVariable.getName() + ", type: " + symbolVariable.getType() + ", value: " + symbolVariable.getValue();
	}
	

}
