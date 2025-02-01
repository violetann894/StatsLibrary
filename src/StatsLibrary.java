import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * The StatsLibrary class is a collection of statistical calculations that I have learned in my Probability and
 * Applied Statistics class.
 *
 * @author Rachel Hussmann
 */

public class StatsLibrary {

    /**
     * getMeanDouble accepts an array of doubles and finds the mean of the values.
     *
     * @param values This method accepts an array of doubles that the user would like the mean calculated for.
     * @return This method returns a double value equal to the mean of the parameter.
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
     * getMeanInt accepts an array of integers and finds the mean of the values.
     *
     * @param values This method accepts an array of integers that the user would like the mean calculated for.
     * @return This method returns a double value equal to the mean of the parameter.
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
     * @param values This method accepts an ArrayList of doubles that the user would like the mean calculated for.
     * @return This method returns a double value equal to the mean of the parameter.
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
     * @param values This method accepts an ArrayList of integers that the user would like the mean calculated for.
     * @return This method returns a double value equal to the mean of the parameter.
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
     * getMedianDouble accepts an array of doubles and finds the median of the values.
     *
     * @param values This method accepts an array of doubles that the user would like the median found for.
     * @return This method returns a double value equal to the median of the parameter.
     */
    public double getMedianDouble(double[] values){

        //Sorts the array before calculations are done
        //According to the JavaDocs for Arrays.sort(), a dual pivot quicksort used to put the values in order.
        Arrays.sort(values);

        //Checks to see if the length of the dataset is odd or even
        if(values.length % 2 == 1){

            //If dataset is odd

            //Find the index of the middle value, which is just the ceiling value of the dataset divided by 2
            int index = (int)Math.ceil(values.length / 2);

            //Grab the value of the median
            double median = values[index];

            //Method returns the median
            return median;
        }else {

            //If dataset is even

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
     * getMedianInt accepts an array of integers and returns the median of the values.
     *
     * @param values This method accepts an array of integers that the user would like the median calculated for.
     * @return This method returns a double value equal to the median of the parameter.
     */
    public double getMedianInt(int[] values){

        //Sorts the array before calculations are done
        //According to the JavaDocs for Arrays.sort(), a dual pivot quicksort is used to put the values in order.
        Arrays.sort(values);

        //Checks to see if the length of the dataset is odd or even
        if(values.length % 2 == 1){

            //If dataset is odd

            //Find the index of the middle value, which is just the ceiling value of the dataset divided by 2
            int index = (int)Math.ceil(values.length / 2);

            //Grab the value of the median
            double median = values[index];

            //Method returns the median
            return median;
        }else{

            //If dataset is even

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
     * getMedianDouble accepts an ArrayList of doubles and returns the median of the values.
     *
     * @param values This method accepts an ArrayList of doubles that the user would like the median calculated for.
     * @return This method returns a double value equal to the median of the parameter.
     */
    public double getMedianDouble(ArrayList<Double> values){

        //Sorts the ArrayList before performing calculations
        /* According to the JavaDocs for list.sort(), the interface Collections is built on,
           a merge sort is used to put the values in order. */
        Collections.sort(values);

        //Checks to see if the length of the dataset is odd or even
        if(values.size() % 2 == 1){

            //If dataset is odd

            //Find the index of the middle value, which is just the ceiling value of the dataset divided by 2
            int index = (int)Math.ceil(values.size() / 2);

            //Grab the value of the median
            double median = values.get(index);

            //Method returns the median
            return median;
        }else{

            //If dataset is even

            //Find the index that will be used to find the first and second values
            int index = values.size() / 2;

            //Find the first value
            double firstValue = values.get(index);

            //Find the second value
            double secondValue = values.get(index + 1);

            //Find the average of the two values to find the median
            double median = (firstValue + secondValue) / 2.0;

            //Method returns the median
            return median;
        }

    }

    /**
     * getMedianInt accepts an ArrayList of integers and returns the median of the values.
     *
     * @param values This method accepts an ArrayList of integers that the user would like the median calculated for.
     * @return This method returns a double value equal to the median of the parameter.
     */
    public double getMedianInt(ArrayList<Integer> values){

        //Sorts the ArrayList before performing calculations
        /* According to the JavaDocs for list.sort(), the interface Collections is built on,
           a merge sort is used to put the values in order. */
        Collections.sort(values);

        //Checks to see if the length of the dataset is odd or even
        if(values.size() % 2 == 1){

            //If dataset is odd

            //Find the index of the middle value, which is just the ceiling value of the dataset divided by 2
            int index = (int)Math.ceil(values.size() / 2);

            //Grab the value of the median
            double median = values.get(index);

            //Method returns the median
            return median;
        }else{

            //If dataset is even

            //Find the index that will be used to find the first and second values
            int index = values.size() / 2;

            //Find the first value
            double firstValue = values.get(index);

            //Find the second value
            double secondValue = values.get(index + 1);

            //Find the average of the two values to find the median
            double median = (firstValue + secondValue) / 2.0;

            //Method returns the median
            return median;
        }
    }

    /**
     * getModeDouble accepts an array of doubles and finds the mode(s).
     *
     * @param values This method accepts an array of doubles that the user would like the mode(s) found for.
     * @return This method returns an ArrayList of doubles that contains the mode(s) of the data.
     */
    public ArrayList<Double> getModeDouble(double[] values){

        //Sorts the array before calculations are done
        //According to the JavaDocs for Arrays.sort(), a dual pivot quicksort is used to put the values in order.
        Arrays.sort(values);

        //Initializes the ArrayList that will hold the mode(s) of the dataset
        ArrayList<Double> modes = new ArrayList<>();

        //Initializes the variable that will be used to hold the number previous to the current one
        double previousNum = 0.0;

        //Initializes the variable that will be used to count the highest number of occurrences seen so far
        int highestNumOfOccur = 1;

        //Initializes the variable that will be used to count the current number of occurrences of the same number
        int currentNumOccur = 0;

        //Iterate through the values array
        for(double value : values) {

            //if the current value is larger than the previous one
            if (value > previousNum) {

                //Check the previous number's number of occurrences
                //If the previous number's number of occurrences is equal to the highest number of occurrences
                if (currentNumOccur == highestNumOfOccur) {

                    //Add the previous number to the list of modes for the dataset
                    modes.add(previousNum);

                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                } else if (currentNumOccur > highestNumOfOccur) {

                    /* else if the current number of occurrences of the previous number is higher than the highest
                    number of occurrences */

                    //Clear the list of modes. Those values are not the most frequent anymore
                    modes.clear();

                    //Add the previous number to the list of modes
                    modes.add(previousNum);

                    //Set the highest number of occurrences equal to the previous number's number of occurrences
                    highestNumOfOccur = currentNumOccur;

                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                } else {
                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                }
            }
            /* If the value is not greater than the previous number,
            we can assume it is the same since this dataset is already sorted. */

            //Increase the number of occurrences of the current number
            currentNumOccur++;

            //Set the previous number to the value we just used since we are moving on to another value
            previousNum = value;
        }

        //Repeat of code above to check the last value in the array
        //If the previous number's number of occurrences is equal to the highest number of occurrences
        if (currentNumOccur == highestNumOfOccur) {

            //Add the previous number to the list of modes for the dataset
            modes.add(previousNum);
        } else if (currentNumOccur > highestNumOfOccur) {

            /* else if the current number of occurrences of the previous number is higher than the highest
                    number of occurrences */

            //Clear the list of modes. Those values are not the most frequent anymore
            modes.clear();

            //Add the previous number to the list of modes
            modes.add(previousNum);
        }

        //Method returns the list of modes
        return modes;
    }

    /**
     * getModeInt accepts and array of integers and finds the mode(s).
     *
     * @param values This method accepts an array of integers that the user would like the mode(s) found for.
     * @return This method returns an ArrayList of doubles that contains the mode(s) of the data.
     */
    public ArrayList<Integer> getModeInt(int[] values) {

        //Sorts the array before calculations are done
        //According to the JavaDocs for Arrays.sort(), a dual pivot quicksort is used to put the values in order.
        Arrays.sort(values);

        //Initializes the ArrayList that will hold the mode(s) of the dataset
        ArrayList<Integer> modes = new ArrayList<>();

        //Initializes the variable that will be used to hold the number previous to the current one
        int previousNum = 0;

        //Initializes the variable that will be used to count the highest number of occurrences seen so far
        int highestNumOfOccur = 1;

        //Initializes the variable that will be used to count the current number of occurrences of the same number
        int currentNumOccur = 0;

        //Iterate through the values array
        for(int value : values) {

            //if the current value is larger than the previous one
            if (value > previousNum) {

                //Check the previous number's number of occurrences
                //If the previous number's number of occurrences is equal to the highest number of occurrences
                if (currentNumOccur == highestNumOfOccur) {

                    //Add the previous number to the list of modes for the dataset
                    modes.add(previousNum);

                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                } else if (currentNumOccur > highestNumOfOccur) {

                    /* else if the current number of occurrences of the previous number is higher than the highest
                    number of occurrences */

                    //Clear the list of modes. Those values are not the most frequent anymore
                    modes.clear();

                    //Add the previous number to the list of modes
                    modes.add(previousNum);

                    //Set the highest number of occurrences equal to the previous number's number of occurrences
                    highestNumOfOccur = currentNumOccur;

                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                } else {
                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                }
            }
            /* If the value is not greater than the previous number,
            we can assume it is the same since this dataset is already sorted. */

            //Increase the number of occurrences of the current number
            currentNumOccur++;

            //Set the previous number to the value we just used since we are moving on to another value
            previousNum = value;
        }

        //Repeat of code above to check the last value in the array
        //If the previous number's number of occurrences is equal to the highest number of occurrences
        if (currentNumOccur == highestNumOfOccur) {

            //Add the previous number to the list of modes for the dataset
            modes.add(previousNum);
        } else if (currentNumOccur > highestNumOfOccur) {

            /* else if the current number of occurrences of the previous number is higher than the highest
                    number of occurrences */

            //Clear the list of modes. Those values are not the most frequent anymore
            modes.clear();

            //Add the previous number to the list of modes
            modes.add(previousNum);
        }

        //Method returns the list of modes
        return modes;
    }

    /**
     * getModeDouble accepts an ArrayList of doubles and finds the mode(s).
     *
     * @param values This method accepts an ArrayList of doubles that the user would like the mode(s) found for.
     * @return This method returns an ArrayList of doubles that contains the mode(s) of the data.
     */
    public ArrayList<Double> getModeDouble(ArrayList<Double> values){

        //Sorts the ArrayList before performing calculations
        /* According to the JavaDocs for list.sort(), the interface Collections is built on,
           a merge sort is used to put the values in order. */
        Collections.sort(values);

        //Initializes the ArrayList that will hold the mode(s) of the dataset
        ArrayList<Double> modes = new ArrayList<>();

        //Initializes the variable that will be used to hold the number previous to the current one
        double previousNum = 0.0;

        //Initializes the variable that will be used to count the highest number of occurrences seen so far
        int highestNumOfOccur = 1;

        //Initializes the variable that will be used to count the current number of occurrences of the same number
        int currentNumOccur = 0;

        //Iterate through the values ArrayList
        for(double value : values) {

            //if the current value is larger than the previous one
            if (value > previousNum) {

                //Check the previous number's number of occurrences
                //If the previous number's number of occurrences is equal to the highest number of occurrences
                if (currentNumOccur == highestNumOfOccur) {

                    //Add the previous number to the list of modes for the dataset
                    modes.add(previousNum);

                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                } else if (currentNumOccur > highestNumOfOccur) {

                    /* else if the current number of occurrences of the previous number is higher than the highest
                    number of occurrences */

                    //Clear the list of modes. Those values are not the most frequent anymore
                    modes.clear();

                    //Add the previous number to the list of modes
                    modes.add(previousNum);

                    //Set the highest number of occurrences equal to the previous number's number of occurrences
                    highestNumOfOccur = currentNumOccur;

                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                } else {
                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                }
            }
            /* If the value is not greater than the previous number,
            we can assume it is the same since this dataset is already sorted. */

            //Increase the number of occurrences of the current number
            currentNumOccur++;

            //Set the previous number to the value we just used since we are moving on to another value
            previousNum = value;
        }

        //Repeat of code above to check the last value in the array
        //If the previous number's number of occurrences is equal to the highest number of occurrences
        if (currentNumOccur == highestNumOfOccur) {

            //Add the previous number to the list of modes for the dataset
            modes.add(previousNum);
        } else if (currentNumOccur > highestNumOfOccur) {

            /* else if the current number of occurrences of the previous number is higher than the highest
                    number of occurrences */

            //Clear the list of modes. Those values are not the most frequent anymore
            modes.clear();

            //Add the previous number to the list of modes
            modes.add(previousNum);
        }

        //Method returns the list of modes
        return modes;
    }

    /**
     * getModeInt accepts an ArrayList of integers and finds the mode(s).
     *
     * @param values This method accepts an ArrayList of integers that the user would like the mode(s) found for.
     * @return This method returns an ArrayList of doubles that contains the mode(s) of the data.
     */
    public ArrayList<Integer> getModeInt(ArrayList<Integer> values){

        //Sorts the ArrayList before performing calculations
        /* According to the JavaDocs for list.sort(), the interface Collections is built on,
           a merge sort is used to put the values in order. */
        Collections.sort(values);

        //Initializes the ArrayList that will hold the mode(s) of the dataset
        ArrayList<Integer> modes = new ArrayList<>();

        //Initializes the variable that will be used to hold the number previous to the current one
        int previousNum = 0;

        //Initializes the variable that will be used to count the highest number of occurrences seen so far
        int highestNumOfOccur = 1;

        //Initializes the variable that will be used to count the current number of occurrences of the same number
        int currentNumOccur = 0;

        //Iterate through the values ArrayList
        for(int value : values) {

            //if the current value is larger than the previous one
            if (value > previousNum) {

                //Check the previous number's number of occurrences
                //If the previous number's number of occurrences is equal to the highest number of occurrences
                if (currentNumOccur == highestNumOfOccur) {

                    //Add the previous number to the list of modes for the dataset
                    modes.add(previousNum);

                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                } else if (currentNumOccur > highestNumOfOccur) {

                    /* else if the current number of occurrences of the previous number is higher than the highest
                    number of occurrences */

                    //Clear the list of modes. Those values are not the most frequent anymore
                    modes.clear();

                    //Add the previous number to the list of modes
                    modes.add(previousNum);

                    //Set the highest number of occurrences equal to the previous number's number of occurrences
                    highestNumOfOccur = currentNumOccur;

                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                } else {
                    //Reset the current number of occurrences since we are moving on to a new number
                    currentNumOccur = 0;
                }
            }
            /* If the value is not greater than the previous number,
            we can assume it is the same since this dataset is already sorted. */

            //Increase the number of occurrences of the current number
            currentNumOccur++;

            //Set the previous number to the value we just used since we are moving on to another value
            previousNum = value;
        }

        //Repeat of code above to check the last value in the array
        //If the previous number's number of occurrences is equal to the highest number of occurrences
        if (currentNumOccur == highestNumOfOccur) {

            //Add the previous number to the list of modes for the dataset
            modes.add(previousNum);
        } else if (currentNumOccur > highestNumOfOccur) {

            /* else if the current number of occurrences of the previous number is higher than the highest
                    number of occurrences */

            //Clear the list of modes. Those values are not the most frequent anymore
            modes.clear();

            //Add the previous number to the list of modes
            modes.add(previousNum);
        }

        //Method returns the list of modes
        return modes;
    }

    /**
     * getStandardDeviationDouble accepts an array of doubles and returns the standard deviation of the data.
     *
     * @param values This method accepts an array of doubles that the user would like the standard deviation found for.
     * @return This method returns a double value equal to standard deviation of the data set.
     */
    public double getStandardDeviationDouble(double[] values){

        //Initializes the variable and calls the getMeanDouble() method to find the mean of the dataset
        double mean = getMeanDouble(values);

        //Initializes the variable that will hold the sum of squared values
        double sumOfSquares = 0.0;

        //Iterates through the array
        for (double value : values){

            //Subtract the mean from the value
            value -= mean;

            //Find the square of the value
            value = value*value;

            //Add the value to the sumOfSquares variable
            sumOfSquares += value;
        }

        /* Finds the variance of the dataset by taking the sum of the squares
           and dividing it by one less than the total number of values */
        double variance = sumOfSquares / (values.length - 1);

        //Returns the square root of the variance, which is the standard deviation of the dataset
        return Math.sqrt(variance);
    }

    /**
     * getStandardDeviationInt accepts an array of integers and returns the standard deviation of the data.
     *
     * @param values This method accept an array of integers that the user would like the standard deviation found for.
     * @return This method returns a double value equal to the standard deviation of the data set.
     */
    public double getStandardDeviationInt(int[] values){

        //Initializes the variable and calls the getMeanInt() method to find the mean of the dataset
        double mean = getMeanInt(values);

        //Initializes the variable that will hold the sum of squared values
        double sumOfSquares = 0.0;

        //Iterates through the array
        for (int value : values){

            //Subtract the mean from the value
            value -= mean;

            //Find the square of the value
            value = value*value;

            //Add the value to the sumOfSquares variable
            sumOfSquares += value;
        }

        /* Finds the variance of the dataset by taking the sum of the squares
           and dividing it by one less than the total number of values */
        double variance = sumOfSquares / (values.length - 1);

        //Returns the square root of the variance, which is the standard deviation of the dataset
        return Math.sqrt(variance);
    }

    /**
     * getStandardDeviationDouble accepts an ArrayList of doubles and returns the standard deviation of the data.
     *
     * @param values This method accept an ArrayList of doubles that the user would like the standard deviation
     *               found for.
     * @return This method returns a double value equal to the standard deviation of the data set.
     */
    public double getStandardDeviationDouble(ArrayList<Double> values){

        //Initializes the variable and calls the getMeanDouble() method to find the mean of the dataset
        double mean = getMeanDouble(values);

        //Initializes the variable that will hold the sum of squared values
        double sumOfSquares = 0.0;

        //Iterates through the ArrayList
        for (double value : values){

            //Subtract the mean from the value
            value -= mean;

            //Find the square of the value
            value = value*value;

            //Add the value to the sumOfSquares variable
            sumOfSquares += value;
        }

        /* Finds the variance of the dataset by taking the sum of the squares
           and dividing it by one less than the total number of values */
        double variance = sumOfSquares / (values.size() - 1);

        //Returns the square root of the variance, which is the standard deviation of the dataset
        return Math.sqrt(variance);
    }

    /**
     * getStandardDeviationDouble accepts an ArrayList of integers and returns the standard deviation of the data.
     *
     * @param values This method accept an ArrayList of integers that the user would like the standard deviation
     *               found for.
     * @return This method returns a double value equal to the standard deviation of the data set.
     */
    public double getStandardDeviationInt(ArrayList<Integer> values){

        //Initializes the variable and calls the getMeanInt() method to find the mean of the dataset
        double mean = getMeanInt(values);

        //Initializes the variable that will hold the sum of squared values
        double sumOfSquares = 0.0;

        //Iterates through the ArrayList
        for (int value : values){

            //Subtract the mean from the value
            value -= mean;

            //Find the square of the value
            value = value*value;

            //Add the value to the sumOfSquares variable
            sumOfSquares += value;
        }

        /* Finds the variance of the dataset by taking the sum of the squares
           and dividing it by one less than the total number of values */
        double variance = sumOfSquares / (values.size() - 1);

        //Returns the square root of the variance, which is the standard deviation of the dataset
        return Math.sqrt(variance);
    }

}
