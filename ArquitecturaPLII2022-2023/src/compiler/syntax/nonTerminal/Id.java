package compiler.syntax.nonTerminal;

public class Id extends NonTerminal {
	
	private String name;
	private int value;
	
	public Id() {}
	
	public Id(String name, int value) {
		this();
		this.name = name;
		this.value = value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}
	
		

}
