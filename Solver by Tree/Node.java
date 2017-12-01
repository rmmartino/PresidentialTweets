//This is my code
//Sarah Flaherty
//CS312

package asn6;

public abstract class Node
{
	abstract public String toString();
	abstract public int evaluate();
	abstract public String prefix();
	abstract public String postfix();
	abstract public String inorder();
	protected int precedence;
	
}

