package sample;

public class Controller {

    public static void main(String[] args) throws Exception{
        AbstractSort sort = new QuickSort(20);
        AbstractSort sort1 = new MergeSort(20);

        long nn = sort.timer();
        System.out.println("Compares: " + sort.getCompares());
        System.out.println("Swaps: " + sort.getSwaps());
        System.out.println("Time: " + nn);
        nn = sort1.timer();
        System.out.println("Compares1: " + sort1.getCompares());
        System.out.println("Swaps1: " + sort1.getSwaps());
        System.out.println("Time1: " + nn);
    }
}
