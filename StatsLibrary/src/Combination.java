import java.math.BigInteger;

/**
 * The Combination class holds methods that handle the calculation of combinations.
 * @author Rachel Hussmann
 */
public class Combination {

    /**
     * The getCombination method uses the Combination formula and integers to calculate the number of combinations that
     * are possible.
     * @param n The size of the set to choose from.
     * @param r The number of choices to be made from the set.
     * @return The total number of combinations that can be made from n and k as an integer.
     */
    public int getCombination(int n, int r){

        //This method follows the formula for combinations n!/r!(n-r)!

        Factorial factorial = new Factorial();

        //Find the numerator for the fraction
        int numerator = factorial.factorial(n);

        //Find the denominator of the fractions
        int denominator = factorial.factorial(r)*factorial.factorial(n-r);

        //Return the number that results from dividing the numerator by the denominator
        return numerator/denominator;
    }

    /**
     * The getCombination method uses the Combination formula and BigInteger objects to calculate the number of
     * combinations that are possible.
     * @param n The size of the set to choose from.
     * @param r The number of choices to be made from the set.
     * @return The total number of combinations that can be made from n and k as a BigInteger object.
     */
    public BigInteger getCombination(BigInteger n, BigInteger r){

        //This method follows the formula for combinations n!/r!(n-r)!

        Factorial factorial = new Factorial();

        //Find the numerator for the fraction
        BigInteger numerator = factorial.factorial(n);

        //Find the denominator of the fractions
        BigInteger denominator = factorial.factorial(r).multiply(factorial.factorial(n.subtract(r)));

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

        //Testing simple example to make sure that factorial, getPermutation and getCombination methods work
        System.out.println("Combinations of n = 6 and r = 2: " + this.getCombination(6, 2));
        System.out.println("Combinations of n = 6 and r = 2 using BigInteger: " + this.getCombination(n, r));

        //Solve a problem from the textbook homework

        //Problem 2.57 "Two cards are drawn from a standard 52-card playing deck. What is the probability that the
        //draw will yield an ace and a face card?"
        BigInteger v = BigInteger.valueOf(52);
        BigInteger m = BigInteger.valueOf(2);

        //We are choosing one of the available aces. There are 4 aces in a deck of cards so we need to find the number
        //of combinations (since order doesn't matter) we can make from 4 choose 1.
        BigInteger aces = this.getCombination(BigInteger.valueOf(4), BigInteger.valueOf(1));

        //We are choosing one of the available aces. There are 12 faces in a deck of cards so we need to find the number
        //of combinations (since order doesn't matter) we can make from 12 choose 1.
        BigInteger faces = this.getCombination(BigInteger.valueOf(12), BigInteger.valueOf(1));

        //We need to find the total number of combinations we can find for 52 pick 2 (since order doesn't matter).
        BigInteger totalNumber = this.getCombination(v, m);

        //Since we have two number of combinations, we need to multiply them together to find the total number of
        //combinations for those two situations specifically.
        BigInteger wantedOutcome = aces.multiply(faces);

        //We then divide the wantedOutcome by the totalNumber of outcomes to give us our probability.
        System.out.println("The probability of drawing an ace and a face card in the same draw is: " + wantedOutcome
                + "/" + totalNumber);

        //Confirmed answer with the answer in the back of the textbook (48/1326 or .0362)

        System.out.println();
    }
}
