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
    protected long swaps = 0;
    protected long compares = 0;

    public AbstractSort (int arrLength) {
        this.arrLength = arrLength;
        mas = new int[arrLength];
        System.out.println("Длина массива: " + mas.length);
        for (int i = 0; i < arrLength; i++) {
            mas[i] = rnd.nextInt(1000);
        }
        System.out.println("Часть исходного массива: " + Arrays.toString(Arrays.copyOfRange(mas, 0, 10)));
    }

    protected void incrementCompares() {
        ++compares;
    }
    protected void incrementSwaps() {
        ++swaps;
    }


    protected long timer() throws InterruptedException{
        long start, finish;

        if(isOneSortParameter == false) {
            start = System.currentTimeMillis();
            sort(mas, 0, mas.length-1);
            finish = System.currentTimeMillis();
            System.out.println("Часть отсортированного массива: " + Arrays.toString(Arrays.copyOfRange(mas, 0, 10)));
            return finish - start;
        }

        start = System.currentTimeMillis();
        sort(mas);
        finish = System.currentTimeMillis();
        System.out.println("Часть отсортированного массива: " + Arrays.toString(Arrays.copyOfRange(mas, 0, 10)));
        return finish - start;
    }


    @Override
    public void run() {
        try {
            System.out.println("Время в параллели: " + timer() + " мс");
            System.out.println();
        } catch (InterruptedException e) {
            e.getMessage();
            System.out.println("Interrupted exception in run AbstractSort");
        }
        System.out.println("Compares: " + getCompares());
        System.out.println("Swaps: " + getSwaps());
    }

    public void sort(int[] array, int start, int end){}
    public void sort(int[] array){}

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
    public long getSwaps() {
        return swaps;
    }
    public void setSwaps(long swaps) {
        this.swaps = swaps;
    }
    public long getCompares() {
        return compares;
    }
    public void setCompares(long compares) {
        this.compares = compares;
    }
}
