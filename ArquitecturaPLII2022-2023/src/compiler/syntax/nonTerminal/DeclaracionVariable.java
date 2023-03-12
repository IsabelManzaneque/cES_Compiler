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
	
		
	

}
