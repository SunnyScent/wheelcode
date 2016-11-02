package chapter1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The {@code Queue} class represents a first-in-first-out
 * queue of generic items.
 * It supports the usual <em>enqueue</em> and <em>dequeue</em> operations,along with methods for peeking
 * at the first item.
 * first                              last
 *   ??                                  ??
 *   ??-??-??-??-??-??-??-??-??-??-??-??-??-??-??-??-??-??
 * @author: SunnyScent
 * @Date: 2016-09-22
 * @Time: 8:53
 */

public class Queue<Item> implements Iterable<Item> {
    //beginning of queue
    private Node<Item> first;

    //end of queue
    private Node<Item> last;

    //number of elements on queue
    private int n;

    /**
     * helper linked the list class
     *
     * @param <Item>
     */
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty queue
     */
    public Queue() {
        first = null;
        last = null;
        n = 0;
    }

    /***
     * Returns true if this queue is empty
     * @return
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this queue
     *
     * @return
     */
    public int size() {
        return n;
    }

    /**
     * Returns the item least recently added to this queue
     * @return the item least  recently added to this queue
     *          NoSuchElementException if this queue is empty
     */
    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        return first.item;
    }

    /**
     * Adds the item to this queue
     * @param item
     */
    public void enqueue(Item item){
        Node<Item> oldlast=last;
        last=new Node<Item>();
        last.item=item;
        last.next=null;
        if(isEmpty()){
            first=last;
        }else {
            oldlast.next=last;
        }
        n++;
    }

    /**
     * Removes and returns the item on this queue that was least recently added
     * @return  the item on this queue that was least recently added
     *          NoSuchElementException if this queue is empty
     */
    public Item dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("queue underflow");
        }
        Item item=first.item;
        first=first.next;
        return item;
    }

    /**
     * Returns a string representation of this queue.
     * @return Returns a string representation of this queue.
     */
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for (Item item:this) {
            sb.append(item+" ");
        }
        return sb.toString();
    }

    /**
     * Returns an iterator that iterates over the items in this queue in FIFO order.
     * @return
     */
    @Override
    public Iterator<Item> iterator() {

        return null;
    }

    /**
     * an iterator, doesn't implement remove() since it's optional
     * @param <Item>
     */
    public class ListIterator<Item> implements Iterator<Item>{
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current!=null;
        }



        @Override
        public Item next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            Item item=current.item;
            current=current.next;
            return item;
        }
    }


    /**
     * unit test
     * @param args
     */
    public static void main(String[] args) {
        Queue<String> queue=new Queue<>();
        String s=queue.dequeue();
//        while (!StdIn.isEmpty()){
//            String item=StdIn.readString();
//            if(!item.equals("-")){
//                queue.enqueue(item);
//            }else if(!queue.isEmpty()){
//                StdOut.print(queue.dequeue()+" ");
//            }
//        }
//
//        StdOut.println("("+queue.size()+ " left on queue)");
    }
}