package compiler.semantic.type;

import compiler.CompilerContext;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeSimple.
 */

// TODO: Student work
//       Include properties to characterize simple types

public class TypeSimple
    extends TypeBase
{
    
//	private String name;
//	private ScopeIF scope;
//	private int size;
//	
    /**
     * Constructor for TypeSimple.
     * @param scope The declaration scope.
     */
    public TypeSimple (ScopeIF scope)
    {
        super (scope);
    }
    
    public TypeSimple (ScopeIF scope, String name)
    {
        super (scope, name);
    }
    
//    public TypeSimple(ScopeIF scope, String name) {
//		super(scope);
//		this.name = name;
//		this.scope = scope;
//	}
//    
//    public TypeSimple(ScopeIF scope, String name, int size) {
//		super(scope);
//		this.name = name;
//		this.scope = scope;
//		this.size = size;
//	}


	/**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        ExecutionEnvironmentIF environment = CompilerContext.getExecutionEnvironment ();
        return environment.getTypeSize (this);
    }
}
