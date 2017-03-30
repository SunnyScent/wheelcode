package createanddestroyingobjects.item6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author: SunnyScent
 * @Date: 2016-12-20
 * @Time: 17:06
 */

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULLT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULLT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    /**
     * Ensure space for at least one more element,
     * doubling the capacity each time the array need to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}