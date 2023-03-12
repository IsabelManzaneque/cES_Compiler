package compiler.syntax.nonTerminal;

import compiler.semantic.symbol.SymbolConstant;
import es.uned.lsi.compiler.semantic.type.TypeIF;

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
	
	
	
		
}
