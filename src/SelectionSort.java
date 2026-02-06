public class SelectionSort implements SortingAlgorithm{

    public int[] sorty(int[] input) {
        int temp = 0;
        int indexSmall = 0; //keeps track of the index of the smallest sorted value

        for(int i = 0; i < input.length; i++){ // iterates through each element in list
            indexSmall = i; // start at first element
            for(int j = i; j < input.length; j++){ //searches from unsorted (i to end) for smallest remaining value
                if(input[j] < input[indexSmall]){
                    indexSmall = j;
                }
            }
            // swap
            temp = input[i];
            input[i] = input[indexSmall];
            input[indexSmall] = temp;
        }
        return input;
    }

//        //PRINTING ARRAY (to test)
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
//        SelectionSort ss = new SelectionSort();
//        int[] input = {5, 10, 60, 0, -1, 34, 6, 10};
//        // Output should be: [-1, 0, 5, 6, 10, 10, 34, 60]
//
//        System.out.println(printArray(ss.sorty(input)));
//
//    }

}
