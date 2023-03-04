package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class LlamadaFuncion extends NonTerminal {
	
	private String name;
	private ArrayList<Expresion> listaExpr;
	
	public LlamadaFuncion(String name) {
		this.name = name;
		this.listaExpr = new ArrayList<>();
	}
	
	public LlamadaFuncion(String name, ArrayList<Expresion> listaExpr) {
		this.name = name;
		this.listaExpr = listaExpr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Expresion> getListaExpr() {
		return listaExpr;
	}

	public void setParametros(ArrayList<Expresion> listaExpr) {
		this.listaExpr = listaExpr;
	}
	
	
	

}
