public class BubbleSort implements SortingAlgorithm {

    public int[] sorty(int[] input) {
        int n = input.length - 1; // don't need to check last element (should already be sorted)
        int temp = 0;

        for(int i = 0; i < n ; i ++){ // loop to repeat comparison of values
            for(int j = 0; j < n; j++){ // loop to compare pair of numbers
                if(input[j] > input[j + 1]){ // if value on left (lower index) is greater than value on right (higher index)
                    // swapping values
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
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
//        BubbleSort bs = new BubbleSort();
//        int[] input = {5, 10, 60, 0, -1, 34, 6, 10};
//        // Output should be: [-1, 0, 5, 6, 10, 10, 34, 60]
//
//        System.out.println(printArray(bs.sorty(input)));
//
//    }

}
