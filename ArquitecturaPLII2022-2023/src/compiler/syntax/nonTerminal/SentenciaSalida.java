package compiler.syntax.nonTerminal;

public class SentenciaSalida extends NonTerminal {
	
	private String opcionEscribe;
	private Expresion opcionEscribeEntero;
	
	public SentenciaSalida() {
		super();
		this.opcionEscribe = null;
		this.opcionEscribeEntero = null;
	}
	
	public SentenciaSalida(String opcionEscribe) {
		super();
		this.opcionEscribe = opcionEscribe;
		this.opcionEscribeEntero = null;
	}
	public SentenciaSalida(Expresion opcionEscribeEntero) {
		super();
		this.opcionEscribe = null;
		this.opcionEscribeEntero = opcionEscribeEntero;
	}
	public String getOpcionEscribe() {
		return opcionEscribe;
	}
	public void setOpcionEscribe(String opcionEscribe) {
		this.opcionEscribe = opcionEscribe;
	}
	public Expresion getOpcionEscribeEntero() {
		return opcionEscribeEntero;
	}
	public void setOpcionEscribeEntero(Expresion opcionEscribeEntero) {
		this.opcionEscribeEntero = opcionEscribeEntero;
	}
	
	
	
	

}
