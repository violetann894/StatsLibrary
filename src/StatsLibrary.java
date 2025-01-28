import java.util.ArrayList;

/**
 * The StatsLibrary class is a collection of statistical calculations that I have learned in my Probability and
 * Applied Statistics class.
 *
 * @author Rachel Hussmann
 */

public class StatsLibrary {

    /**
     * getMeanDouble accepts a double array and finds the mean of the values.
     *
     * @param values This method accepts a double array that contains the values that the user would like
     *               the mean calculated for.
     * @return This method returns a double value of the mean of the parameter values.
     */
    public double getMeanDouble(double[] values){

        //Initializes the sum variable
        double sum = 0.0;

        //Loops through the dataset and adds up all the values
        for(double value: values){
            sum += value;
        }

        //Divides the sum by the length of the dataset to find the mean
        double mean = (sum / values.length);

        //Method returns the mean value of the dataset
        return mean;
    }

    /**
     * getMeanInt accepts an int array and finds the mean of the values.
     *
     * @param values This method accepts an int array that contains the values that the user would like the
     *               mean calculated for.
     * @return This method returns a double value of the mean of the parameter values.
     */
    public double getMeanInt(int[] values){

        //Initializes the sum variable
        int sum = 0;

        //Loops through the dataset and adds up all the values
        for(int value: values){
            sum += value;
        }

        //Divides the sum by the length of the dataset to find the mean
        double mean = (double)(sum / values.length);

        //Method returns the mean value of the dataset
        return mean;
    }

    /**
     * getMeanDouble accepts an ArrayList of doubles and finds the mean of the values.
     *
     * @param values This method accepts an ArrayList of doubles that contains the values that the user would like
     *               the mean calculated for.
     * @return This method returns a double value of the mean of the parameter values.
     */
    public double getMeanDouble(ArrayList<Double> values){

        //Initializes the sum variable
        double sum = 0.0;

        //Loops through the dataset and adds up all the values
        for (double value: values){
            sum += value;
        }

        //Divides the sum by the size of the dataset to find the mean
        double mean = sum / values.size();

        //Method returns the mean value of the dataset
        return mean;
    }

    /**
     * getMeanInt accepts an ArrayList of integers and finds the mean of the values.
     *
     * @param values This method accepts an ArrayList of integers that contains the values that the user would like the
     *               mean calculated for.
     * @return This method returns a double value of the mean of the parameter values.
     */
    public double getMeanInt(ArrayList<Integer> values){

        //Initializes the sum variable
        int sum = 0;

        //Loops through the dataset and adds up all the values
        for(int value: values){
            sum += value;
        }

        //Divides the sum by the size of the dataset to find the mean
        double mean = (double)(sum / values.size());

        //Method returns the mean value of the dataset
        return mean;
    }

    /**
     * getMedianDouble accepts a double array that contain the values that the user would like the median found for.
     *
     * @param values This method accepts an array of doubles that contain the values that the user would like the
     *               median found for. This method expects that passed array is already sorted before being passed as
     *               a parameter.
     * @return This method returns a double value of the median of the parameter values.
     */
    public double getMedianDouble(double[] values){

        //Checks to see if the length of the dataset is odd or even
        if(values.length % 2 == 1){

            // if dataset is odd

            //Find the index of the middle value, which is just the ceiling value of the dataset divided by 2
            int index = (int)Math.ceil(values.length / 2);

            //Grab the value of the median
            double median = values[index];

            //Method returns the median
            return median;
        }else {

            // if dataset is even

            //Find the index that will be used to find the first and second values
            int index = values.length / 2;

            //Find the first value
            double firstValue = values[index];

            //Find the second value
            double secondValue = values[index + 1];

            //Find the average of the two values to find the median
            double median = (firstValue + secondValue) / 2.0;

            //Method returns the median
            return median;
        }
    }

    /**
     * getMedianInt accepts an int array that contain the values that the user would like the median found for.
     *
     * @param values This method accepts an array of integers that contain the values that the user would like the
     *               median found for. This method expects that passed array is already sorted before being passed as
     *               a parameter.
     * @return This method returns a double value of the median of the parameter values.
     */
    public double getMedianInt(int[] values){

        //Checks to see if the length of the dataset is odd or even
        if(values.length % 2 == 1){

            //if dataset is odd

            int index = (int)Math.ceil(values.length / 2);

            double median = values[index];

            return median;
        }else{
            int index = values.length / 2;

            double firstValue = values[index];
            double secondValue = values[index + 1];

            double median = (firstValue + secondValue) / 2.0;

            return median;
        }
    }

