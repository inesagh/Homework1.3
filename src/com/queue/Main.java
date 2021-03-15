package com.queue;

public class Main {
    public static void main(String[] args) {
        First First = new First();
        for(int i = 0; i < 5; i++){
            First.add(i);
        }
        First.getArr();
        First.poll();
        First.peek();
        First.getArr();

        System.out.println();

        Last Last = new Last();
        for(int i = 0; i < 5; i++){
            Last.add(i);
        }
        Last.getArr();
        Last.poll();
        Last.peek();
        Last.getArr();
    }
}
