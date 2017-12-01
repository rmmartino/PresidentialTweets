// This is my code 
// Sarah Flaherty
// CS312

package asn3;

public class Tester 
{
	public static void main(String[] args) 
	{
		ArrayListPolynomial array1Poly = new ArrayListPolynomial();
		String polynom1 = array1Poly.toFirstString();
		System.out.println(polynom1); 
		
		ArrayListPolynomial array2Poly = new ArrayListPolynomial();
		String polynom2 = array2Poly.toSecondString();
		System.out.println(polynom2); 
		
		ArrayListPolynomial arraySumPoly = new ArrayListPolynomial();
		String polynomSum = arraySumPoly.toSumString();
		System.out.println(polynomSum); 
		
		ArrayListPolynomial arrayProductPoly = new ArrayListPolynomial();
		String polynomProduct = arrayProductPoly.toProductString();
		System.out.println(polynomProduct); 
		
		LinkedListPolynomial linked1Poly = new LinkedListPolynomial();
		String polyList1 = linked1Poly.toFirstString();
		System.out.println(polyList1); 
		
		LinkedListPolynomial linked2Poly = new LinkedListPolynomial();
		String polyList2 = linked2Poly.toSecondString();
		System.out.println(polyList2); 
		
		LinkedListPolynomial linkedSumPoly = new LinkedListPolynomial();
		String polyListSum = linkedSumPoly.toSumString();
		System.out.println(polyListSum); 
	}

}
