package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class SeccionConstantes extends NonTerminal {
	
	ArrayList<DeclaracionConstante> listaConstantes;

	public SeccionConstantes() {
		super();
		this.listaConstantes = new ArrayList<>();
	}

	public ArrayList<DeclaracionConstante> getListaConstantes() {
		return listaConstantes;
	}

	public void setListaConstantes(ArrayList<DeclaracionConstante> listaConstantes) {
		this.listaConstantes = listaConstantes;
	}
	
	public void add(DeclaracionConstante declaracionConstante) {
		listaConstantes.add(declaracionConstante);
	}
	

}
