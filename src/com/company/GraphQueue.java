package com.company;

public class GraphQueue {
    private int[] array;
    private int size = 10;
    private int head;
    private int tail;
    private int count;

    public GraphQueue() {
        array = new int[size];
        head = 0;
        tail = -1;
        count = 0;
    }
}
