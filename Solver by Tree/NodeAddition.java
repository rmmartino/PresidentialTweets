//This is my code
//Sarah Flaherty
//CS312
package asn6;

public class NodeAddition extends OperatorNode
{
	/* 
	 * purpose: construct the children nodes
	 * input:   the left and right children
	 * result:  the left and right children from the operator node class
	 */
	NodeAddition(Node left, Node right)
	{
		super(left, right);
		precedence = 4;
	}
	
	/* 
	 * purpose: write the value of the operator node as a string
	 * input:   none
	 * result: string of operator
	 */
	public String toString()
	{
		return "+";
	}
	/* 
	 * purpose: evaluate the operator node
	 * input:   the two children
	 * result:  the sum
	 */
	public int evaluate()
	{
		return (this.left.evaluate() + this.right.evaluate());
	}

}


