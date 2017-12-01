//This is my code
//Sarah Flaherty
//CS312

package asn6;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class TestExpressions<E> 
{
	public TestExpressions() 
	{
	}
	
	/* 
	 * purpose: to test the NodeNumber, NodeAddition, NodeDivide and NodeMultiply
	 * input:   hardcoding the numbers
	 * result:  the evaluation of the tree
	 */
	@Test
	public void longEvaluate() 
	{
		NodeNumber n1 = new NodeNumber(1);
		NodeNumber n2 = new NodeNumber(2);
		NodeNumber n3 = new NodeNumber(3);
		NodeNumber n4 = new NodeNumber(4);
		NodeDivide div = new NodeDivide(n4, n2);
		NodeAddition add = new NodeAddition(div, n3);
		NodeMultiply mult = new NodeMultiply(add, n1);
		System.out.println(mult.evaluate());
		assertTrue(mult.evaluate() == 5);
	}

	/* 
	 * purpose: to test the NodeNumber
	 * input:   hard coding the number
	 * result:  the number
	 */
	@Test
	public void numberEvaluate() 
	{
		NodeNumber n5 = new NodeNumber(5);
		assertTrue(n5.evaluate() == 5);
		System.out.println(n5.evaluate());
	}
	
	/* 
	 * purpose: to test the NodeNumber and NodeAddition
	 * input:   hard coding the numbers
	 * result:  the sum of the numbers
	 */
	@Test
	public void additionEvaluate() 
	{
		NodeNumber n5 = new NodeNumber(5);
		NodeNumber n4 = new NodeNumber(4);
		NodeAddition add = new NodeAddition(n5, n4);
		assertTrue(add.evaluate() == 9);
		System.out.println(add.evaluate());
	}
	
	/* 
	 * purpose: to test the NodeNumber and NodeSubtraction
	 * input:   hard coding the numbers
	 * result:  the difference of the numbers
	 */
	@Test
	public void subtractionEvaluate() 
	{
		NodeNumber n5 = new NodeNumber(5);
		NodeNumber n4 = new NodeNumber(4);
		NodeSubtraction sub = new NodeSubtraction(n5, n4);
		assertTrue(sub.evaluate() == 1);
		System.out.println(sub.evaluate());
	}
	
	/* 
	 * purpose: to test the NodeNumber, NodeAddition, and NodeSubtraction
	 * input:   hard coding the numbers
	 * result:  the evaluation of the tree
	 */
	@Test
	public void addSubEvaluate() 
	{
		NodeNumber n1 = new NodeNumber(1);
		NodeNumber n2 = new NodeNumber(2);
		NodeNumber n3 = new NodeNumber(3);
		NodeAddition add1 = new NodeAddition(n1, n2);
		NodeSubtraction sub = new NodeSubtraction(n3, add1);
		System.out.println(sub.evaluate());
		assertTrue(sub.evaluate() == 0);
	}
	
	/* 
	 * purpose: to test the NodeNumber, NodeAddition with another addition
	 * input:   hard coding the numbers
	 * result:  the sum of the sum
	 */
	@Test
	public void addAddEvaluate() 
	{
		NodeNumber n1 = new NodeNumber(1);
		NodeNumber n2 = new NodeNumber(2);
		NodeNumber n3 = new NodeNumber(3);
		NodeAddition add1 = new NodeAddition(n1, n2);
		NodeAddition add = new NodeAddition(n3, add1);
		System.out.println(add.evaluate());
		assertTrue(add.evaluate() == 6);
	}
	
	/* 
	 * purpose: to test the NodeNumber, NodeNegation
	 * input:   hard coding the numbers
	 * result:  the negation of the number
	 */
	@Test
	public void NegationEvaluate() 
	{
		NodeNumber n5 = new NodeNumber(5);
		NodeNegation neg = new NodeNegation(n5);
		assertTrue(neg.evaluate() == -5);
		System.out.println(neg.evaluate());
	}
	
	/* 
	 * purpose: to test the Patrick order evaluation
	 * input:   hard coding the tree
	 * result:  the evaluation of the tree in patrick notation
	 */
	@Test
	public void PatrickEvaluate() 
	{
		NodeNumber n1 = new NodeNumber(1);
		NodeNumber n2 = new NodeNumber(2);
		NodeAddition add = new NodeAddition(n1, n2);
		ExpressionTree t1 = new ExpressionTree(add);
		assertTrue(t1.patrickOrderPrint().equals("+ 1 2") );
		System.out.println(t1.patrickOrderPrint());
	}
	
	/* 
	 * purpose: to test the Spongebob order evaluation
	 * input:   hard coding the tree
	 * result:  the evaluation of the tree in Spongebob notation
	 */
	@Test
	public void SpongeBobEvaluate() 
	{
		NodeNumber n1 = new NodeNumber(1);
		NodeNumber n2 = new NodeNumber(2);
		NodeAddition add = new NodeAddition(n1, n2);
		ExpressionTree t1 = new ExpressionTree(add);
		//assertTrue(add.evaluate() == 3 );
		System.out.println(t1.spongebobOrderPrint());
	}
	
	/* 
	 * purpose: to test the Squidward order evaluation
	 * input:   hard coding the tree
	 * result:  the evaluation of the tree in squidward notation
	 */
	@Test
	public void SquidwardEvaluate() 
	{
		NodeNumber n1 = new NodeNumber(1);
		NodeNumber n2 = new NodeNumber(2);
		NodeAddition add = new NodeAddition(n1, n2);
		ExpressionTree t1 = new ExpressionTree(add);
		assertTrue(t1.squidwardOrderPrint().equals("1 2 +") );
		System.out.println(t1.squidwardOrderPrint());
	}
	
	/* 
	 * purpose: to test the Mr Krabs order evaluation
	 * input:   hard coding the tree
	 * result:  the evaluation of the tree in Mr Krabs notation
	 */
	@Test
	public void MrKrabsEvaluate() 
	{
		NodeNumber n1 = new NodeNumber(1);
		NodeNumber n2 = new NodeNumber(2);
		NodeAddition add = new NodeAddition(n1, n2);
		ExpressionTree t1 = new ExpressionTree(add);
		assertTrue(t1.mrKrabsOrderPrint().equals("(1 + 2)"));
		System.out.println(t1.mrKrabsOrderPrint());
	}
	
	/* 
	 * purpose: to test the Mr Krabs order evaluation with a more complex tree
	 * input:   hard coding the tree
	 * result:  the evaluation of the tree in Mr Krabs notation
	 */
	@Test
	public void longKrabsEvaluate() 
	{
		NodeNumber n1 = new NodeNumber(1);
		NodeNumber n2 = new NodeNumber(2);
		NodeNumber n3 = new NodeNumber(3);
		NodeNumber n4 = new NodeNumber(4);
		NodeDivide div = new NodeDivide(n4, n2);
		NodeAddition add = new NodeAddition(div, n3);
		NodeMultiply mult = new NodeMultiply(add, n1);
		ExpressionTree t1 = new ExpressionTree(mult);
		System.out.println(t1.mrKrabsOrderPrint());
		assertTrue(t1.mrKrabsOrderPrint().equals("(((4 / 2) + 3) * 1)"));
	}

	public static void main(String[] args) 
	{
		JUnitCore runner = new JUnitCore();
		runner.addListener(new TestListener());
		Result result = runner.run(TestExpressions.class);
	}
}

class TestListener extends RunListener 
{
	public void testStarted(Description description) 
	{

	}

	public void testFinished(Description description) 
	{
		// System.out.println("Finished "+ description.getMethodName());

	}

	public void testRunFinished(Result result) 
	{
		int ran = result.getRunCount();
		int failed = result.getFailureCount();
		System.out.println("Ran " + ran + " passed " + (ran - failed) + (result.wasSuccessful() ? " all passed!" : " ... Failed:"));
		for (Failure failure : result.getFailures())
			System.out.println(failure.toString());
	}
}
