package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ListadoSentencias extends NonTerminal {
	
	private ArrayList<Sentencia> listaSentencias;
	private Boolean devuelve;
	
	public ListadoSentencias() {
		super();
		this.listaSentencias = new ArrayList<>();
		this.devuelve = false;
		
	}

	public ArrayList<Sentencia> getListaSentencias() {
		return listaSentencias;
	}

	public void setListaSentencias(ArrayList<Sentencia> listaSentencias) {
		this.listaSentencias = listaSentencias;
	}

	public Boolean getDevuelve() {
		return devuelve;
	}

	public void setDevuelve(Boolean devuelve) {
		this.devuelve = devuelve;
	}
	
	
	public void add(Sentencia sentencia) {
		listaSentencias.add(sentencia);
	}
	
	
	
	

}
