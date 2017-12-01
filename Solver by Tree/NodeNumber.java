//This is my code
//Sarah Flaherty
//CS312
package asn6;
public class NodeNumber extends Node
{
	protected int number;	
     /*
     * purpose: constructor
     * input: value 
     * result: number with value
     */
	NodeNumber(int value)
	{
		number = value;
		precedence = 1;
	}
	
     /*
     * purpose: evaluate
     * input: none 
     * result: the number
     */
	public int evaluate()
	{
		return number;
	}
     /*
     * purpose: write the node to a string 
     * input: none 
     * result: the number as a string
     */
	public String toString()
	{
		return ("" + number);
	}
	
	/*
     * purpose: the node in prefix order
     * input: none 
     * result: the number
     */
	public String prefix()
	{
		return ( toString());
	}
	
	/*
     * purpose: the node in postfix order
     * input: none 
     * result: the number
     */
	public String postfix()
	{
		return ( toString());
	}
	
	/*
     * purpose: the node in inorder 
     * input: none 
     * result: the number
     */
	public String inorder()
	{
		return ( toString());
	}
}
