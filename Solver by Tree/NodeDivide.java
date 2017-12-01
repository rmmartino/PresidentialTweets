//This is my code
//Sarah Flaherty
//CS312

package asn6;

	public class NodeDivide extends OperatorNode 
	{
		/* 
		 * purpose: constructor
		 * input:   the left and right children
		 * result:  the left and right children
	    */
		NodeDivide(Node left, Node right)
		{
			super(left, right);
			precedence = 3;
		}
		
		/* 
		 * purpose: write the operator node as a string
		 * input:   none
		 * result:  the operator node as a string
		 */
		public String toString()
		{
			return "/";
		}
		/* 
		 * purpose: evaluate the operator node
		 * input:   none
		 * result:  the quotient
		 */
		public int evaluate()
		{
			return (this.left.evaluate() / this.right.evaluate());
		}
	}
