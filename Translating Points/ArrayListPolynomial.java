// This is my code 
// Sarah Flaherty
// CS312

package asn3;

import java.util.ArrayList;

public class ArrayListPolynomial 
{

	public ArrayList<Integer> buildFirstPolynomial() 
	{
		ArrayList<Integer> poly1 = new ArrayList<>();
		int x0 = 1;
		poly1.add(x0);
		int x1 = 3;
		poly1.add(x1);
		int x2 = 1;
		poly1.add(x2);
		return poly1;
	}

	public ArrayList<Integer> buildSecondPolynomial() 
	{
		ArrayList<Integer> poly2 = new ArrayList<>();
		int x0 = 0;
		poly2.add(x0);
		int x1 = 1;
		poly2.add(x1);
		int x2 = 0;
		poly2.add(x2);
		int x3 = 1;
		poly2.add(x3);
		return poly2;
	}

	public ArrayList<Integer> addition() 
	{
		ArrayList<Integer> sum = new ArrayList<>();
		ArrayList<Integer> polynomial1 = this.buildFirstPolynomial();
		ArrayList<Integer> polynomial2 = this.buildSecondPolynomial();
		if (polynomial1.size() == polynomial2.size()) 
		{
			for (int i = 0; i < polynomial1.size(); i++) 
			{
				Integer newCoef = (polynomial1.get(i) + polynomial2.get(i));
				sum.add(newCoef);
			}
		} 
		else if (polynomial1.size() < polynomial2.size()) 
		{
			for (int i = 0; i < polynomial1.size(); i++) 
			{
				Integer value1 = polynomial1.get(i);
				Integer value2 = polynomial2.get(i);
				Integer newCoef = value1 + value2;
				sum.add(newCoef);
			}
			for (int i = polynomial1.size(); i < polynomial2.size(); i++) 
			{
				sum.add(polynomial2.get(i));
			}

		} else {
			for (int i = 0; i < polynomial2.size(); i++) 
			{
				Integer newCoef = polynomial2.get(i) + polynomial1.get(i);
				sum.add(newCoef);
			}
			for (int i = polynomial2.size(); i < polynomial1.size(); i++) 
			{
				sum.add(polynomial1.get(i));
			}
		}
		return sum;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public ArrayList<Integer> multiplication() 
	{
		ArrayList<Integer> product = new ArrayList<>();
		ArrayList<Integer> poly1 = this.buildFirstPolynomial();
		ArrayList<Integer> poly2 = this.buildSecondPolynomial();
		/*if (poly1.size() > poly2.size() || poly1.size() == poly2.size()) 
		int coefficient=0;
	    int newDegree=0;
	    Monomial[] result=new Monomial[this.getMonomialCount()*other.getMonomialCount()];

	    for(int i=0;i<this.monoms.length;i++)
	    {  
	        thisMonomial=this.monoms[i];
	        for(int j=0;j<other.monoms.length;j++)
	        {
	            otherMonomial=other.monoms[j];
	            coefficient=thisMonomial.getCoefficient()*otherMonomial.getCoefficient();
	            newMonomial=new Monomial(coefficient);
	            for(int k=0;k<26;k++)
	            {
	                if(thisMonomial.isVariable((char)('a'+k))==true&&otherMonomial.isVariable((char)('a'+k))==true)
	                {
	                newDegree=thisMonomial.getDegree((char)('a'+k))+otherMonomial.getDegree((char)('a'+k));
	                }
	                else{
	                    if(thisMonomial.isVariable((char)('a'+k))==true){
	                        newDegree=thisMonomial.getDegree((char)('a'+k));
	                    }
	                    else{
	                        newDegree=otherMonomial.getDegree((char)('a'+k));
	                    }
	                    }
	                newMonomial.setDegree((char)('a'+k),newDegree); 
	                }
	            result[i]=newMonomial.getCopy();
	            }
	        }
	    */
	    return product;
	}

	public String toFirstString() 
	{
		String finalPolynomial = "The first ArrayList polynomials is: ";
		ArrayList<Integer> polyCoefs = this.buildFirstPolynomial();
		for (int i = polyCoefs.size() - 1; i >= 0; i--) 
		{
			if (i != 0) {
				finalPolynomial += (" + " + polyCoefs.get(i) + " x^" + i);
			} 
			else 
			{
				finalPolynomial += (" + " + polyCoefs.get(i));
			}
		}
		return finalPolynomial;
	}

	public String toSecondString() 
	{
		String finalPolynomial = "The second ArrayList polynomials is: ";
		ArrayList<Integer> polyCoefs = this.buildSecondPolynomial();
		for (int i = polyCoefs.size() - 1; i >= 0; i--) 
		{
			if (i != 0) 
			{
				finalPolynomial += (" + " + polyCoefs.get(i) + " x^" + i);
			} 
			else 
			{
				finalPolynomial += (" +" + polyCoefs.get(i));
			}
		}
		return finalPolynomial;
	}

	public String toSumString() 
	{
		String finalPolynomial = "The sum of the two ArrayList polynomials is: ";
		ArrayList<Integer> polyCoefs = this.addition();
		for (int i = polyCoefs.size() - 1; i >= 0; i--) 
		{
			if (i != 0) {
				finalPolynomial += (" + " + polyCoefs.get(i) + " x^ " + i);
			} 
		
			else 
			{
				finalPolynomial += (" + " + polyCoefs.get(i));
			}
		}
		return finalPolynomial;
	}

	public String toProductString() 
	{
		String finalPolynomial = "The product of the two ArrayList polynomials is: ";
		ArrayList<Integer> polyCoefs = this.multiplication();
		for (int i = polyCoefs.size() - 1; i >= 0; i--) 
		{
			if (i != 0) 
			{
				finalPolynomial += (" + " + polyCoefs.get(i) + " x^ " + i);
			} 
			else 
			{
				finalPolynomial += (" + " + polyCoefs.get(i));
			}
		}
		return finalPolynomial;
	}
	
	

}
