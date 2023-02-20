package compiler.syntax.nonTerminal;

// Para cada atributo un get y un set. 
// al menos un constructor (el vacio)
// sobrescribir los metodos de object (toString, equals y hashcode)
public class Expresion extends NonTerminal {
	
	private String tipo;
	
	/** 
	 * @param tipo
	 */
	public Expresion() {};
	
	public Expresion(String tipo) {
		this();
		this.tipo = tipo;
	}
	
	public Expresion(Expresion e1) {
		this.tipo = e1.tipo;
	}
	
	public Expresion(Expresion e1, Expresion e2) {
		this();
	}

	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	} 
	
//	@Override
//	public int compareTo(Expresion e) {		
//		return Double.compare(this.tipo, e.tipo);
//	} 
	
}
