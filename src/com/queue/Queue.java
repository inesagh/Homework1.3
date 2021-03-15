package com.queue;
//add, poll - return last one, peek - return last one and delete that one

public interface Queue {
    void add(int a);
    void poll();
    void peek();
}
