import java.math.BigInteger;
import java.util.ArrayList;

/**
 * The ProbabilityCalculations class holds methods that calculate the probability of an event using various theorems
 * and rules.
 * @author Rachel Hussmann
 */
public class ProbabilityCalculations {

    /**
     * The conditionalProbability method finds the probability of A given B.
     * @param probAandB The probability of A and B occurring at the same time.
     * @param probB  The probability of B.
     * @return The probability of A given B.
     */
    public double conditionalProbability(double probAandB, double probB){
        return probAandB/probB;
    }

    /**
     * The independence method checks to see if the two events are independent.
     * @param probA The probability of event A.
     * @param probB The probability of event B.
     * @param probAandB The probability of event A and B occurring at the same time.
     * @return True - if the two events are independent, false - if the events are dependent
     */
    public boolean independence(double probA, double probB, double probAandB){
        return probA*probB == probAandB;
    }

    /**
     * The independenceUsingAGivenB method checks to see if the two events are independent using the probability of A
     * given B and the probability of A.
     * @param probAgivenB The probability of event A given B happened.
     * @param probA The probability of event A.
     * @return True - if the two events are independent, false - if the events are dependent
     */
    public boolean independenceUsingAGivenB(double probAgivenB, double probA){
        return probAgivenB == probA;
    }

    /**
     * The independenceUsingBGivenA method checks to see if the two events are independent using the probability of B
     * given A and the probability of B.
     * @param probBgivenA The probability of B given A
     * @param probB The probability of B
     * @return true - if the two events are independent, false - if the events are dependent
     */
    public boolean independenceUsingBGivenA(double probBgivenA, double probB){
        return probBgivenA == probB;
    }

    /**
     * The mnRule method finds the total number of simple events given a set of numbers.
     * @param listOfNumbers The list of numbers to be multiplied.
     * @return The total number of simple events.
     */
    public int mnRule(ArrayList<Integer> listOfNumbers){

        //Initialize the total variable
        int total = 1;

        //Loop through the list of numbers
        for(int i : listOfNumbers){

            //Multiply the number by the total
            total = total*i;
        }

        //Return the total
        return total;
    }

    /**
     * The multinomialCoefficient method finds the number of possible groups of objects into multiple different
     * groups.
     * @param n The number of objects.
     * @param listOfSets The list of groups.
     * @return The number of groups that can be made.
     */
    public int multinomialCoefficient(int n, ArrayList<Integer> listOfSets){

        Factorial factorial = new Factorial();

        //Initialize the numerator with the factorial of n
        int numerator = factorial.factorial(n);

        //Initialize the denominator
        int denominator = 1;

        //Loop through the list of groups
        for(Integer i : listOfSets){

            //Find the factorial of i and then add it to the denominator
            denominator = denominator*factorial.factorial(i);
        }

        //Return the double value of the numerator divided by the denominator
        return numerator/denominator;
    }

    /**
     * The multinomialCoefficient method finds the number of possible groups of objects into multiple different
     * groups.
     * @param n The number of objects.
     * @param listOfSets The list of groups.
     * @return The number of groups that can be made.
     */
    public BigInteger multinomialCoefficient(BigInteger n, ArrayList<BigInteger> listOfSets){

        Factorial factorial = new Factorial();

        //Initialize the numerator with the factorial of n
        BigInteger numerator = factorial.factorial(n);

        //Initialize the denominator
        BigInteger denominator = BigInteger.valueOf(1);

        //Loop through the list of groups
        for(BigInteger i : listOfSets){

            //Find the factorial of i and then add it to the denominator
            denominator = denominator.multiply(factorial.factorial(i));
        }

        //Return the BigInteger value of the numerator divided by the denominator
        return numerator.divide(denominator);
    }

    /**
     * The multiplicativeProbability method finds the probability of A and B, depending on if they are independent
     * or not.
     * @param probA The probability of event A.
     * @param probB The probability of event B.
     * @param probAgivenB The probability of event A given B.
     * @return The probability of A and B
     */
    public double multiplicativeProbability(double probA, double probB, double probAgivenB){

        //Check to see if the events are independent
        if (independenceUsingAGivenB(probAgivenB, probA)){

            //if they are return the probability of A times the probability of B
            return probA*probB;
        }

        //Else return the probability of B times the probability of A given B
        return probB*probAgivenB;
    }

    /**
     * The additiveProbability method finds the probability of A or B, depending on if they are independent or not.
     * @param probA The probability of event A.
     * @param probB The probability of event B.
     * @param probAandB The probability of A and B.
     * @return The probability of A or B.
     */
    public double additiveProbability(double probA, double probB, double probAandB){

        //Check to see if the probability of A and B is zero
        if(probAandB == 0){

            //if it is

            //Return the probability of A times the probability of B
            return probA + probB;
        }

        //Else return the probability of A time the probability of B minus the probability of A and B
        return probA + probB - probAandB;
    }

