public class Performance {


    public static void main(String args[]){

        // sorting algorithms
        BubbleSort bs = new BubbleSort();
        InsertionSort is = new InsertionSort();
        SelectionSort ss = new SelectionSort();
        ShellSort shs = new ShellSort();
        QuickSort qs = new QuickSort();
        MergeSort ms = new MergeSort();

        //Testing each algorithm

        Tester testerMS = new Tester(ms);
        System.out.println("Sorting Algorithm - Merge Sort");
        testerMS.test(20, 100);
        testerMS.test(20, 500);
        testerMS.test(20, 1000);
        testerMS.test(20, 2000);
        testerMS.test(20, 5000);
        testerMS.test(20, 10000);
        testerMS.test(20, 20000);
        testerMS.test(20, 75000);
        testerMS.test(20, 150000);

        System.out.println();

        Tester testerQS = new Tester(qs);
        System.out.println("Sorting Algorithm - Quick Sort");
        testerQS.test(20, 100);
        testerQS.test(20, 500);
        testerQS.test(20, 1000);
        testerQS.test(20, 2000);
        testerQS.test(20, 5000);
        testerQS.test(20, 10000);
        testerQS.test(20, 20000);
        testerQS.test(20, 75000);
        testerQS.test(20, 150000);

        System.out.println();

        Tester testerSHS = new Tester(shs);
        System.out.println("Sorting Algorithm - Shell Sort");
        testerSHS.test(20, 100);
        testerSHS.test(20, 500);
        testerSHS.test(20, 1000);
        testerSHS.test(20, 2000);
        testerSHS.test(20, 5000);
        testerSHS.test(20, 10000);
        testerSHS.test(20, 20000);
        testerSHS.test(20, 75000);
        testerSHS.test(20, 150000);

        System.out.println();

        Tester testerSS = new Tester(ss);
        System.out.println("Sorting Algorithm - Selection Sort");
        testerSS.test(20, 100);
        testerSS.test(20, 500);
        testerSS.test(20, 1000);
        testerSS.test(20, 2000);
        testerSS.test(20, 5000);
        testerSS.test(20, 10000);
        testerSS.test(20, 20000);
        testerSS.test(20, 75000);
        testerSS.test(20, 150000);

        System.out.println();

        Tester testerIS = new Tester(is);
        System.out.println("Sorting Algorithm - Insertion Sort");
        testerIS.test(20, 100);
        testerIS.test(20, 500);
        testerIS.test(20, 1000);
        testerIS.test(20, 2000);
        testerIS.test(20, 5000);
        testerIS.test(20, 10000);
        testerIS.test(20, 20000);
        testerIS.test(20, 75000);
        testerIS.test(20, 150000);

        System.out.println();

        Tester testerBS = new Tester(bs);
        System.out.println("Sorting Algorithm - Bubble Sort");
        testerBS.test(20, 100);
        testerBS.test(20, 500);
        testerBS.test(20, 1000);
        testerBS.test(20, 2000);
        testerBS.test(20, 5000);
        testerBS.test(20, 10000);
        testerBS.test(20, 20000);
        testerBS.test(20, 75000);
        testerBS.test(20, 150000);

    }



}
