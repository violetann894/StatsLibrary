import java.math.BigInteger;

/**
 * The Factorial Class is responsible for calculating factorial using integers and the BigInteger class.
 * @author Rachel Hussmann
 */
public class Factorial {

    /**
     * The factorial method calculates the number equal to 1 * 2 * 3 * . . . * n-1 * n (noted usually as n!).
     * @param n The number to find the factorial of.
     * @return The number equal to the factorial of n as an integer.
     */
    public int factorial(int n){

        //Create the starting point for the calculation
        int factorial = 1;

        //Use for loop to multiply the variable f by all the numbers in front of it up to and including n.
        for(int j = 1; j <= n; j++){

            //Multiply f by the current number in the loop
            factorial = factorial * j;
        }

        //Return the factorial of n
        return factorial;
    }

    /**
     * The factorial method calculates the number equal to 1 * 2 * 3 * . . . * n-1 * n (noted usually as n!).
     * @param n The BigInteger object to find the factorial of.
     * @return A BigInteger object equal to the factorial of n.
     */
    public BigInteger factorial(BigInteger n){

        //Create the starting point for the calculation
        BigInteger factorial = BigInteger.valueOf(1);

        //Create the count variable for the while loop used later
        BigInteger count = BigInteger.valueOf(1);

        //Use the loop to multiply the variable f by all the numbers in front of it up to and including n.
        while(count.compareTo(n) < 1){

            //Multiply f by the current number in the loop
            factorial = factorial.multiply(count);

            //Increment the loop counter
            count = count.add(BigInteger.valueOf(1));
        }

        //Return the BigInteger object equal to the factorial of n
        return factorial;
    }

}
