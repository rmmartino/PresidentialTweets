//This is my code
//Sarah Flaherty
//CS312

package asn6;

public class NodeNegation extends UnaryOperatorNode 
{
	/* 
	 * purpose: constructor
	 * input:   the left and right children
	 * result:  the left and right children
	 */
		NodeNegation(Node child)
		{
			super(child);
			precedence = 2;
		}
		
		/* 
		 * purpose: write the operator node as a string
		 * input:   none
		 * result:  the operator node as a string
		 */
		public String toString()
		{
			return "~";
		}
		/* 
		 * purpose: evaluate the operator node
		 * input:   none
		 * result:  the negation
		 */
		public int evaluate()
		{
			return ((-1) * this.child.evaluate());
		}
	}


