package com.company;

public class GraphQueue <T> implements Queue<T> {
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

    @Override
    public void add(int T) {
        if (tail == size - 1)
            tail = -1;

        array[++tail] = T;
        count++;
    }

    @Override
    public int remove() {
        if (head == size)
            head = 0;

        count--;
        return array[head++];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
}
