import java.util.ArrayList;

/**
 * The RandomVariableCalculations class contains methods that calculate core statistical measurements for random
 * variables such as expected value, variance and standard deviation.
 * @author Rachel Hussmann
 */
public class RandomVariableCalculations {

    /**
     * The expectedValue method calculates the expected value (mean) of a random variable Y.
     * @param valuesOfY The values of the random variable Y
     * @param probsOfY The probabilities associated with each value of Y
     * @return The expected value of Y
     */
    public double expectedValue(ArrayList<Integer> valuesOfY, ArrayList<Double> probsOfY){

        //Initialize the mean variable
        double mean = 0.0;

        //For the length of the valuesOfY list, multiply the current value of y with the current probability of y and
        //add it to the mean
        for(int i = 0; i < valuesOfY.size(); i++){
            mean += valuesOfY.get(i)*probsOfY.get(i);
        }

        //Return the mean
        return mean;
    }

    /**
     * The expectedValueOfGOfY calculates the expected value (mean) of a transformed random variable Y.
     * @param gOfY The values of the random variable Y after transformation
     * @param probsOfY The probabilities associated with each value of Y
     * @return The expected value of g of Y
     */
    public double expectedValueOfGOfY(ArrayList<Integer> gOfY, ArrayList<Double> probsOfY){

        //Initialize the mean variable
        double mean = 0.0;

        //For the length of the valuesOfY list, multiply the current value of gOfY with the current probability of y and
        //add it to the mean
        for(int i = 0; i < gOfY.size(); i++){
            mean += gOfY.get(i)*probsOfY.get(i);
        }

        //Return the mean
        return mean;

    }

    /**
     * The variance method calculates the variance of the random variable Y.
     * @param valuesOfY The values of the random variable Y
     * @param probsOfY The probabilities associated with each value of Y
     * @return The variance of the random variable Y
     */
    public double variance(ArrayList<Integer> valuesOfY, ArrayList<Double> probsOfY){

        //Calculate the expected value
        double expectedValue = expectedValue(valuesOfY, probsOfY);

        //Initialize the variable that will hold the expected value of ysquared
        double ysquared = 0.0;

        //Add up all the values of y squared times the probability of Y
        for(int i = 0; i < valuesOfY.size(); i++){
            ysquared += Math.pow(valuesOfY.get(i), 2)*probsOfY.get(i);
        }

        //Return the variance of the random variable Y
        return ysquared - (expectedValue*expectedValue);
    }

    /**
     * The standardDeviation method calculates the standard deviation of the random variable Y.
     * @param variance The variance of random variable Y
     * @return The standard deviation of the random variable Y
     */
    public double standardDeviation(double variance){
        return Math.sqrt(variance);
    }

    /**
     * The testerOutput method is used to test the methods that have been developed in this class.
     */
    public void testerOutput(){

        //Set up the arraylists
        ArrayList<Integer> valuesOfY = new ArrayList<>();
        ArrayList<Double> probOfY = new ArrayList<>();

        //Add the values
        valuesOfY.add(1);
        valuesOfY.add(2);
        valuesOfY.add(3);
        valuesOfY.add(4);
        valuesOfY.add(5);

        //Add the values
        probOfY.add(0.3);
        probOfY.add(0.25);
        probOfY.add(0.1);
        probOfY.add(0.15);
        probOfY.add(0.2);


        //Print out the tests
        System.out.println("Values of Y: " + valuesOfY);
        System.out.println("Probabilities of Y: " + probOfY);

        System.out.println("Expected value of Y: " + expectedValue(valuesOfY, probOfY));
        System.out.println("Variance of Y: " + variance(valuesOfY, probOfY));
        System.out.println("Standard Deviation: " + standardDeviation(variance(valuesOfY, probOfY)));

        for(int i = 0; i < valuesOfY.size(); i++){
            valuesOfY.set(i, valuesOfY.get(i)*2);
        }

        System.out.println("Expected value of g(Y): " + expectedValueOfGOfY(valuesOfY, probOfY));

    }
}
