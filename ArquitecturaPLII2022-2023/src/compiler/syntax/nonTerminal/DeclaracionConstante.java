package compiler.syntax.nonTerminal;

import compiler.semantic.symbol.SymbolConstant;

public class DeclaracionConstante extends NonTerminal {
	
	private SymbolConstant symbolConstant;

	public DeclaracionConstante(SymbolConstant symbolConstant) {
		super();
		this.symbolConstant = symbolConstant;
	}

	public SymbolConstant getSymbolConstant() {
		return symbolConstant;
	}

	public void setSymbolConstant(SymbolConstant symbolConstant) {
		this.symbolConstant = symbolConstant;
	}
	
	@Override
	public String toString() {		
		return "name: " + symbolConstant.getName() + ", type: " + symbolConstant.getType() + ", value: " + symbolConstant.getValue();
	} 
	
		
}
