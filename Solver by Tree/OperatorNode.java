//This is my code
//Sarah Flaherty
//CS312
package asn6;

public abstract class OperatorNode extends Node
{
	protected Node left;
	protected Node right;
	
     /*
     * purpose: constructor
     * input: left and right children 
     * result: left and right
     */
	OperatorNode(Node left, Node right)
	{
		this.left = left;
		this.right = right;
	}
	
     /*
     * purpose: the prefix order as a string
     * input: none 
     * result: the operator, the stuff to the left, the stuff to the right
     */
	public String prefix()
	{
		return (toString() + " " + left.toString() + " " + right.toString());
	}
	
     /*
     * purpose: the postifx order as a string
     * input: none 
     * result: the stuff to the left, the stuff to the right, the operator
     */
	public String postfix()
	{
		return ( left.toString() + " " + right.toString() + " " + toString() );
	}
	
     /*
     * purpose: the inorder as a string
     * input: none 
     * result: the stuff to the left, the operator, the stuff to the right
     */
	public String inorder()
	{
		return ( "(" + left.inorder() + " " + toString() + " " + right.inorder() + ")" );
	}

}

