package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Funcion extends NonTerminal {
	
	private TypeIF type;
	private String name;
	private SeccionParametros seccionParametros;
	private CuerpoFuncion cuerpoFuncion;
	
	public Funcion(TypeIF type, String name, SeccionParametros seccionParametros, CuerpoFuncion cuerpoFuncion) {
		super();
		this.type = type;
		this.name = name;
		this.seccionParametros = seccionParametros;
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

	public SeccionParametros getSeccionParametros() {
		return seccionParametros;
	}

	public void setSeccionParametros(SeccionParametros seccionParametros) {
		this.seccionParametros = seccionParametros;
	}

	public CuerpoFuncion getCuerpoFuncion() {
		return cuerpoFuncion;
	}

	public void setCuerpoFuncion(CuerpoFuncion cuerpoFuncion) {
		this.cuerpoFuncion = cuerpoFuncion;
	}
	
		
	
}
