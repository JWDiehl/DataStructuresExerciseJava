package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class ConcreteZPriorityQueue<E> implements ZPriorityQueue<E>{

    private final TreeMap<Integer, Deque<E>> priorityMap;

    public ConcreteZPriorityQueue() {
        this.priorityMap = new TreeMap<>();
    }

    @Override
    public void enqueue(E element, Integer priority) {
        // TODO Auto-generated method stub
        Deque<E> deque = priorityMap.computeIfAbsent(priority, k -> new ArrayDeque<>());
        deque.addLast(element);
    }

    @Override
    public E dequeue(Integer priority) {
        // TODO Auto-generated method stub
        Deque<E> deque = priorityMap.get(priority);
        if (deque == null || deque.isEmpty()) {
            throw new NoSuchElementException("No element with the specified priority.");
        }
        E element = deque.removeFirst();

        if (deque.isEmpty()) {
            priorityMap.remove(priority);
        }
        return element;
        //throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    @Override
    public E peek(Integer priority) {
        // TODO Auto-generated method stub
        Deque<E> deque = priorityMap.get(priority);
        if (deque == null || deque.isEmpty()) {
            throw new NoSuchElementException("No element with the specified priority.");
        }
        return deque.getFirst();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");

        //Sum up the sizes of all deques
        return priorityMap.values().stream().mapToInt(Deque::size).sum();
    }

    @Override
    public int size(Integer priority) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
        //Return the size of the deque for the specified priority or 0 if not present
        Deque<E> deque = priorityMap.get(priority);
        return deque != null ? deque.size() : 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
        return priorityMap.isEmpty();
    }

}
