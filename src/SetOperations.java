import java.util.ArrayList;
import java.util.Collections;

/**
 * The SetOperations class holds methods that perform operation on a set such as union, intersection and complement.
 * @author Rachel Hussmann
 */
public class SetOperations {

    /**
     * The union method accepts two ArrayLists of strings and returns distinct strings that are shared
     * between the two inputted ArrayLists.
     *
     * @param array1 This parameter accepts an ArrayList of strings to be joined with array2.
     * @param array2 This parameter accepts an ArrayList of strings to be joined with array1.
     * @return This method returns an ArrayList of the distinct strings of both ArrayLists.
     */
    public ArrayList<String> union(ArrayList<String> array1, ArrayList<String> array2){
        //Initializes the ArrayLists needed to find the union
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> holder = new ArrayList<>();

        //Adds the ArrayLists to the result ArrayList
        holder.addAll(array1);
        holder.addAll(array2);

        //Sorts the set for easier duplicate removal
        Collections.sort(holder);

        //Looks at the previous string
        String previousValue = "";

        //Sets the highest number of occurrences allowed
        int highestNumOfOccur = 1;

        //Tracker of the number of occurrences of the current value
        int currentNumOfOccur = 0;

        //Iterates through the holder list
        for(String value : holder){

            //If the value is not the same as the previous value
            if(!value.equals(previousValue)){

                //Add the value to the list
                result.add(value);

                //Reset the number of occurrences
                currentNumOfOccur = 1;

            }else{
                //Otherwise

                //Increase the number of occurrences, since it is the same value
                currentNumOfOccur ++;

                //If the current number of occurrences is less than or equal to the highest number allowed
                if(currentNumOfOccur <= highestNumOfOccur){

                    //Add it to the results
                    result.add(value);
                }
            }
            //Set the previous value
            previousValue = value;
        }

        //Method returns the result of the union between array1 and array2
        return result;
    }

    /**
     * The intersect method accepts two ArrayLists of strings and returns the strings that are only in both ArrayLists.
     *
     * @param array1 This parameter accepts an ArrayList of strings to compare to array2.
     * @param array2 This parameter accepts and ArrayList of strings to compare to array1.
     * @return This method returns an ArrayList of strings that are only in both ArrayLists.
     */
    public ArrayList<String> intersect(ArrayList<String> array1, ArrayList<String> array2){
        //Initializes the ArrayLists needed to find the intersection
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> holder = new ArrayList<>();

        //Loops through the two lists to see what values both have; adds them to the result ArrayList
        for(String value1: array1){
            for(String value2: array2){
                if(value1.equals(value2)){
                    holder.add(value1);
                }
            }
        }

        //Sorts the set for easier duplicate removal
        Collections.sort(holder);

        //Looks at the previous string
        String previousValue = "";

        //Sets the highest number of occurrences allowed
        int highestNumOfOccur = 1;

        //Tracker of the number of occurrences of the current value
        int currentNumOfOccur = 0;

        //Iterates through the holder list
        for(String value : holder){

            //If the value is not the same as the previous value
            if(!value.equals(previousValue)){

                //Add the value to the list
                result.add(value);

                //Reset the number of occurrences
                currentNumOfOccur = 1;

            }else{
                //Otherwise

                //Increase the number of occurrences, since it is the same value
                currentNumOfOccur ++;

                //If the current number of occurrences is less than or equal to the highest number allowed
                if(currentNumOfOccur <= highestNumOfOccur){

                    //Add it to the results
                    result.add(value);
                }
            }
            //Set the previous value
            previousValue = value;
        }

        //Method returns the result of the intersection between array1 and array2
        return result;
    }

    /**
     * The complement method accepts two ArrayLists of strings, a subset and the sample, and returns strings that
     * are not in the subset.
     *
     * @param subset This parameter accepts an ArrayList of strings that contains a part of the full dataset.
     * @param sample This parameter accepts an ArrayList of strings that is a sample of the full dataset.
     * @return This method returns an ArrayList of strings that contains all the values not in the given subset.
     */
    public ArrayList<String> complement(ArrayList<String> subset, ArrayList<String> sample){
        //Loops through the subset to remove the value from the sample
        for(String value: subset){
            sample.remove(value);
        }

        //Method returns the sample which has had all the subset values removed
        return sample;
    }

    /**
     * The testerOutput method is used to test the methods that have been developed in this class.
     */
    public void testerOutput(){
        //Initializes the ArrayList that will hold the sample values
        ArrayList<String> sample = new ArrayList<>();

        //Adding the sample values to the sample ArrayList
        sample.add("Monday");
        sample.add("Tuesday");
        sample.add("Wednesday");
        sample.add("Thursday");
        sample.add("Friday");
        sample.add("Saturday");
        sample.add("Sunday");

        //Initializes the ArrayLists that will be used to test the union, intersect and complement methods
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();

        //Adding values to array1
        array1.add("Monday");
        array1.add("Tuesday");
        array1.add("Wednesday");

        //Adding values to array2
        array2.add("Wednesday");
        array2.add("Thursday");
        array2.add("Friday");

        //Finds and prints out the union between array1 and array2
        System.out.println("Union: " + this.union(array1, array2));

        //Finds and prints out the intersection between array1 and array2
        System.out.println("Intersect: " + this.intersect(array1, array2));

        //Finds and prints out the ArrayList that is the complement to array1
        System.out.println("Complement: " + this.complement(array1, sample));

        System.out.println();
    }
}
