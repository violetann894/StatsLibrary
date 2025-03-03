/**
 * The BinomialDistribution class handles the calculation of Binomial Distributions and all other statistical
 * values associated with Binomial Distributions.
 * @author Rachel Hussmann
 */
public class BinomialDistribution {

    /**
     * The binomialDistribution method calculates the probability of an event based off of a binomial distribution
     * formula.
     * @param numberOfTrials The number of trials to be run.
     * @param probOfSuccess The probability of a successful trial.
     * @param totalNumSuccess The total number of successes.
     * @return The probability of the event.
     */
    public double binomialDistribution(int numberOfTrials, double probOfSuccess, int totalNumSuccess){

        //Calculate the probability of a failed trial
        double probOfFail = 1 - probOfSuccess;

        //Create a new combination object to gain access to the combination method
        Combination combination = new Combination();

        //Get the combination of numberOfTrials and totalNumSuccess
        int permutation = combination.getCombination(numberOfTrials, totalNumSuccess);

        //Find the probability of success raised to the total number of successes
        double py = Math.pow(probOfSuccess, totalNumSuccess);

        //Find the number of trials minus the total number of successes
        int nMinusY = numberOfTrials - totalNumSuccess;

        //Find the probability of failure raised to the number of trials minus the total number of successes
        double qNMinusY = Math.pow(probOfFail, nMinusY);

        //Return the calculation
        return permutation*py*qNMinusY;

    }

    /**
     * The expectedValue method calculates the mean of a binomial distribution.
     * @param numberOfTrials The total number of trials.
     * @param probOfSuccess The probability of a successful trial.
     * @return The expected value (mean) of the binomial distribution.
     */
    public double expectedValue(int numberOfTrials, double probOfSuccess){
        return numberOfTrials*probOfSuccess;
    }

    /**
     * The variance method calculates the variance of a binomial distribution.
     * @param numberOfTrials The total number of trials.
     * @param probOfSuccess The probability of success for a trial.
     * @return The variance of the binomial distribution.
     */
    public double variance(int numberOfTrials, double probOfSuccess){

        //Calculate the probability of failure
        double probOfFailure = 1 - probOfSuccess;

        //Return the number of trials times the probability of success times the probability of failure
        return numberOfTrials*probOfSuccess*probOfFailure;
    }

    /**
     * The standardDeviation method calculates the standard deviation of the binomial distribution.
     * @param variance The variance of the binomial distribution.
     * @return The standard deviation of the binomial distribution.
     */
    public double standardDeviation(double variance){
        return Math.sqrt(variance);
    }

    /**
     * The testerOutput method shows an example output of the methods within the BinomialDistribution class.
     */
    public void testerOutput(){

        System.out.println("Binomial Distribution for n = 3, p = 0.8 and x = 2: " +
                binomialDistribution(3, 0.8, 2));
        System.out.println("Expected value of the distribution: " +
                expectedValue(3, 0.8));
        System.out.println("Variance of the distribution: " + variance(3, 0.8));
        System.out.println("Standard deviation of the distribution: "
                + standardDeviation(variance(3, 0.8)));
        System.out.println();

    }
}
