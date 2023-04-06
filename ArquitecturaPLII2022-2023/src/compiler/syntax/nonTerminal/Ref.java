package compiler.syntax.nonTerminal;

import compiler.intermediate.Variable;

public class Ref extends NonTerminal {
	
	private String id;
	private AccesoVector accesoVector;
	Variable var;
	
	public Ref(String id) {
		this.id = id;
		this.accesoVector = null;
	}
	
	public Ref(AccesoVector accesoVector) {
		this.id = null;
		this.accesoVector = accesoVector;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AccesoVector getAccesoVector() {
		return accesoVector;
	}

	public void setAccesoVector(AccesoVector accesoVector) {
		this.accesoVector = accesoVector;
	}

	public Variable getVar() {
		return var;
	}

	public void setVar(Variable var) {
		this.var = var;
	}


}
