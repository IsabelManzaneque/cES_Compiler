package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeArray.
 */

// TODO: Student work
//       Include properties to characterize array type

public class TypeArray
    extends TypeBase
{   
	
	private int size;
    
	/**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     */
    public TypeArray (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     * @param name The name of the type.
     */
    public TypeArray (ScopeIF scope, String name)
    {
        super (scope, name);
    }
    
    /**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     * @param name The name of the type.
     * @param size Tamano del vector.
     */
    public TypeArray (ScopeIF scope, String name, int size)
    {
        super (scope, name);
        this.size = size;
    }
    
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        // TODO: Student work
        return size;
    }
}
