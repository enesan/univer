package sample;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Timer;

abstract class AbstractSort extends Thread {

    private int arrLength;
    private int[] mas;
    private Random rnd = new Random();
    private boolean isOneSortParameter;


    public AbstractSort (int arrLength) {
        this.arrLength = arrLength;
        mas = new int[arrLength];
        System.out.println("Длина массива: " + mas.length);
        for (int i = 0; i < arrLength; i++) {
            mas[i] = rnd.nextInt(1000);
        }
        System.out.println("Вызванный из конструктора " + Arrays.toString(mas));
    }

    public void sort(int[] array, int start, int end){}
    public void sort(int[] array){}

    public long timer(){
        long start;

        if(isOneSortParameter == false) {
            start = System.currentTimeMillis();
            sort(mas, 0, mas.length-1);
            return System.currentTimeMillis() - start;
        }

        start = System.currentTimeMillis();
        sort(mas);
        return System.currentTimeMillis() - start;
    }

    public int getArrLength() {
        return arrLength;
    }
    public void setArrLength(int arrLength) {
        this.arrLength = arrLength;
    }
    public int[] getMas() {
        return mas;
    }
    public void setMas(int[] mas) {
        this.mas = mas;
    }
    public Random getRnd() {
        return rnd;
    }
    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }
    public boolean isOneSortParameter() {
        return isOneSortParameter;
    }
    public void setOneSortParameter(boolean oneParameter) {
        isOneSortParameter = oneParameter;
    }
}
