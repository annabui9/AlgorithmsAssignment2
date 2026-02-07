public class PerformanceK {

    public static void main(String args[]){

        // sorting algorithms
        BubbleSort bs = new BubbleSort();
        InsertionSort is = new InsertionSort();
        SelectionSort ss = new SelectionSort();
        ShellSort shs = new ShellSort();
        QuickSort qs = new QuickSort();
        MergeSort ms = new MergeSort();

        //Testing each algorithm

        KTester testerMS = new KTester(ms);
        System.out.println("Sorting Algorithm - Merge Sort");
        testerMS.testK(20, 100);
        testerMS.testK(20, 500);
        testerMS.testK(20, 1000);
        testerMS.testK(20, 2000);
        testerMS.testK(20, 5000);
        testerMS.testK(20, 10000);
        testerMS.testK(20, 20000);
        testerMS.testK(20, 75000);
        testerMS.testK(20, 150000);

        System.out.println();

        KTester testerQS = new KTester(qs);
        System.out.println("Sorting Algorithm - Quick Sort");
        testerQS.testK(20, 100);
        testerQS.testK(20, 500);
        testerQS.testK(20, 1000);
        testerQS.testK(20, 2000);
        testerQS.testK(20, 5000);
        testerQS.testK(20, 10000);
        testerQS.testK(20, 20000);
        testerQS.testK(20, 75000);
        testerQS.testK(20, 150000);

        System.out.println();

        KTester testerSHS = new KTester(shs);
        System.out.println("Sorting Algorithm - Shell Sort");
        testerSHS.testK(20, 100);
        testerSHS.testK(20, 500);
        testerSHS.testK(20, 1000);
        testerSHS.testK(20, 2000);
        testerSHS.testK(20, 5000);
        testerSHS.testK(20, 10000);
        testerSHS.testK(20, 20000);
        testerSHS.testK(20, 75000);
        testerSHS.testK(20, 150000);

        System.out.println();

        KTester testerSS = new KTester(ss);
        System.out.println("Sorting Algorithm - Selection Sort");
        testerSS.testK(20, 100);
        testerSS.testK(20, 500);
        testerSS.testK(20, 1000);
        testerSS.testK(20, 2000);
        testerSS.testK(20, 5000);
        testerSS.testK(20, 10000);
        testerSS.testK(20, 20000);
        testerSS.testK(20, 75000);
        testerSS.testK(20, 150000);

        System.out.println();

        KTester testerIS = new KTester(is);
        System.out.println("Sorting Algorithm - Insertion Sort");
        testerIS.testK(20, 100);
        testerIS.testK(20, 500);
        testerIS.testK(20, 1000);
        testerIS.testK(20, 2000);
        testerIS.testK(20, 5000);
        testerIS.testK(20, 10000);
        testerIS.testK(20, 20000);
        testerIS.testK(20, 75000);
        testerIS.testK(20, 150000);

        System.out.println();

        KTester testerBS = new KTester(bs);
        System.out.println("Sorting Algorithm - Bubble Sort");
        testerBS.testK(20, 100);
        testerBS.testK(20, 500);
        testerBS.testK(20, 1000);
        testerBS.testK(20, 2000);
        testerBS.testK(20, 5000);
        testerBS.testK(20, 10000);
        testerBS.testK(20, 20000);
        testerBS.testK(20, 75000);
        testerBS.testK(20, 150000);

    }
}
