package datastructure.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class HeapByQueue<T> {

    private Queue<T> heap; 

    public HeapByQueue() {
        heap = new PriorityQueue<>();
    }

    public void add(T data) {
        heap.add(data);
    }

    public T poll() {
        return heap.poll();
    }

    public T peek() {
        return heap.peek();
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
