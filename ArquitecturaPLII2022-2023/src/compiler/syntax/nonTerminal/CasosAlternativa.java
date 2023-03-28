package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class CasosAlternativa extends NonTerminal { // hasmap de CasoAlt y un objeto porDefecto que puede ser null?
	
	private ArrayList<CasoAlt> casos;
	
	public CasosAlternativa() {
		super();
		this.casos = new ArrayList<>();
	}

	public ArrayList<CasoAlt> getCasos() {
		return casos;
	}

	public void setCasos(ArrayList<CasoAlt> casos) {
		this.casos = casos;
	}
	
	
	public void add(CasoAlt caso) {
		casos.add(caso);
	}
	
	

}
