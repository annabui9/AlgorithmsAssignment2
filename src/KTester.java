import java.util.Random;
import java.util.concurrent.TimeUnit;

public class KTester {

    SortingAlgorithm sa;

    KTester(SortingAlgorithm sa){
        this.sa = sa;
    }

    public void generateKSorted(int[] my_array){
        int n = my_array.length;
        int temp = 0;
        int minSwap;
        int maxSwap;
        int swapK;

        for(int i = 0; i < n; i++){
            my_array[i] = i;
        }

        int k = 10;
        Random rand = new Random();

        for(int i = 0; i < n; i++){
            minSwap = Math.max(0, i-k); //smallest value element i can swtich with
            maxSwap = Math.min(n-1, i+k); // largest value element i can switch with

            swapK = minSwap + rand.nextInt(maxSwap - minSwap + 1); // swap by a random amount

            //swap
            temp = my_array[i];
            my_array[i] = my_array[swapK];
            my_array[swapK] = temp;
        }
    }

    public double singleTestK(int size){

        int[] input = new int[size];

        generateKSorted(input);

        //I googled how to do this update: i saw later that you put this in the assignment
        long startTime = System.nanoTime();
        sa.sorty(input);
        long endTime = System.nanoTime();

        long nano = endTime - startTime;
        long timeInMilli = TimeUnit.NANOSECONDS.toMillis(nano);

        return timeInMilli;
    }

    public void testK(int iterations, int size){

        double totalTime = 0;
        double averageTime = 0;

        for(int i = 0; i < iterations; i++){ //doing singleTest ("iteration" times)
            totalTime = totalTime + singleTestK(size);
        }

        averageTime = totalTime / iterations; //finding average

        System.out.println("Average time for algorithm to sort an array of size " + size + ": " + averageTime + " milliseconds.");


    }

}
