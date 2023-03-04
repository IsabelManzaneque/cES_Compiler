package compiler.syntax.nonTerminal;

public class Ref extends NonTerminal {
	
	private String name;

	public Ref(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
