public class MergeSort implements SortingAlgorithm{

    public int[] sorty(int[] input) {

        return mergeSort(input);
    }

    public int[] merge(int[] A, int[] B){
        int newSize = A.length + B.length; //size of new array will be the size ofthe two inputted arrays combined
        int[] merged = new int[newSize]; //creating new array that will merge two inputted arrays

        int indexA = 0; //keeping track of index from A
        int indexB = 0; //keeping track of index from B

        for(int i = 0; i < newSize; i++){ //iterating to create values in merged

            if(indexA == A.length){ // use B if all elements in A have been used
                merged[i] = B[indexB++];
            }else if(indexB == B.length){
                merged[i] = A[indexA++]; //use A if all elements in B have been ued
            }else if(A[indexA] < B[indexB]){ // use lesser value
                merged[i] = A[indexA++];
            }else{
                merged[i] = B[indexB++];
            }

        }
        return merged;
    }

    public int[] mergeSort(int[] input){
        int n = input.length;
        int[] A = new int[n/2]; // size is first half of array
        int[] B = new int[n - (n /2)]; // size is second half of array

        if(n == 1){ // list of 1 element is already sorted
            return input;
        }

        for(int i = 0; i < n/2; i++){  // copy first half of input into A
            A[i] = input[i];
        }

        for(int i = n/2; i < n; i++){ // copy second half of input into B

            B[i - (n/2)] = input[i];
        }

        A = mergeSort(A); // sort both halves (until array size is 1)
        B = mergeSort(B); // sort both halves (until array size is 1)
        return merge(A, B); //merge sorted halves
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
//        MergeSort ms = new MergeSort();
//        int[] input = {5, 10, 60, 0, -1, 34, 6, 10};
//        // Output should be: [-1, 0, 5, 6, 10, 10, 34, 60]
//
//        System.out.println(printArray(ms.sorty(input)));
//
//    }

}
