//This is my code.
//Sarah Flaherty
//CS312

package asn5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Polynomial 
{
	List<Term> polynomialList;
	//List<Term> polynomialList;
	
	/* 
	 * purpose: constructs an empty List
	 * input:   none
	 * result:  an empy arrayList of terms
	 */
	public Polynomial()
	{
		this.polynomialList = new ArrayList<Term>();
		//this.polynomialList = new LinkedList<Term>();
		
	}
	
	/* 
         * purpose: constructs a list of terms
         * input:   a polynomial
         * result:  an arrayList of the terms in the polynomials
         */
	public Polynomial(List<Term> termList)
	{
		this.polynomialList = new ArrayList<Term>();
		//this.polynomialList = new LinkedList<Term>();
		this.polynomialList = termList;
	}
	
	/*      
         * purpose: inserts a term in the polynomial
         * input:   a term and a polynomial, the term is the parameter
         * result:  a list of the terms in the polynomial including the new term
         */
	public void insertTerm(Term term) 
	{
		this.polynomialList.add(term);
	}

	/* purpose: add two polynomials
	 * input:   two polynomials, one as a parameter
	 * result:  the sum of the two polynomials
	 */
	public Polynomial add(Polynomial polyA) 
	{
		sort();
		ArrayList<Term> sum = new ArrayList<Term>();
		// LinkedList<Term> sum = new LinkedList<Term>();
		int nextA = 0;
		int nextB = 0;
		while (nextA < polyA.polynomialList.size() && nextB < this.polynomialList.size())
		{ 
			Term currentA = polyA.polynomialList.get(nextA);
			Term currentB = this.polynomialList.get(nextB);
			if (currentA.compareTo(currentB) == 0) 
			{ 
				int sumCoef = currentA.addCoef(currentB);
				Term sumTerm = new Term(sumCoef, currentA.findPower());
				sum.add(sumTerm);
			}
			else if (currentA.compareTo(currentB) > 0) 
			{
				sum.add(currentA);
				nextA ++;
			}  
			else 
			{
				sum.add(currentB);
				nextB++;
			}
 			
		}
		sort();
		return new Polynomial(sum);
	}

	/* 
	 * purpose: to multiply two polynomial
	 * input:   two polynomials, one as a parameter
	 * result:  the product of the two polynomials
	 */
	public Polynomial multiplyPoly(Polynomial poly1) 
	{
		sort();
		ArrayList<Term> product = new ArrayList<Term>();
		// LinkedList<Term> sum = new LinkedList<Term>();
		for (Term term : poly1.polynomialList)
                {
                	for (Term term1 : this.polynomialList)
                        {
				product.add(term.multiply(term1));
			}
		}
		return new Polynomial(product);
	}

	/* 
	 * purpose: multiply a polynomial and a term
	 * input:   a polynomial and a term, term is the parameter
	 * result:  the product of the polynomial and the term
	*/	 
	public Polynomial multiplyTerm(Term t) 
	{
		ArrayList<Term> product = new ArrayList<Term>();
		// LinkedList<Term> sum = new LinkedList<Term>();
		for (Term term : this.polynomialList)
		{
			product.add(term.multiply(t));
		}
		Polynomial productPoly = new Polynomial(product);
		sort();
		return productPoly;
	}
	
	/* 
	 * purpose: sort the list of terms
	 * input:   the list
	 * result:  the list in order
	 */
    public void sort() 
	{
    		Collections.sort(this.polynomialList);
	}
	
	
	public String toString()
	{
		String str ="";
		for (Term term : this.polynomialList)
			str+=term.toString() + " ";
		return str;
			
	}
	
	/* 
         * purpose: find the degree of the polynomial (the highest exponent)
         * input:   the polynomial
         * result:  the degree
         */
    	public int degree()
	{
		sort();
		return (this.polynomialList.get(0).findPower());
	}
}

