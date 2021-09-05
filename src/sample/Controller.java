package sample;

public class Controller {

    public static void main(String[] args) throws Exception{
        int length = 100000;
        AbstractSort sort = new QuickSort(length);
        AbstractSort sort1 = new MergeSort(length);
        AbstractSort sort2 = new Pyramide(length);

        System.out.println("\nстарт многопоточности\n");
        sort.start();
        sort1.start();
        sort2.start();
       // long nn = sort.timer();
        // почему при многопоточности не пишет первый результат?
      //  System.out.println("Compares: " + sort1.getCompares());
      //  System.out.println("Swaps: " + sort1.getSwaps());

       // System.out.println("Time: " + nn);
       // nn = sort1.timer();
       // System.out.println("Compares1: " + sort1.getCompares());
       // System.out.println("Swaps1: " + sort1.getSwaps());
       // System.out.println("Time1: " + nn);
    }
}
