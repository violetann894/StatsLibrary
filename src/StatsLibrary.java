import java.util.ArrayList;

public class StatsLibrary {

    public static double mean(double[] values){

        double sum = 0.0;

        for(double value: values){
            sum += value;
        }

        return ( sum / values.length);
    }

    public static double mean(ArrayList<Double> values){

        double sum = 0.0;

        for (double value: values){
            sum += value;
        }

        return (sum / values.size());
    }

    public static double median(double[] values){
        if(values.length % 2 == 1){

            int index = (int)Math.ceil(values.length / 2);

            return values[index];
        }else {

            int index = values.length / 2;

            double firstValue = values[index];
            double secondValue = values[index + 1];

            return (firstValue + secondValue) / 2.0;
        }
    }

    public static double median(ArrayList<Double> values){

        if(values.size() % 2 == 1){
            int index = (int)Math.ceil(values.size() / 2);
            return values.get(index);
        }else {
            int index = values.size() / 2;
            double firstValue = values.get(index);
            double secondValue = values.get(index + 1);
            return (firstValue + secondValue) / 2.0;
        }

    }

    public static ArrayList<Double> mode(double[] values){
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

    public static ArrayList<Double> mode (ArrayList<Double> values){
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

    public static double standardDeviation(double[] values){

        double mean = mean(values);

        double sumOfSquares = 0.0;

        for (double value : values){
            value -= mean;
            value = value*value;
            sumOfSquares += value;
        }

        double variance = sumOfSquares / (values.length - 1);

        return Math.sqrt(variance);
    }

    public static double standardDeviation(ArrayList<Double> values){

        double mean = mean(values);

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
