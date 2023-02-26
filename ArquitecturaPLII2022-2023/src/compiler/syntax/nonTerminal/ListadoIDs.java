package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class ListadoIDs extends NonTerminal {
	
	private ArrayList<Id> listaIds;

	public ListadoIDs() {
		
		listaIds = new ArrayList<>();
	}

	public ArrayList<Id> getListaIds() {
		return listaIds;
	}

	public void setListaIds(ArrayList<Id> listaIds) {
		this.listaIds = listaIds;
	}
	
	public void add(Id id) {
		listaIds.add(id);
	}
	

}
