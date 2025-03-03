import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * The StatsLibrary class is a collection of statistical calculations that I have learned in my Probability and
 * Applied Statistics class.
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
        //Method returns the mean value of the dataset
        return (sum / values.length);
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
        //Method returns the mean value of the dataset
        return (double)(sum / values.length);
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
        //Method returns the mean value of the dataset
        return sum / values.size();
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
        //Method returns the mean value of the dataset
        return (double)(sum / values.size());
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

            //Method returns the median
            return values[index];
        }else {

            //If dataset is even

            //Find the index that will be used to find the first and second values
            int index = values.length / 2;

            //Find the first value
            double firstValue = values[index];

            //Find the second value
            double secondValue = values[index + 1];

            //Find the average of the two values to find the median
            //Method returns the median
            return (firstValue + secondValue) / 2.0;
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
            //Method returns the median
            return values[index];
        }else{

            //If dataset is even

            //Find the index that will be used to find the first and second values
            int index = values.length / 2;

            //Find the first value
            double firstValue = values[index];

            //Find the second value
            double secondValue = values[index + 1];

            //Find the average of the two values to find the median
            //Method returns the median
            return (firstValue + secondValue) / 2.0;
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
            //Method returns the median
            return values.get(index);
        }else{

            //If dataset is even

            //Find the index that will be used to find the first and second values
            int index = values.size() / 2;

            //Find the first value
            double firstValue = values.get(index);

            //Find the second value
            double secondValue = values.get(index + 1);

            //Find the average of the two values to find the median
            //Method returns the median
            return (firstValue + secondValue) / 2.0;
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
            //Method returns the median
            return (double) values.get(index);
        }else{

            //If dataset is even

            //Find the index that will be used to find the first and second values
            int index = values.size() / 2;

            //Find the first value
            double firstValue = values.get(index);

            //Find the second value
            double secondValue = values.get(index + 1);

            //Find the average of the two values to find the median
            //Method returns the median
            return (firstValue + secondValue) / 2.0;
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
     * The getVarianceDouble method accepts an array of doubles and returns the variance.
     * @param values The array of double holding the dataset
     * @return The variance of the array
     */
    public double getVarianceDouble(double[] values){

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
        return sumOfSquares / (values.length - 1);
    }

    /**
     * The getVarianceInt method accepts an array of integers and returns the variance.
     * @param values The array of integers holding the dataset
     * @return The variance of the array
     */
    public double getVarianceInt(int[] values){
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
        return sumOfSquares / (values.length - 1);
    }

    /**
     * The getVarianceDouble method accepts an ArrayList of doubles and returns the variance.
     * @param values The ArrayList of doubles holding the dataset
     * @return The variance of the ArrayList
     */
    public double getVarianceDouble(ArrayList<Double> values){
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
        return sumOfSquares / (values.size() - 1);
    }

    /**
     * The getVarianceInt method accepts and ArrayList of integers and returns the variance.
     * @param values The ArrayList of integers holding the dataset
     * @return The variance of the ArrayList
     */
    public double getVarianceInt(ArrayList<Integer> values){
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
        return sumOfSquares / (values.size() - 1);
    }

    /**
     * The getStandardDeviation method accepts the variance of a dataset and returns the standard deviation of the
     * dataset.
     * @param variance The variance of the dataset
     * @return The standard deviation of the dataset
     */
    public double getStandardDeviation(double variance){
        return Math.sqrt(variance);
    }

    /**
     * The testerOutput method is used to test the methods that have been developed in this class.
     */
    public void testerOutput(){
        //Initializes the even and odd length double arrays and ArrayLists
        double[] doubleValuesOdd = {1.1, 2.5, 3.7, 6.9, 7.4};
        double[] doubleValuesEven = {1.1, 2.5, 3.7, 6.9};
        ArrayList<Double> doubleArrayListOdd = new ArrayList<>();
        ArrayList<Double> doubleArrayListEven = new ArrayList<>();

        //Initializes the even and odd length integer arrays and ArrayLists
        int[] intValuesOdd = {1, 2, 3, 4, 5};
        int[] intValuesEven = {1, 2, 3, 4};
        ArrayList<Integer> intArrayListOdd = new ArrayList<>();
        ArrayList<Integer> intArrayListEven = new ArrayList<>();

        //Initializes the double array and ArrayList for checking the mode methods
        double[] doubleValuesMode = {1.1, 1.1, 3.5, 3.5, 6.2, 7.9, 10.3};
        ArrayList<Double> doubleArrayListMode = new ArrayList<>();

        //Initializes the integer array and ArrayList for checking the mode methods
        int[] intValuesMode = {1, 1, 2, 3, 3, 6, 7, 8, 9, 9};
        ArrayList<Integer> intArrayListMode = new ArrayList<>();

        //Adds values to the doubleArrayListOdd
        doubleArrayListOdd.add(1.1);
        doubleArrayListOdd.add(2.5);
        doubleArrayListOdd.add(3.7);
        doubleArrayListOdd.add(6.9);
        doubleArrayListOdd.add(7.4);

        //Adds values to the doubleArrayListEven
        doubleArrayListEven.add(1.1);
        doubleArrayListEven.add(2.5);
        doubleArrayListEven.add(3.7);
        doubleArrayListEven.add(6.9);

        //Adds values to the intArrayListOdd
        intArrayListOdd.add(1);
        intArrayListOdd.add(2);
        intArrayListOdd.add(3);
        intArrayListOdd.add(4);
        intArrayListOdd.add(5);

        //Adds values to the intArrayListEven
        intArrayListEven.add(1);
        intArrayListEven.add(2);
        intArrayListEven.add(3);
        intArrayListEven.add(4);

        //Adds values to the doubleArrayListMode
        doubleArrayListMode.add(1.1);
        doubleArrayListMode.add(1.1);
        doubleArrayListMode.add(3.5);
        doubleArrayListMode.add(3.5);
        doubleArrayListMode.add(6.2);
        doubleArrayListMode.add(7.9);
        doubleArrayListMode.add(10.3);

        //Adds values to the intArrayListMode
        intArrayListMode.add(1);
        intArrayListMode.add(1);
        intArrayListMode.add(2);
        intArrayListMode.add(3);
        intArrayListMode.add(3);
        intArrayListMode.add(6);
        intArrayListMode.add(7);
        intArrayListMode.add(8);
        intArrayListMode.add(9);
        intArrayListMode.add(9);

        //Prints out the results of the getMeanDouble() and getMeanInt() methods
        System.out.println("Result of mean (using double array): " + this.getMeanDouble(doubleValuesOdd));
        System.out.println("Result of mean (using ArrayList<Double>): " + this.getMeanDouble(doubleArrayListOdd));
        System.out.println("Result of mean (using int array): " + this.getMeanInt(intValuesOdd));
        System.out.println("Result of mean (using ArrayList<Integer>): " + this.getMeanInt(intArrayListOdd));

        System.out.println();

        //Prints out the results of the getMedianDouble() and getMedianInt() methods
        System.out.println("Result of median (using odd double array): " + this.getMedianDouble(doubleValuesOdd));
        System.out.println("Result of median (using even double array): " + this.getMedianDouble(doubleValuesEven));
        System.out.println("Result of median (using odd ArrayList<Double>): " +
                this.getMedianDouble(doubleArrayListOdd));
        System.out.println("Result of median (using even ArrayList<Double>): " +
                this.getMedianDouble(doubleArrayListEven));
        System.out.println("Result of median (using odd int array): " + this.getMedianInt(intValuesOdd));
        System.out.println("Result of median (using even int array): " + this.getMedianInt(intValuesEven));
        System.out.println("Result of median (using odd ArrayList<Integer>): " + this.getMedianInt(intArrayListOdd));
        System.out.println("Result of median (using even ArrayList<Integer>): " + this.getMedianInt(intArrayListEven));

        System.out.println();

        //Prints out the results of the getModeDouble() and getModeInt() methods
        System.out.println("Result of mode (using double array): " + this.getModeDouble(doubleValuesMode));
        System.out.println("Result of mode (using ArrayList<Double>): " + this.getModeDouble(doubleArrayListMode));
        System.out.println("Result of mode (using int array): " + this.getModeInt(intValuesMode));
        System.out.println("Result of mode (using ArrayList<Integer>): " + this.getModeInt(intArrayListMode));

        System.out.println();

        //Prints out the results of the getStandardDeviationDouble() and getStandardDeviationInt() methods
        System.out.println("Result of standard deviation (using double array): " +
                this.getStandardDeviation(getVarianceDouble(doubleValuesOdd)));
        System.out.println("Result of standard deviation (using ArrayList<Double>): " +
                this.getStandardDeviation(getVarianceDouble(doubleArrayListOdd)));
        System.out.println("Result of standard deviation (using int array) : " +
                this.getStandardDeviation(getVarianceInt(intValuesOdd)));
        System.out.println("Result of standard deviation (using ArrayList<Integer>): " +
                this.getStandardDeviation(getVarianceInt(intArrayListOdd)));

        System.out.println();
    }

}
