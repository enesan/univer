package sample;

import java.util.Arrays;
import java.util.Date;

public class Controller {

    public static void main(String[] args) throws Exception{
        int[] x = {5, 14, 56, 12, 3, 5};
        System.out.println(Arrays.toString(x));

        AbstractSort sort = new QuickSort(20);
        System.out.println(Arrays.toString(sort.getMas()));
    }


}
