package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class SeccionTipos extends NonTerminal {
	
	private ArrayList<DeclaracionTipo> listaTipos;

	public SeccionTipos() {
		super();
		this.listaTipos = new ArrayList<>();
	}

	public ArrayList<DeclaracionTipo> getListaTipos() {
		return listaTipos;
	}

	public void setListaTipos(ArrayList<DeclaracionTipo> listaTipos) {
		this.listaTipos = listaTipos;
	}
	
	public void add(DeclaracionTipo declaracionTipo) {
		listaTipos.add(declaracionTipo);
	}
	
	

}
