//This is my code
//Sarah Flaherty
//CS 312

package asn6;

import java.util.*;

public class ExpressionTree 
{
	protected Node root;

	/*
	 * purpose: constructor for the root of a tree
	 * input: the root 
	 * result: the  root
	 */
	public ExpressionTree(Node root) 
	{
		this.root = root;
	}

	/*
	 * purpose: order for spongebob's accountant: just the final amount
	 * input: the tree's root
	 * result: the final value
	 */
	public int spongebobOrderPrint() // 3
	{
		return this.root.evaluate();
	}

	/*
	 * purpose: order for patrick's accountant: pre-order 
	 * input: the tree's root
	 * result: the function in patrick notation
	 */
	public String patrickOrderPrint() // + 1 2
	{
		return (root.prefix());
	}

	/*
	 * purpose: order for squidward's accountant: post-order
	 * input: the root of the tree 
	 * result: the function in squidward notations
	 */
	public String squidwardOrderPrint() // 1 2 +
	{
		return (root.postfix());
	}

	/*
	 * purpose: order for mrKrab's accountant: Parentheses form 
	 * input: the root of the tree 
	 * result: the function in Mr. Krab's notation
	 */
	public String mrKrabsOrderPrint() // (1 + 2)
	{
		return (root.inorder());

	}
}

