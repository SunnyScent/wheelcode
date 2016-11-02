package chapter1;

import java.util.Iterator;

/**
 * @author: SunnyScent
 * @Date: 2016-10-21
 * @Time: 14:50
 */

public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void resize(int max) {
        //move stack to a new array of size max
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item) {
        //Add  item to top of Stack
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    public Item pop() {
        if (isEmpty()) {
            Item item = a[--N];
            a[N] = null;
            if (N > 0 && N == a.length / 4) {
                resize(a.length / 2);
            }
            return item;
        }
        return null;
    }
    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}