import java.util.ArrayList;

public class StatsLibrary {

    public double getMeanDouble(double[] values){

        double sum = 0.0;

        for(double value: values){
            sum += value;
        }

        double mean = (sum / values.length);

        return mean;
    }

    public double getMeanInt(int[] values){
        int sum = 0;

        for(int value: values){
            sum += value;
        }

        double mean = (double)(sum / values.length);

        return mean;
    }

    public double getMeanDouble(ArrayList<Double> values){

        double sum = 0.0;

        for (double value: values){
            sum += value;
        }

        double mean = sum / values.size();

        return mean;
    }

    public double getMeanInt(ArrayList<Integer> values){
        int sum = 0;

        for(int value: values){
            sum += value;
        }

        double mean = (double)(sum / values.size());

        return mean;
    }

    public double getMedianDouble(double[] values){
        if(values.length % 2 == 1){

            int index = (int)Math.ceil(values.length / 2);

            double median = values[index];

            return median;
        }else {
            int index = values.length / 2;

            double firstValue = values[index];
            double secondValue = values[index + 1];

            double median = (firstValue + secondValue) / 2.0;

            return median;
        }
    }

    public double getMedianInt(int[] values){
        if(values.length % 2 == 1){

            int index = (int)Math.ceil(values.length / 2);

            double median = values[index];

            return median;
        }else {
            int index = values.length / 2;

            double firstValue = values[index];
            double secondValue = values[index + 1];

            double median = (firstValue + secondValue) / 2.0;

            return median;
        }
    }

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
