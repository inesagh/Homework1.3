package com.queue;

public class Last implements Queue{
    private Integer[] arr = new Integer[0];
    private int i = 0;
    private int k = 0;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public Integer[] getArr() {
        printEl();
        return arr;
    }

    public void setArr(Integer[] arr) {
        this.arr = arr;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int checkArr(){
        for (int i1 = 0; i1 < this.arr.length; i1++) {
            if(this.arr[i1] == null)  return i1 ;
        }
        return -1;
    }

    public void copyArr(){
        Integer[] copyArr = new Integer[this.arr.length + 1];

        for (int i1 = 0; i1 < arr.length; i1++) {
            copyArr[i1] = arr[i1];
        }
        this.arr = copyArr;
    }

    public void printEl(){
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println(arr[i1]);
        }
    }

    @Override
    public void add(int a) {
        int i = checkArr();

        if (i != -1) {
            arr[i] = a;
        }
        else {
            copyArr();
            arr[arr.length - 1] = a;
        }
    }

    @Override
    public void poll() {
        System.out.println("Tha last one is " + arr[arr.length - 1]);
    }

    @Override
    public void peek() {
        Integer[] withoutLastEl = new Integer[this.arr.length - 1];
        System.out.println("The last one was " + this.arr[this.arr.length - 1]);
        for (int i1 = 0; i1 < withoutLastEl.length; i1++) {
            withoutLastEl[i1] = this.arr[i1];
        }
        this.arr = withoutLastEl;
    }
}
