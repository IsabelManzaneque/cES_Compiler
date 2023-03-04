package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class Parametros extends NonTerminal {
	
	private ArrayList<Expresion> listaExpr;

	public Parametros() {
		
		listaExpr = new ArrayList<>();
	}
	
	public ArrayList<Expresion> getListaExpr() {
		return listaExpr;
	}

	public void setListaExpr(ArrayList<Expresion> listaExpr) {
		this.listaExpr = listaExpr;
	}
	
	public void add(Expresion expr) {
		listaExpr.add(expr);
	}

}
