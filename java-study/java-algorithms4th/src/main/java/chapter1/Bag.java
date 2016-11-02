package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The {@code Bag} class represents a bag (or multiset) of
 * generic items .It supports insertion and iterating over the
 * items in arbitrary order
 *
 * @author: SunnyScent
 * @Date: 2016-09-21
 * @Time: 13:31
 */

public class Bag<Item> implements Iterable<Item> {

    //beginning of bag
    private Node<Item> first;
    //number of element in bag
    private int n;

    /**
     * Node help linked list class
     *
     * @param <Item>
     */
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /***
     * Initializes an empty bag
     */
    public Bag() {
        first = null;
        n = 0;
    }

    /**
     * Returns true if this bag id empty.
     *
     * @return {@code true} if this bag is empty;
     * {@code false} otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }


    /**
     * Returns the number of the items in this bag
     *
     * @return
     */
    public int size() {
        return n;
    }

    /**
     * Adds the item to this bag
     *
     * @param item
     */
    public void add(Item item) {
        Node<Item> oldFirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    /**
     * Returns an iterator that iterates over the item in this bag in arbitrary order
     * @return
     */
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    /**
     * an iterator ,does not implement remove()
     * @param <Item>
     */
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }


        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


    public static void main(String[] args) {
        Bag<String> bag=new Bag<String>();
        while (!StdIn.isEmpty()){
            String item=StdIn.readString();
            bag.add(item);
        }

        StdOut.println("size of bag = " +bag.size());
        for (String s:bag) {
            StdOut.println(s);
        }
    }
}