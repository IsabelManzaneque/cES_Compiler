package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class SeccionFunciones extends NonTerminal {
	
	private ArrayList<Funcion> listaFunciones;
	private FuncionPrincipal funcionPrincipal;
	
	public SeccionFunciones() {
		super();
		this.listaFunciones = new ArrayList<>();
		this.funcionPrincipal = null;
	}

	public SeccionFunciones(FuncionPrincipal funcionPrincipal) {
		super();
		this.listaFunciones = new ArrayList<>();
		this.funcionPrincipal = funcionPrincipal;
	}

	public ArrayList<Funcion> getListaFunciones() {
		return listaFunciones;
	}

	public void setListaFunciones(ArrayList<Funcion> listaFunciones) {
		this.listaFunciones = listaFunciones;
	}

	public FuncionPrincipal getFuncionPrincipal() {
		return funcionPrincipal;
	}

	public void setFuncionPrincipal(FuncionPrincipal funcionPrincipal) {
		this.funcionPrincipal = funcionPrincipal;
	}
	
	public void addFuncion(Funcion funcion) {
		listaFunciones.add(funcion);
	}
	
	

}
