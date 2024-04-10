package org;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

public class VectorHeap<E extends Comparable<E>> extends java.util.PriorityQueue<E> {
    private PriorityQueue<E> data;

    public  VectorHeap() {
        data = new PriorityQueue<>();
    }
    @Override
    public boolean add(E e) {
        return  data.add(e);
    }
    @Override
    public boolean offer(E e) {
        return data.offer(e);
    }

    @Override
    public E remove() {
        return data.remove();
    }

    @Override
    public E poll() {
        return data.poll();
    }

    @Override
    public E element() {
        return  data.element();
    }

    @Override
    public E peek() {
        return data.peek();
    }
    @Override
    public int size() {
        return  data.size();
    }

    @Override
    public boolean isEmpty() {
        return  data.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return data.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return  data.iterator();
    }

    @Override
    public Object[] toArray() {
        return data.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return data.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return data.remove(o);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return data.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return data.retainAll(c);
    }

    @Override
    public void clear() {
        data.clear();
    }
}

