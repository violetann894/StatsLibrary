import java.util.ArrayList;

public class StatsTester {

    public static void main(String[] args) {
        double[] doubleValuesOdd = {1.1, 2.5, 3.7, 6.9, 7.4};
        double[] doubleValuesEven = {1.1, 2.5, 3.7, 6.9};
        ArrayList<Double> doubleArrayListOdd = new ArrayList<>();
        ArrayList<Double> doubleArrayListEven = new ArrayList<>();

        int[] intValuesOdd = {1, 2, 3, 4, 5};
        int[] intValuesEven = {1, 2, 3, 4};
        ArrayList<Integer> intArrayListOdd = new ArrayList<>();
        ArrayList<Integer> intArrayListEven = new ArrayList<>();

        doubleArrayListOdd.add(1.1);
        doubleArrayListOdd.add(2.5);
        doubleArrayListOdd.add(3.7);
        doubleArrayListOdd.add(6.9);
        doubleArrayListOdd.add(7.4);

        doubleArrayListEven.add(1.1);
        doubleArrayListEven.add(2.5);
        doubleArrayListEven.add(3.7);
        doubleArrayListEven.add(6.9);

        intArrayListOdd.add(1);
        intArrayListOdd.add(2);
        intArrayListOdd.add(3);
        intArrayListOdd.add(4);
        intArrayListOdd.add(5);

        intArrayListEven.add(1);
        intArrayListEven.add(2);
        intArrayListEven.add(3);
        intArrayListEven.add(4);

        StatsLibrary tester = new StatsLibrary();

        System.out.println("Result of mean (using double array): " + tester.getMeanDouble(doubleValuesOdd));
        System.out.println("Result of mean (using ArrayList<Double>: " + tester.getMeanDouble(doubleArrayListOdd));
        System.out.println("Result of mean (using int array): " + tester.getMeanInt(intValuesOdd));
        System.out.println("Result of mean (using ArrayList<Integer>: " + tester.getMeanInt(intArrayListOdd));

        System.out.println("Result of median (using odd double array): " + tester.getMedianDouble(doubleValuesOdd));
        System.out.println("Result of median (using even double array): " + tester.getMedianDouble(doubleValuesEven));
        System.out.println("Result of median (using odd ArrayList<Double>): " +
                tester.getMedianDouble(doubleArrayListOdd));
        System.out.println("Result of median (using even ArrayList<Double>): " +
                tester.getMedianDouble(doubleValuesEven));
        System.out.println("Result of median (using odd int array): " + tester.getMeanInt(intValuesOdd));
        System.out.println("Result of median (using even int array): " + tester.getMeanInt(intValuesEven));
        System.out.println("Result of median (using odd ArrayList<Integer>): " + tester.getMeanInt(intArrayListOdd));
        System.out.println("Result of median (using even ArrayList<Integer>): " + tester.getMeanInt(intArrayListEven));

        /*
        System.out.println("Result of mode (using double array): " +  );
        System.out.println("Result of mode (using ArrayList<Double>): " + );
        System.out.println("Result of mode (using int array): " + );
        System.out.println("Result of mode (using ArrayList<Integer>): " + );
        */

        System.out.println("Result of standard deviation (using double array): " +
                tester.getStandardDeviationDouble(doubleValuesOdd));
        System.out.println("Result of standard deviation (using ArrayList<Double>): " +
                tester.getStandardDeviationDouble(doubleArrayListOdd));
        System.out.println("Result of standard deviation (using int array) : " +
                tester.getStandardDeviationInt(intValuesOdd));
        System.out.println("Result of standard deviation (using ArrayList<Integer>): " +
                tester.getStandardDeviationInt(intArrayListOdd));

    }

}
