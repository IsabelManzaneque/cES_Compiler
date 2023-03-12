package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ListadoSentencias extends NonTerminal {
	
	private ArrayList<Sentencia> listaSentencias;
	private Boolean devuelve;
	private TypeIF tipoDevuelto;
	
	public ListadoSentencias() {
		super();
		this.listaSentencias = new ArrayList<>();
		this.devuelve = false;
		this.tipoDevuelto = null;
		
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
	
	
	public TypeIF getTipoDevuelto() {
		return tipoDevuelto;
	}

	public void setTipoDevuelto(TypeIF tipoDevuelto) {
		this.tipoDevuelto = tipoDevuelto;
	}

	public void add(Sentencia sentencia) {
		listaSentencias.add(sentencia);
	}
	
	
	
	

}
