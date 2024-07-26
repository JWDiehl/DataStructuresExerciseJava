package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class ZQueueImpl<E> implements ZQueue<E>{

    private final Deque<E> deque;

    public ZQueueImpl() {
        this.deque = new ArrayDeque<>();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
        return deque.isEmpty();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
        return deque.size();
    }

    @Override
    public void enqueue(E element) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
        deque.addLast(element);
    }

    @Override
    public E dequeue() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
        if (isEmpty()) {
            return null;
        }
        return deque.removeFirst();
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
        if (isEmpty()) {
            return null;
        }
        return deque.peekFirst();
    }

}
