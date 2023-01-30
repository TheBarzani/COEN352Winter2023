package tut3.LinkedList;

public class SingleLL<T> implements ListADT<T> {

    private Node<T> head;
    private Node<T> tail;
    private int sz = 0;

    /*Shell class that contains a pointer and the data. */
    private class Node<Item> {
        Item item;
        Node<Item> nxt;
    }

    public SingleLL(){
        head = null;
        tail = null;
        sz = 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        sz = 0;
    }

    @Override
    public T get(){
        if (head == null) return null;
        return tail.item;

    };

    @Override
    public boolean insert(int p) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public T remove(T t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean contains(T t) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
