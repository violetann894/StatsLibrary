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

        // check if odd or even length
        if(values.length % 2 == 1){
            int index = (int)Math.ceil(values.length / 2);
            return values[index];
        }else {
            double firstValue = values[values.length / 2];
            double secondValue = values[(values.length / 2) + 1];
            return (firstValue + secondValue) / 2.0;
        }
    }

    public static double median(ArrayList<Double> values){

        if(values.size() % 2 == 1){
            int index = (int)Math.ceil(values.size() / 2);
            return values.get(index);
        }else {
            double firstValue = values.get(values.size() / 2);
            double secondValue = values.get((values.size() / 2) + 1);
            return (firstValue + secondValue) / 2.0;
        }

    }

    public static double mode(double[] values){

        return 0.0;
    }

    public static double mode (ArrayList<Double> values){

        return 0.0;
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
