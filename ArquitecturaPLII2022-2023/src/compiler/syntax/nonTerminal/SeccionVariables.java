package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class SeccionVariables extends NonTerminal {
	
	private ArrayList<DeclaracionVariable> listaVariables;

	public SeccionVariables() {
		super();
		this.listaVariables = new ArrayList<>();
	}

	public ArrayList<DeclaracionVariable> getListaVariables() {
		return listaVariables;
	}

	public void setListaVariables(ArrayList<DeclaracionVariable> listaVariables) {
		this.listaVariables = listaVariables;
	}
	
	public void add(DeclaracionVariable declaracionVariable) {
		listaVariables.add(declaracionVariable);
	}
	
	

}
