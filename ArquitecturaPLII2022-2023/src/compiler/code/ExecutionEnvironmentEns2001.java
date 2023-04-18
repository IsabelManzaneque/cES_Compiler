package compiler.code;

import java.util.Arrays;
import java.util.List;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import compiler.semantic.type.TypeSimple;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.LabelFactory;
import es.uned.lsi.compiler.intermediate.LabelIF;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001 
    implements ExecutionEnvironmentIF
{    
    private final static int      MAX_ADDRESS = 65535; 
    private final static String[] REGISTERS   = {
       ".PC", ".SP", ".SR", ".IX", ".IY", ".A", 
       ".R0", ".R1", ".R2", ".R3", ".R4", 
       ".R5", ".R6", ".R7", ".R8", ".R9"
    };
    
    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF   memoryDescriptor;
    
    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001 ()
    {       
        super ();
    }
    
    /**
     * Returns the size of the type within the architecture.
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize (TypeSimple type)
    {      
        return 1;  
    }
    
    /**
     * Returns the registers.
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters ()
    {
        return Arrays.asList (REGISTERS);
    }
    
    /**
     * Returns the memory size.
     * @return the memory size.
     */
    @Override
    public final int getMemorySize ()
    {
        return MAX_ADDRESS;
    }
           
    /**
     * Returns the registerDescriptor.
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor ()
    {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor ()
    {
        return memoryDescriptor;
    }
    
    private String getOp(OperandIF o) {
    	
    	if(o instanceof Variable) {
    		return "/" + ((Variable)o).getAddress();
    	}
    	if(o instanceof Value) {
    		return "#" + ((Value)o).getValue();
    	}
    	if(o instanceof Temporal) {
    		return "/" + ((Temporal)o).getAddress();
    	}
    	if(o instanceof Label) {
    		return ((Label)o).getName();
    	}
    	return null;
    }
    
    
    
 /* SVA (Set Value Address): se utiliza para establecer el valor de una temporal como una dirección de memoria dada. 
    La instrucción toma una dirección de memoria como operando y la copia en una temporal que se le pasa como destino.
    
    STP (Store in Place): se utiliza para almacenar el valor de una temporal en su lugar actual de memoria.
    La instrucción toma una temporal como operando y la almacena en la dirección de memoria que corresponde a esa temporal.

    MVA (Move Address): se utiliza para copiar la dirección de memoria de una temporal a otra temporal. 
    La instrucción toma una temporal como operando y la copia en otra temporal que se le pasa como destino.

    MVP (Move Pointer): se utiliza para copiar el valor de una temporal en otra temporal. 
    La instrucción toma una temporal como operando y copia el valor almacenado en esa dirección de memoria en otra temporal que 
    se le pasa como destino.
    
    */    
    

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple)
    {      
        //TODO: Student work
    	
    	StringBuffer b = new StringBuffer();
    	LabelFactory lF = new LabelFactory(); 
    	
    	String op1 = getOp(quadruple.getFirstOperand());
    	String op2 = getOp(quadruple.getSecondOperand());
    	String res = getOp(quadruple.getResult());
    	
    	LabelIF l1 = lF.create();
		LabelIF l2 = lF.create();
    	
    	b.append(";" + quadruple.toString() + "\n");
    	
    	switch(quadruple.getOperation()){
    		    	
		    case "ADD":				
		    	
				b.append("ADD " + op1 + ", " + op2 + "\n");
				b.append("MOVE .A" + ", " + res + "\n");
				return b.toString();
				
		    case "SUB":				
		    	
				b.append("SUB " + op1 + ", " + op2 + "\n");
				b.append("MOVE .A" + ", " + res + "\n");
				return b.toString();
		    
		    case "LOAD":				
		    	
				b.append("MOVE " + op1 + ", .R1\n");
				b.append("MOVE [.R1], " + res + "\n");
				return b.toString();
				
		    case "AND":				
		    	
		    	b.append("AND " + op1 + ", " + op2 + "\n");
		    	b.append("MOVE .A" + ", " + res + "\n");	        	
				return b.toString();
		    
		    case "MUL":				
		    	
				b.append("MUL " + op1 + ", " + op2 + "\n");
				b.append("MOVE " + ".A" + ", " + res + "\n");
				return b.toString();
				
		    case "NOT":				
		    	
		    	b.append("SUB"+ op1 + ", " + "#1\n");
	        	b.append("BZ /" + l1 + "\n");
	        	b.append("MOVE #1, " + res + "\n");
	        	b.append("BR /" + l2 + "\n");
	        	b.append(l1 + ":\n");
	        	b.append("MOVE #0, " + res + "\n");
	        	b.append(l2 + ":\n");
	        	
				return b.toString();
			
		    case "EQ":	    	
		    	        										        	
				b.append("CMP " + op1 + ", " + op2 + "\n");	 	        	
				b.append("BNZ /" + l2 + "\n");       // si resultado no es 0 (op1 != op2) salta a l2        	
	        	b.append("MOVE #1, " + res + "\n");         	
	        	b.append("BZ /" + l1 + "\n");        // si resultado es 0 (op1 == op2) salta a l1     	
	        	b.append(l2 + ": \n");               // l2        	
	        	b.append("MOVE #0, " + res + "\n");        	
	        	b.append(l1 + ": \n");               // l1
	        	
				return b.toString();
				
		    case "LS":	
		    	
		    	b.append("CMP " + op1 + ", " + op2 + "\n");					
		    	b.append("BN /" + l2 + "\n");         // si el resultado es negativo, salta a l2
		    	b.append("MOVE #0, " + res + "\n");
		    	b.append("BR /" + l1 + "\n");         // salto incondicional a l1
		    	b.append(l2 + ": \n");                // l2
		    	b.append("MOVE #1, " + res + "\n");
		    	b.append(l1 + ": \n");                // l1
		    	
				return b.toString();
				
		    case "MV":	
		    	
		    	b.append("MOVE " + op1 + ", " + res +"\n");
				return b.toString();
			
		    case "MVA":	
		    	
//		     	b.append("MOVE #" + ((Variable)quadruple.getFirstOperand()).getAddress() + ", " + res + "\n");
//				return b.toString();
		    	
		    	if(quadruple.getFirstOperand() instanceof Variable) {
		    		b.append("MOVE #" + ((Variable)quadruple.getFirstOperand()).getAddress() + ", " + res + "\n");
		    	}else if(quadruple.getFirstOperand() instanceof Temporal) {
		    		b.append("MOVE #" + ((Temporal)quadruple.getFirstOperand()).getAddress() + ", " + res + "\n");
		    	}
		    	return b.toString();
		    	
		    case "MVP":	
		    	
		     	b.append("MOVE " + op1 + ", " + res + "\n");
				return b.toString();
			
		    case "INC":	
		    	
		     	b.append("INC " + res + "\n");
				return b.toString();
				
		    case "INL":	
		    	
		     	b.append(res + ":NOP\n");
				return b.toString();
				
		    case "STP":	 
		    	
		     	b.append("MOVE " + res + ", .R1\n");   //mover al registro R1
		     	b.append("MOVE " + op1 + ", [.R1]\n"); //mover a la posicion de memoria que contiene R1
				return b.toString();
		    					
		    case "VAR":
				
		    	b.append("MOVE " + op1 + ", " + res +"\n");		    	
				return b.toString();
			
		    case "WRITESTR":
		    	
		    	b.append("WRSTR /" + op1 + "\n");		    	
				return b.toString();
		    
		    case "WRITEINT":
				
		    	b.append("WRINT " + res + "\n");		    	
				return b.toString();
			
		    case "HALT":
				
		    	b.append("HALT\n");		    	
				return b.toString();
			
		    case "BRF":	 
		    	   	
		    	b.append("CMP #1, " + res + "\n");
		    	b.append("BNZ /" + op1 + "\n");
				return b.toString();
		    
		    case "NOP":	 
	    	   	
		    	b.append("NOP\n");		    	
				return b.toString();
		    
		    case "BRF0":	 
	    	   	
		    	b.append("CMP #0, " + res + "\n");
		    	b.append("BNZ /" + op1 + "\n");
				return b.toString();
			
		    case "BRF1":	 
	    	   	
		    	b.append("CMP #0, " + res + "\n");
		    	b.append("BZ /" + op1 + "\n");
				return b.toString();
				
		    case "BR":	
	    	   			   
		    	b.append("BR /" + res + "\n");
				return b.toString();		    
		   
			
		    case "STR":
				
		    	b.append(op1 + ": DATA " + res + "\n");		    	
				return b.toString();
		    
		    default:
				break;
		}
	
        return quadruple.toString(); 
    }
}
