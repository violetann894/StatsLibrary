import java.util.ArrayList;

public class StatsTester {

    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(5.6);
        values.add(6.9);
        values.add(6.9);
        values.add(7.2);
        values.add(8.0);
        values.add(9.5);

        System.out.println(StatsLibrary.mean(values));
        System.out.println(StatsLibrary.standardDeviation(values));
        System.out.println(StatsLibrary.median(values));

    }

}
