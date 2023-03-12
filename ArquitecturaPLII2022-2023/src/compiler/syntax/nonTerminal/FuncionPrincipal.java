package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class FuncionPrincipal extends NonTerminal {
	
	private TypeIF type;
	private String name;
	private CuerpoFuncion cuerpoFuncion;
	
	public FuncionPrincipal(TypeIF type, String name, CuerpoFuncion cuerpoFuncion) {
		super();
		this.type = type;
		this.name = name;
		this.cuerpoFuncion = cuerpoFuncion;
	}

	public TypeIF getType() {
		return type;
	}

	public void setType(TypeIF type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CuerpoFuncion getCuerpoFuncion() {
		return cuerpoFuncion;
	}

	public void setCuerpoFuncion(CuerpoFuncion cuerpoFuncion) {
		this.cuerpoFuncion = cuerpoFuncion;
	}
	
	@Override
	public String toString() {		
		return "name: " + name + ", type: " + type.getName();
	}
		
	
}
