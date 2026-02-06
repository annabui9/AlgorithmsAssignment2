public class InsertionSort implements SortingAlgorithm{

    public int[] sorty(int[] input) {
        int temp = 0;

        for(int i = 1; i < input.length; i++){ // start at index 1 to compare to index 0 (in inner loop), looks to next element
            for(int j = i; j > 0 && input[j] < input[j - 1]; j--){ // if need to switch (bc not sorted) proceed, also keeps track of which element with j = i
                // swapping
                temp = input[j];
                input[j] = input[j - 1];
                input[j - 1] = temp;
            }

        }
        return input;
    }

//    //PRINTING ARRAY (to test)
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
//        InsertionSort is = new InsertionSort();
//        int[] input = {5, 10, 60, 0, -1, 34, 6, 10};
//        // Output should be: [-1, 0, 5, 6, 10, 10, 34, 60]
//
//        System.out.println(printArray(is.sorty(input)));
//
//    }
//


}