    /**
     * The findingAUsingAInverse method finds the probability of A using the probability of A inverse.
     * @param probAInverse The probability of A inverse.
     * @return The probability of A
     */
    public double findingAUsingAInverse(double probAInverse){
        return 1.0-probAInverse;
    }

    /**
     * The lawOfTotalProbability method accepts ArrayLists and calculates the probability of A happening across a range
     * of different other events.
     * @param AgivenBi An ArrayList holding all the probabilities of A given Bi, where i is another event.
     * @param Bi An ArrayList holding all the probabilities of Bi.
     * @return The probability of A
     */
    public double lawOfTotalProbability(ArrayList<Double> AgivenBi, ArrayList<Double> Bi){

        double probA = 0.0;

        for(int i = 0; i < AgivenBi.size(); i++){
            probA += AgivenBi.get(i)*Bi.get(i);
        }

        return probA;
    }

    /**
     * The bayesRule method accepts ArrayLists and probabilities, and calculates the probability of A happening when we
     * only know information about events B1, B2, . . .Bi.
     * @param AgivenBi An ArrayList holding all the probabilities of A given Bi, where i is another event.
     * @param Bi An ArrayList holding all the probabilities of Bi.
     * @param AgivenBj The probability of A happening given a specific event, Bj, happening.
     * @param Bj The probability of a specific event, Bj, happening.
     * @return The probability of a specific event, Bj, given A happens.
     */
    public double bayesRule(ArrayList<Double> AgivenBi, ArrayList<Double> Bi, double AgivenBj, double Bj){
        return (AgivenBj*Bj)/lawOfTotalProbability(AgivenBi, Bi);
    }

    /**
     * The testerOutput method is used to test the methods that have been developed in this class.
     */
    public void testerOutput(){

        //Initialize ArrayList for testing
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);

        //Testing conditional probability
        System.out.println("Conditional Probability: " + this.conditionalProbability(0.20,
                0.5));

        System.out.println();

        //Testing the different forms of independenceUsingAGivenB
        System.out.println("Independence of P(A) = .40, P(B) = .37, P(A and B) = 0.10: " +
                this.independence(.40, .37, .10));
        System.out.println("Independence of P(A) = .40 and P(A|B) = 0.27: " +
                this.independenceUsingAGivenB(0.27, .40));
        System.out.println("Independence of P(B) = .5 and P(B|A) = .5: " + independenceUsingBGivenA(.5, .5));

        System.out.println();

        //Testing the mn rule
        System.out.println("mn rule for 1, 2, 3, 4, 5: " + this.mnRule(intArrayList));

        System.out.println();

        //Initialize the ArrayList of integers
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        //Adds numbers to the listOfNumbers
        listOfNumbers.add(6);
        listOfNumbers.add(4);

        //Initialize the ArrayList of BigIntegers
        ArrayList<BigInteger> listOfBigNumbers = new ArrayList<>();

        //Adds BigIntegers to the listOfBigNumbers
        listOfBigNumbers.add(BigInteger.valueOf(6));
        listOfBigNumbers.add(BigInteger.valueOf(4));


        //Testing multinomial coefficient
        System.out.println("Multinomial coefficient: " + this.multinomialCoefficient(10, listOfNumbers));
        System.out.println("Multinomial coefficient: " + this.multinomialCoefficient(BigInteger.valueOf(10),
                listOfBigNumbers));

        System.out.println();

        //Testing multiplicative rule
        System.out.println("Multiplicative rule (independent): " +
                this.multiplicativeProbability(0.5, 0.16666667, 0.5));
        System.out.println("Multiplicative rule (dependent): " +
                this.multiplicativeProbability(0.4, 0.286, 0.9));

        System.out.println();

        //Testing additive rule
        System.out.println("Additive rule (independent): " +
                this.additiveProbability(0.5, 0.16666, 0.0));
        System.out.println("Additive rule (dependent): " +
                this.additiveProbability(0.6, 0.1, 0.4));

        System.out.println();

        //Testing out law of total probability and bayes rule
        //Using example 2.23
        ArrayList<Double> AgivenBi = new ArrayList<>();
        ArrayList<Double> Bi = new ArrayList<>();

        AgivenBi.add(.135275);
        AgivenBi.add(.057624);

        Bi.add(0.2);
        Bi.add(0.8);

        System.out.println("Law of Total Probability: " + lawOfTotalProbability(AgivenBi, Bi));

        double AgivenB = AgivenBi.get(0);
        double B = Bi.get(0);

        System.out.println("Bayes Rule: " + bayesRule(AgivenBi, Bi, AgivenB, B));

        System.out.println("Final calculation: " + (1.0 - bayesRule(AgivenBi, Bi, AgivenB, B)));

        System.out.println();

        System.out.println("Finding P(A) using P(A'), where P(A') = 0.2: P(A) = " + findingAUsingAInverse(0.2));

        System.out.println();
    }
}
