package com.queue;

public class First implements com.queue.Queue {
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
        System.out.println("Tha first one is " + arr[0]);
    }

    @Override
    public void peek() {
        Integer[] withoutFirstEl = new Integer[this.arr.length - 1];
        System.out.println("The first one was " + this.arr[0]);
        for (int i1 = 0; i1 < withoutFirstEl.length; i1++) {
            withoutFirstEl[i1] = this.arr[i1 + 1];
        }
        this.arr = withoutFirstEl;
    }
}
