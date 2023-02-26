package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class DeclaracionParametros extends NonTerminal {
	
	private ArrayList<Parametro> listaParam;

	public DeclaracionParametros() {
		
		listaParam = new ArrayList<>();
	}

	public ArrayList<Parametro> getListaParam() {
		return listaParam;
	}

	public void setListaParam(ArrayList<Parametro> listaParam) {
		this.listaParam = listaParam;
	}
	
	public void add(Parametro param) {
		listaParam.add(param);
	}

}
