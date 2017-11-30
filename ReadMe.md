//This is my code
//Sarah Flaherty
//CS312

timewarp

Due October 27th

Plateau Schedule

Create Class for Polynomial
1. Write the contructor for an empty list that holds the polynomial of terms
2. Create class for Term
3. Create the attributes for term and make the constructor for a term
4. Write a compare method that compares the powers of two terms
5. Write a toString method for terms and use it in a toString method for polynomial
6. Write a sort method to order the polynomials.
7. Write method for adding terms in Term class. This adds the two coefficients and keeps the power. It will return a new term of the sum.
8. Write the add method in Polynomial. (To add two polynomials, iterate through each and compare the powers of the terms. If they are the same power use the add terms method to get a new term of the sum. If one is larger, add it to the sum polynomial and focus on the next term in that polynomial. If the other is larger, add that to the polynomial and move to the next term in that polynomial.)
9. Write a multiply method in the term class. This will multiply the coefficients of the two terms and add their powers. It will return the new term that is the product of the two terms.
10. Write a multiply method that multiplies two polynomials in polynomial that iterates through one polynomial and multiplies each term by each term in the second polynomial. It will return a polynomial of the product.
11. Write a mutiply method the multiplies a polynomial by a term. It will return a polynomial of the product.
Test Cases:

Polynomial 1 = x^2 +3x +1

Polynomial 2 = x^3 + 0x^2 +x + 0

Sum = x^3 + x^2 + 4x + 1

Product = x^5 + 3x^4 + 2x^3 + 3x^2 + x + 0

Rationale: Example with higher exponents in Polynomial 2 than Polynomial 1.

Polynomial 1 = 5x^2 +0x +9

Polynomial 2 = 0x^3 + 0x^2 +0x + 0

Sum = 0x^3 + 5x^2 + 0x + 9

Product = 0x^5 + 0x^4 + 0x^3 + 0x^2 + 0x + 0

Rationale: Example with all zeroes as coefficients.

Polynomial 1 = x^5 - 4x^4 +3x^3 + 2x^2 +x +6

Polynomial 2 = x + 7

Sum = x^5 - 4x^4 +3x^3 +2x^2 +2x + 13

Product = x^6 + -4x^5 + 3x^4 +2x^3 + x^2 + 0x + 0

Rationale: Example with higher exponents in Polynomial 1 than Polynomial 2.

Polynomial 1 = x^2 + -3x +1

Polynomial 2 = 3x^2 + 2x +4

Sum = 4x^2 -x +5

Product = 3x^4 -7x^3 +x^2 -10x +4

Rationale:Example with same highest exponent.

Polynomial 1 = 1

Polynomial 2= 0x^2 + 0x +0

Sum = 1

Product = 0

Rationale: Example with product 0.


Empirical Data Analysis:

ArrayList K	Time 1000000	i took 49ms and used 1342KB 100000000	i took 193ms and used 1342KB 1000000000	i took 3934ms and used 1342KB 2000000000	i took 3544ms and used 1331KB 2100000000	i took 4098ms and used 1331KB 2110000000	i took 7256ms and used 1331KB

LinkedList K	Time 1000000	i took 44ms and used 1342KB 	i took 568ms 10000000 and used 1342KB 2000000000	i took 8032ms and used 1342KB 2100000000	i took 8782ms and used 1342KB

Differences between ArrayLists and LinkedLists Times: The times are pretty similar which I expected due to the object oriented format. Since both kinds of lists are iterated through using the same methods, they should take about hte same amount of time. I expected variaion due to other things occuring on the machine. 
