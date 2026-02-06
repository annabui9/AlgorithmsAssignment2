public class QuickSort implements SortingAlgorithm{

    public int[] sorty(int[] input) {

        int startIndex = 0;
        int endIndex = input.length - 1;

        quickSort(input, startIndex, endIndex);

        return input;
    }

    //finding first pivot
    public int medianOfThree(int[] input, int leftIndex, int centerIndex, int rightIndex){ //finding the median of 3
        int temp = 0;
        int leftVal = input[leftIndex];
        int centerVal = input[centerIndex];
        int rightVal = input[rightIndex];

        //sorting all three values (to pick median)
        if(leftVal > rightVal){ // checks the farthest left and farthest right values
            //swap
            temp = leftIndex;
            leftIndex = rightIndex;
            rightIndex = temp;
        }
        if(centerVal > rightVal){ // checks center and farthest right value
           //swap
            temp = centerIndex;
            centerIndex = rightIndex;
            rightIndex = temp;
        }
        if(leftVal > centerVal){ // checks farthest left and center
            //swap
            temp = leftIndex;
            leftIndex = centerIndex;
            centerIndex = temp;
        }
        //picking median
        return centerIndex;
    }

    //partitioning the list
    public int partition(int[] input, int leftIndex, int rightIndex){
        int centerIndex = (leftIndex + rightIndex) / 2; //finding center index for medianOfThree
        int pivotIndex = medianOfThree(input, leftIndex, centerIndex, rightIndex);
        int pivotValue = input[pivotIndex];

        int temp = 0;

        //swap value of pivot with value highEnd
        temp = input[pivotIndex];
        input[pivotIndex] = input[rightIndex];
        input[rightIndex] = temp;

        //pointers used to iterate
        int i = leftIndex;
        int j = rightIndex - 1; //because far right is now pivot (and we want to exclude it for now)

        boolean done = false;

        while(!done){

            while(i <= j && input[i]< pivotValue){ //increment i until find value greater than pivot
                i++; // if less than pivot, keep incrementing
            }
            while(j >= i && input[j] > pivotValue){ //decrement j until finds value less than pivot
                j--; // if greater than pivot, keep decrementing
            }
            if(i >= j){ // if index i > j
                done = true; // done partitioning (get out of loop and swap i and pivot)
            } else{ //when i and j are found but i is not greater than j

                //swap i and j
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;

                //keep partitioning
                i++;
                j--;
            }
        }

        //swapping i and pivot
        temp = input[i];
        input[i] = input[rightIndex];
        input[rightIndex] = temp;

        return i; //last index in left partition (to know where to partition)
    }

    //sorting the list
    public void quickSort(int[] input, int startIndex, int endIndex){

        if(endIndex <= startIndex){ //array of size 1 is already sorted
            return;
        }
        int split = partition(input, startIndex, endIndex); // where to split the list

        quickSort(input,startIndex, split - 1); //sort left side
        quickSort(input, split + 1, endIndex); // sort right side

    }

//            //PRINTING ARRAY (to test)
//    public static String printArray(int[] input){
//        String array = "[";
//
//        for (int i = 0; i < input.length; i++) {
//
//            array = array + input[i];
//            if (i < input.length - 1) {
//                array = array +  " , ";
//            }
//
//        }
//        array = array + "]";
//        return array;
//    }
//
//    //TESTING ALGORITHM
//    public static void main(String args[]){
//        QuickSort qs = new QuickSort();
//        int[] input = {5, 10, 60, 0, -1, 34, 6, 10};
//        // Output should be: [-1, 0, 5, 6, 10, 10, 34, 60]
//
//        System.out.println(printArray(qs.sorty(input)));
//
//    }

}
