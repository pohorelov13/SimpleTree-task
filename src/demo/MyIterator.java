package demo;

import java.util.Iterator;
import java.util.Stack;

public class MyIterator<T> implements Iterator<T> {
    private final Stack<Node<T>> stack = new Stack<>();

    public MyIterator(Node<T> node) {
        stack.push(node);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        Node<T> node = stack.pop();
        if ((node.getLeft() != null)) {
            stack.push(node.getLeft());
        }

        if (node.getRight() != null) {
            stack.push(node.getRight());
        }
        return node.getValue();
    }
}