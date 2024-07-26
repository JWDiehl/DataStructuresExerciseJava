package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConcreteZStack<E> implements ZStack<E>{

    private final Deque<E> stack;

    public ConcreteZStack() {
        this.stack = new ArrayDeque<>();
    }

    @Override
    public void push(E item) {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'push'");
        stack.addLast(item);
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'pop'");
        if (isEmpty()) {
            return null;
        }
        return stack.removeLast();
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
        if (isEmpty()) {
            return null;
        }
        return stack.peekLast();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
        return stack.isEmpty();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
        return stack.size();
    }

}
