package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class CasosAlternativa extends NonTerminal {
	
	private ArrayList<CasoAlt> listaCasos;

	public CasosAlternativa() {
		super();
		this.listaCasos = new ArrayList<>();
	}

	public ArrayList<CasoAlt> getListaCasos() {
		return listaCasos;
	}

	public void setListaCasos(ArrayList<CasoAlt> listaCasos) {
		this.listaCasos = listaCasos;
	}
	
	public void add(CasoAlt caso) {
		listaCasos.add(caso);
	}

}
