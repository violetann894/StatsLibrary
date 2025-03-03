/**
 * The NegativeBinomialDistribution class handles the calculation of Negative Binomial Distribution and all other
 * statistical values associated with Negative Binomial Distribution.
 * @author Rachel Hussmann
 */
public class NegativeBinomialDistribution {

    /**
     * The negativeBinomialDistribution method calculates the probability of an event based off of a negative
     * binomial distribution formula.
     * @param trialWithSuccess The trial number that had the successful result
     * @param numberOfSuccesses The total number of successful trials
     * @param probOfSuccess The probability of a successful trial
     * @return The probability of an event
     */
    public double negativeBinomialDistribution(int trialWithSuccess, int numberOfSuccesses, double probOfSuccess){

        //Create a new combination object to gain access to the combination method
        Combination combination = new Combination();

        //Get the combination of trialsWithSuccess minus one and numberOfSuccesses
        int comb = combination.getCombination(trialWithSuccess-1, numberOfSuccesses-1);

        //Find the probability of success raised to the number of successes
        double pR = Math.pow(probOfSuccess, numberOfSuccesses);

        //Find the probability of failure raised to the successful trial minus the number of successes
        double qYMinusR = Math.pow((1-probOfSuccess), trialWithSuccess-numberOfSuccesses);

        //Return the calculation
        return comb*pR*qYMinusR;
    }

    /**
     * The expectedValue method calculates the expected value (mean) of a negative binomial distribution.
     * @param numberOfSuccesses The total number of successes
     * @param probOfSuccess The probability of a successful trial
     * @return The expected value (mean) of the negative binomial distribution.
     */
    public double expectedValue(int numberOfSuccesses, double probOfSuccess){
        return numberOfSuccesses/probOfSuccess;
    }

    /**
     * The variance method calculates the variance of a negative binomial distribution.
     * @param numberOfSuccesses The total number of successes
     * @param probOfSuccess The probability of a successful trial
     * @return The variance of the negative binomial distribution
     */
    public double variance(int numberOfSuccesses, double probOfSuccess){
        return numberOfSuccesses*(1-probOfSuccess)/Math.pow(probOfSuccess, 2);
    }

    /**
     * The standardDeviation method calculates the standard deviation of the negative binomial distribution.
     * @param variance The variance of the distribution
     * @return The standard deviation of the negative binomial distribution.
     */
    public double standardDeviation(double variance){
        return Math.sqrt(variance);
    }

    /**
     * The testerOutput method displays an example output of the methods within the NegativeBinomialDistribution class.
     */
    public void testerOutput(){
        System.out.println("Negative Binomial Distribution for r=3, y = 5 and p = 0.2: " +
                negativeBinomialDistribution(5, 3, 0.2));
        System.out.println("Expected value of the distribution: " + expectedValue(3, 0.2));
        System.out.println("Variance of the distribution: " + variance(3, 0.2));
        System.out.println("Standard deviation of the distribution: " +
                standardDeviation(variance(3, 0.2)));
        System.out.println();
    }

}