    /**
     * getMedianDouble accepts an ArrayList of doubles that contain the values that the user would like the median
     * found for.
     *
     * @param values This method accepts an ArrayList of doubles that contain the values that the user would like the
     *               median found for. This method expects that passed array is already sorted before being passed as
     *               a parameter.
     * @return This method returns a double value of the median of the parameter values.
     */
    public double getMedianDouble(ArrayList<Double> values){

        if(values.size() % 2 == 1){

            int index = (int)Math.ceil(values.size() / 2);

            double median = values.get(index);

            return median;
        }else {
            int index = values.size() / 2;

            double firstValue = values.get(index);
            double secondValue = values.get(index + 1);

            double median = (firstValue + secondValue) / 2.0;

            return median;
        }

    }

    /**
     * getMedianInt accepts an ArrayList of integers that contains the values that the user would like the median
     * found for.
     *
     * @param values This method accepts an ArrayList of integers that contain the values that the user would like the
     *               median found for. This method expects that the passed array is already sorted before being passed
     *               as a parameter.
     * @return This method returns a double value of the median of the parameter values.
     */
    public double getMedianInt(ArrayList<Integer> values){
        if(values.size() % 2 == 1){

            int index = (int)Math.ceil(values.size() / 2);

            double median = values.get(index);

            return median;
        }else {
            int index = values.size() / 2;

            double firstValue = values.get(index);
            double secondValue = values.get(index + 1);

            double median = (firstValue + secondValue) / 2.0;

            return median;
        }
    }

    /**
     * getModeDouble accepts an array of doubles and finds the mode(s).
     *
     * @param values This method accepts an array of doubles that contain the values that the user would like the mode
     *               found for.
     * @return This method returns an ArrayList of doubles that contains the mode(s) of the data.
     */
    public ArrayList<Double> getModeDouble(double[] values){
        ArrayList<Double> modes = new ArrayList<>();
        double previousNum = 0.0;
        int highestNumOfOccur = 1;
        int currentNumOccur = 0;

        for(double value : values) {
            if (value > previousNum) {
                if (currentNumOccur == highestNumOfOccur) {
                    modes.add(previousNum);
                    currentNumOccur = 0;
                } else if (currentNumOccur > highestNumOfOccur) {
                    modes.clear();
                    modes.add(previousNum);
                    highestNumOfOccur = currentNumOccur;
                    currentNumOccur = 0;
                } else {
                    currentNumOccur = 0;
                }
            }
            currentNumOccur++;
            previousNum = value;
        }

        if (currentNumOccur == highestNumOfOccur) {
            modes.add(previousNum);
            currentNumOccur = 0;
        } else if (currentNumOccur > highestNumOfOccur) {
            modes.clear();
            modes.add(previousNum);
            highestNumOfOccur = currentNumOccur;
        }

        return modes;
    }

    /**
     * getModeInt accepts and array of integers and finds the mode(s).
     *
     * @param values This method accepts an array of integers that contain the values that the user would like the
     *               mode found for.
     * @return This method returns an ArrayList of doubles that contains the mode(s) of the data.
     */
    public ArrayList<Integer> getModeInt(int[] values) {
        ArrayList<Integer> modes = new ArrayList<>();
        int previousNum = 0;
        int highestNumOfOccur = 1;
        int currentNumOccur = 0;

        for(int value : values) {
            if (value > previousNum) {
                if (currentNumOccur == highestNumOfOccur) {
                    modes.add(previousNum);
                    currentNumOccur = 0;
                } else if (currentNumOccur > highestNumOfOccur) {
                    modes.clear();
                    modes.add(previousNum);
                    highestNumOfOccur = currentNumOccur;
                    currentNumOccur = 0;
                } else {
                    currentNumOccur = 0;
                }
            }
            currentNumOccur++;
            previousNum = value;
        }

        if (currentNumOccur == highestNumOfOccur) {
            modes.add(previousNum);
            currentNumOccur = 0;
        } else if (currentNumOccur > highestNumOfOccur) {
            modes.clear();
            modes.add(previousNum);
            highestNumOfOccur = currentNumOccur;
        }

        return modes;
    }

