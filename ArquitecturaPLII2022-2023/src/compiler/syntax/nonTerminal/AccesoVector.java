package compiler.syntax.nonTerminal;

public class AccesoVector extends NonTerminal {
	
	private String name;
	private Expresion expresion;
	
	
	public AccesoVector(String name, Expresion expresion) {
		this.name = name;
		this.expresion = expresion;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Expresion getExpresion() {
		return expresion;
	}


	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}
	
	
	
	

}
