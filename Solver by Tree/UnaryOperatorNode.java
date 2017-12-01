//This is my code
//Sarah Flaherty
//CS312

package asn6;

public abstract class UnaryOperatorNode extends Node
{
	protected Node child;
	
	 /*
     * purpose: constructor
     * input: none 
     * result: the single child node
     */
	UnaryOperatorNode(Node child)
	{
		this.child = child;
	}
	
	 /*
     * purpose: the prefix as a string
     * input: none 
     * result: the child then the operator
     */
	public String prefix()
	{
		return (toString() + " " + child.toString());
	}
	
	 /*
     * purpose: the postfix as a string
     * input: none 
     * result: the operator then the child
     */
	public String postfix()
	{
		return ( child.toString() + " " + toString() );
	}
	
	 /*
     * purpose: the inorder as a string
     * input: none 
     * result: the operator then the child
     */
	public String inorder()
	{
		return ( "(" + toString() + " " + child.inorder() +  ")");
	}
}

