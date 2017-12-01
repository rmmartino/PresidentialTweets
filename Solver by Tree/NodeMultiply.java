//This is my code
//Sarah Flaherty
//CS312

package asn6;

public class NodeMultiply extends OperatorNode
{
	/* 
	 * purpose: constructor
	 * input:   the left and right children
	 * result:  the left and right children
	 */
	NodeMultiply(Node left, Node right)
	{
		super(left, right);
		precedence = 3;
	}
	
	/*
	 * purpose: write operator node as a string 
	 * input: none 
	 * result: the operator as a string
	 */
	public String toString()
	{
		return "*";
	}
	/* 
	 * purpose: evaluate the operator node
	 * input:   none
	 * result:  the product
	 */
	public int evaluate()
	{
		return (this.left.evaluate() * this.right.evaluate());
	}

}

