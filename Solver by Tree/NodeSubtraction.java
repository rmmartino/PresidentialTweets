//This is my code
//Sarah Flaherty
//CS312

package asn6;

public class NodeSubtraction extends OperatorNode 
{
	/*
	 * purpose: constructor 
	 * input: the left and right children 
	 * result: the left and right children
	 */
	NodeSubtraction(Node left, Node right) 
	{
		super(left, right);
		precedence = 4;
	}

	/*
	 * purpose: write operator node as a string 
	 * input: none 
	 * result: the operator as a string
	 */
	public String toString() 
	{
		return "-";
	}

	/*
	 * purpose: evaluate the operator node 
	 * input: none 
	 * result: the difference
	 */
	public int evaluate() {
		return (this.left.evaluate() - this.right.evaluate());
	}
}

