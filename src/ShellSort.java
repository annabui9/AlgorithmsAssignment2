public class ShellSort implements SortingAlgorithm{

    public int[] sorty(int[] input) {
        int n = input.length;
        int temp = 0;
        for(int gap = n/2; gap > 0; gap /= 2){ // look at each section (based on the gap that gets divided by 2)
            for(int i = gap; i < n; i++){ // start at gap (when outer loop increments, gap will change)
                temp = input[i]; //element to be sorted
                int j;
                for(j = i; j >= gap && temp < input[j - gap]; j -=gap){ //shifts those greater than temp, move the size of gap
                    input[j] = input[j-gap];
                }
                input[j] = temp; //sort element
            }
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
//        ShellSort shs = new ShellSort();
//        int[] input = {5, 10, 60, 0, -1, 34, 6, 10};
//        // Output should be: [-1, 0, 5, 6, 10, 10, 34, 60]
//
//        System.out.println(printArray(shs.sorty(input)));
//
//    }
}
