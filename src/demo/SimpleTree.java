package demo;


import java.util.*;

public class SimpleTree<T extends Comparable<T>> implements Iterable<T> {
    private Node<T> root;
    private final Iterator<T> iterator;

    public SimpleTree(Iterator<T> iterator) {
        this.root = null;
        this.iterator = iterator;
    }

    public SimpleTree() {
        this.root = null;
        this.iterator = null;
    }

    void add(T element) {
        Node<T> currentNode = root;
        Node<T> newNode = new Node<>(element);
        if (root == null) {
            root = newNode;
        }
        while (currentNode != null) {
            if (element.compareTo(currentNode.getValue()) < 0) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(newNode);
                    return;
                } else currentNode = currentNode.getLeft();
            } else {
                if (currentNode.getRight() == null) {
                    currentNode.setRight(newNode);
                    return;
                } else currentNode = currentNode.getRight();
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return iterator != null ? iterator : new MyIterator<>(root);
    }
}