    /**
     * getModeDouble accepts an ArrayList of doubles and finds the mode(s).
     *
     * @param values This method accepts an ArrayList of doubles that contains the values that the user would like the
     *               mode found for.
     * @return This method returns an ArrayList of doubles that contains the mode(s) of the data.
     */
    public ArrayList<Double> getModeDouble(ArrayList<Double> values){
        ArrayList<Double> modes = new ArrayList<>();
        double previousNum = 0.0;
        int highestNumOfOccur = 1;
        int currentNumOccur = 0;

        for(double value : values) {
            if (value > previousNum) {
                if (currentNumOccur == highestNumOfOccur) {
                    modes.add(previousNum);
                    currentNumOccur = 0;
                } else if (currentNumOccur > highestNumOfOccur) {
                    modes.clear();
                    modes.add(previousNum);
                    highestNumOfOccur = currentNumOccur;
                    currentNumOccur = 0;
                } else {
                    currentNumOccur = 0;
                }
            }
            currentNumOccur++;
            previousNum = value;
        }

        if (currentNumOccur == highestNumOfOccur) {
            modes.add(previousNum);
            currentNumOccur = 0;
        } else if (currentNumOccur > highestNumOfOccur) {
            modes.clear();
            modes.add(previousNum);
            highestNumOfOccur = currentNumOccur;
        }

        return modes;
    }

    /**
     * getModeInt accepts an ArrayList of integers and finds the mode(s).
     *
     * @param values This method accepts an ArrayList of integers that contains the values that the user would
     *               like the mode found for.
     * @return This method returns an ArrayList of doubles that contains the mode(s) of the data.
     */
    public ArrayList<Integer> getModeInt(ArrayList<Integer> values){
        ArrayList<Integer> modes = new ArrayList<>();
        int previousNum = 0;
        int highestNumOfOccur = 1;
        int currentNumOccur = 0;

        for(int value : values) {
            if (value > previousNum) {
                if (currentNumOccur == highestNumOfOccur) {
                    modes.add(previousNum);
                    currentNumOccur = 0;
                } else if (currentNumOccur > highestNumOfOccur) {
                    modes.clear();
                    modes.add(previousNum);
                    highestNumOfOccur = currentNumOccur;
                    currentNumOccur = 0;
                } else {
                    currentNumOccur = 0;
                }
            }
            currentNumOccur++;
            previousNum = value;
        }

        if (currentNumOccur == highestNumOfOccur) {
            modes.add(previousNum);
            currentNumOccur = 0;
        } else if (currentNumOccur > highestNumOfOccur) {
            modes.clear();
            modes.add(previousNum);
            highestNumOfOccur = currentNumOccur;
        }

        return modes;
    }

    /**
     * getStandardDeviationDouble accepts an array of doubles and returns the standard deviation of the data.
     *
     * @param values This method accept an array of doubles that the user would like the standard deviation found for.
     * @return This method returns a double value of the standard deviation of the data set.
     */
    public double getStandardDeviationDouble(double[] values){

        double mean = getMeanDouble(values);

        double sumOfSquares = 0.0;

        for (double value : values){
            value -= mean;
            value = value*value;
            sumOfSquares += value;
        }

        double variance = sumOfSquares / (values.length - 1);

        return Math.sqrt(variance);
    }

    /**
     * getStandardDeviationInt accepts an array of integers and returns the standard deviation of the data.
     *
     * @param values This method accept an array of integers that the user would like the standard deviation found for.
     * @return This method returns a double value of the standard deviation of the data set.
     */
    public double getStandardDeviationInt(int[] values){
        double mean = getMeanInt(values);

        double sumOfSquares = 0.0;

        for (int value : values){
            value -= mean;
            value = value*value;
            sumOfSquares += value;
        }

        double variance = sumOfSquares / (values.length - 1);

        return Math.sqrt(variance);
    }

    /**
     * getStandardDeviationDouble accepts an ArrayList of doubles and returns the standard deviation of the data.
     *
     * @param values This method accept an ArrayList of doubles that the user would like the standard deviation
     *               found for.
     * @return This method returns a double value of the standard deviation of the data set.
     */
    public double getStandardDeviationDouble(ArrayList<Double> values){

        double mean = getMeanDouble(values);

        double sumOfSquares = 0.0;

        for (double value : values){
            value -= mean;
            value = value*value;
            sumOfSquares += value;
        }

        double variance = sumOfSquares / (values.size() - 1);

        return Math.sqrt(variance);
    }

    /**
     * getStandardDeviationDouble accepts an ArrayList of integers and returns the standard deviation of the data.
     *
     * @param values This method accept an ArrayList of integers that the user would like the standard deviation
     *               found for.
     * @return This method returns a double value of the standard deviation of the data set.
     */
    public double getStandardDeviationInt(ArrayList<Integer> values){
        double mean = getMeanInt(values);

        double sumOfSquares = 0.0;

        for (double value : values){
            value -= mean;
            value = value*value;
            sumOfSquares += value;
        }

        double variance = sumOfSquares / (values.size() - 1);

        return Math.sqrt(variance);
    }

}
