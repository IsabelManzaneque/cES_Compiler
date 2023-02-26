package compiler.syntax.nonTerminal;

public class DeclaracionVariable extends NonTerminal {
	
	private int value;
	private String type;
	
	/**
	 * @param value
	 * @param type
	 */
	public DeclaracionVariable(int value, String type) {
		this.value = value;
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public String getType() {
		return type;
	} 	
	

}
