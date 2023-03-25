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
    
    private String operacion(OperandIF o) {
    	
    	if(o instanceof Variable) {
    		return "#-" + ((Variable)o).getAddress() + "[.IX]";
    	}
    	if(o instanceof Value) {
    		return "#" + ((Value)o).getValue();
    	}
    	if(o instanceof Temporal) {
    		return "#-" + ((Temporal)o).getAddress() + "[.IX]";
    	}
    	if(o instanceof Label) {
    		return ((Label)o).getName();
    	}
    	return null;
    }

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple)
    {      
        //TODO: Student work
    	
    	String op = quadruple.getOperation();    	
    	String op1 = operacion(quadruple.getFirstOperand());
    	String op2 = operacion(quadruple.getSecondOperand());
    	String res = operacion(quadruple.getResult());
    	StringBuffer b = new StringBuffer();
    	b.append(";" + quadruple.toString() + "\n");
    	
    	switch(op){
    		    	
		    case "ADD":				
		    	
				b.append("ADD " + op1 + ", " + op2 + "\n");
				b.append("MOVE " + ".A" + ", " + res + "\n");
				return b.toString();
		    
		    case "MV":	
		    	
		    	b.append("MOVE " + op1 + ", " + res +"\n");
				return b.toString();
		    
		    case "STARTGLOBAL":
				
		    	b.append("MOVE .SP, .IX\n");
		    	b.append("PUSH #-1\n");
		    	b.append("PUSH .IX\n");
		    	b.append("PUSH .SR\n");
		    	b.append("PUSH .IX\n");
				return b.toString();
			
		    case "PUNTEROGLOBAL":
				
		    	b.append("SUB .IX, " + op1 + "\n");
		    	b.append("MOVE .A, .SP\n");		    	
				return b.toString();
				
		    case "VAR":
				
		    	b.append("PUSH " + op1 + "\n");		    	
				return b.toString();
		    
		    default:
				break;
		}
	
        return quadruple.toString(); 
    }
}
