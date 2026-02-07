
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Tester {

    SortingAlgorithm sa;

    Tester(SortingAlgorithm sa){
        this.sa = sa;
    }

    public double singleTest(int size){
        int[] input = new int[size];
        Random rand = new Random();

        for(int i = 0; i < input.length; i++){ // putting values into array
            input[i] = rand.nextInt(999); //array element value is a random number
        }

        //I googled how to do this
        long startTime = System.nanoTime();
        sa.sorty(input);
        long endTime = System.nanoTime();

        long nano = endTime - startTime;
        long timeInMilli = TimeUnit.NANOSECONDS.toMillis(nano);

        return timeInMilli;
    }

    public void test(int iterations, int size){
        double totalTime = 0;
        double averageTime = 0;

        for(int i = 0; i < iterations; i++){ //doing singleTest ("iteration" times)
            totalTime = totalTime + singleTest(size);
        }

        averageTime = totalTime / iterations; //finding average

        System.out.println("Average time for algorithm to sort an array of size " + size + ": " + averageTime + " milliseconds.");

    }

    //Testing
    public static void main(String args[]){
        BubbleSort bs = new BubbleSort();
        Tester tester = new Tester(bs);

        tester.singleTest(10);
        tester.test(10, 10);


    }


}
