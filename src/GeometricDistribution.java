/**
 * The GeometricDistribution class handles the calculation of Geometric Distributions and all other statistical values
 * associated with Geometric Distributions.
 * @author Rachel Hussmann
 */
public class GeometricDistribution {

    /**
     * The geometricDistribution method calculates the probability of an event based off of a geometric distribution
     * formula.
     * @param probOfSuccess The probability of a successful trial
     * @param numberOfFirstSuccess The trial where the first success happens
     * @return The probability of the event
     */
    public double geometricDistribution(double probOfSuccess, int numberOfFirstSuccess){

        //Calculate the probability of failure
        double probOfFail = 1.0 - probOfSuccess;

        //Find the probability of failure raised to the number of the trial with the first success minus one
        double qYMinusOne = Math.pow(probOfFail, numberOfFirstSuccess-1);

        //Return the value of the above calculation multiplied by the probability of success
        return qYMinusOne*probOfSuccess;

    }

    /**
     * The expectedValue method calculates the expected value (mean) of a geometric distribution.
     * @param probOfSuccess The probability of a successful trial
     * @return The expected value (mean) of the geometric distribution
     */
    public double expectedValue(double probOfSuccess){
        return 1/probOfSuccess;
    }

    /**
     * The variance method calculates the variance of a geometric distribution.
     * @param probOfSuccess The probability of a successful trial
     * @return The variance of the geometric distribution
     */
    public double variance(double probOfSuccess){
        return (1-probOfSuccess)/probOfSuccess;
    }

    /**
     * The standardDeviation method calculates the standard deviation of a geometric distribution.
     * @param variance The variance of the geometric distribution
     * @return The standard deviation of the geometric distribution
     */
    public double standardDeviation(double variance){
        return Math.sqrt(variance);
    }

    /**
     * The testerOutput method displays an example output of the methods within the GeometricDistribution class.
     */
    public void testerOutput(){
        System.out.println("Geometric Distribution for p = 0.8 and y = 4: " +
                geometricDistribution(0.8, 4));
        System.out.println("Expected value of the distribution: " + expectedValue(0.8));
        System.out.println("Variance of the distribution: " + variance(0.8));
        System.out.println("Standard deviation of the distribution: " + standardDeviation(variance(0.8)));
        System.out.println();
    }

}
