import java.math.BigInteger;

/**
 * The Permutation class holds methods that handle the calculation of permutations.
 * @author Rachel Hussmann
 */
public class Permutation {

    /**
     * The getPermutation method uses the Permutation formula and integers to calculate the number of groups that
     * are possible.
     * @param n The size of the set to choose from.
     * @param r The number of choices to be made from the set.
     * @return The total number of groups that can be made from n and k as an integer.
     */
    public int getPermutation(int n, int r){

        //This method follows the formula for combinations n!/(n-r)!

        Factorial factorial = new Factorial();

        //Find the numerator for the fraction
        int numerator = factorial.factorial(n);

        //Find the denominator of the fractions
        int denominator = factorial.factorial(n-r);

        //Return the number that results from dividing the numerator by the denominator
        return numerator/denominator;
    }

    /**
     * The getPermutation method uses the Permutation formula and BigInteger objects to calculate the number of groups
     * that are possible.
     * @param n The size of the set to choose from.
     * @param r The number of choices to be made from the set.
     * @return The total number of groups that can be made from n and k as a BigInteger object.
     */
    public BigInteger getPermutation(BigInteger n, BigInteger r){

        //This method follows the formula for combinations n!/(n-r)!

        Factorial factorial = new Factorial();

        //Find the numerator for the fraction
        BigInteger numerator = factorial.factorial(n);

        //Find the denominator of the fractions
        BigInteger denominator = factorial.factorial(n.subtract(r));

        //Return the number that results from dividing the numerator by the denominator
        return numerator.divide(denominator);
    }


    /**
     * The testerOutput method is used to test the methods that have been developed in this class.
     */
    public void testerOutput(){
        //Initializes some BigInteger objects for test cases
        BigInteger n = BigInteger.valueOf(6);
        BigInteger r = BigInteger.valueOf(2);
        System.out.println("Permutations of n = 6 and r = 2: " + this.getPermutation(6, 2));
        System.out.println("Permutations of n = 6 and r = 2 using BigInteger: " + this.getPermutation(n, r));

        //Testing out an example from the book
        //Example 2.8 - Pizza problem
        //According to the textbook, the problem is a permutation and the answer is 24360
        BigInteger f = BigInteger.valueOf(30);
        BigInteger g = BigInteger.valueOf(3);

        System.out.println("Testing example 2.8 from the book (answer should be 24360): " +
                this.getPermutation(f, g));

        System.out.println();
    }
}
