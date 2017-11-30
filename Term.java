//This is my code.
//Sarah Flaherty
//CS312

package asn5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Term implements Comparable
{
	/* purpose: construct attributes of coefficient and power
	 * input:  none
	 * result:  coefficient and power attributes
	 */
	protected int coef;
	protected int power;

	/*purpose: instantiate the coef and power attributes
	 * input:   coef and power ints
	 * result:  coef and power as values
	 */
	public Term(int coef, int power) 
	{
		this.coef = coef;
		this.power = power;
	}

	/* purpose: to compare the powers of two terms 
	 * input:  two terms, one as a parameter
	 * result:  0,1,-1, to describe equal, <,or >
	 */
	@Override
	public int compareTo(Object obj) 
	{
		Term term = (Term) obj;
		if (term.power == this.power)
			return 0;
		else if (term.power>this.power)
			return -1;
		else 
			return 1;
	}
	
	/* purpose: find the power of the function
	 * input:   a term
	 * result:  the power of the term
	 */
	public int findPower() 
	{
		return this.power;
	}
	
	/* purpose: to add the coefficients of two terms
	 * input:   two terms, one term as a perameter
	 * result:  an int of the sum of the coefficient
	 */
	public int addCoef(Term term1) 
	{
		int sumCoef = term1.coef + this.coef;
		return sumCoef;
	}
	
	/* purpose: to multiply a term by a term 
         * input:   a term and a term, the term as a parameter
         * result:  a new term with the product of two terms
         */
        public Term multiply(Term term1)
        {
                int productCoef = term1.coef * this.coef;
		int productPower = term1.power + this.power;
                Term productTerm = new Term(productCoef, productPower);
		return productTerm;
        }

	/* purpose: to write the term as a string
	 * input:   a term
	 * result:  a string of the term
	 */
	public String toString() 
	{
		String str = this.coef + "x" + "^" + this.power;
		return str;
	}
	
	/* purpose: to find the degree of the term 
         * input:   a term
         * result:  the number of the highest power
         */
        public int degree()
        {
		return this.power;
	}

}
