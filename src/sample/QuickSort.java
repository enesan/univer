package sample;

public class QuickSort extends AbstractSort {

    public QuickSort(int arrLength) {
        super(arrLength);
        setOneSortParameter(false);
    }

    @Override
    public void sort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        sort(array, begin, pivot-1);
        sort(array, pivot+1, end);
    }

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

}
