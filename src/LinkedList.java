
import java.util.NoSuchElementException;

public class LinkedList {
    Node first;
    Node last;
    private int size = 0;

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addToTail(int item) {
        Node node = new Node(item);
        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }

    public void addToHead(int item) {
        Node node = new Node(item);
        if (first == null) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
            size++;
        }
    }

    public int getIndex(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }

        }
        return -1;
    }

    public boolean contains(int item) {
        return getIndex(item) != -1;
    }

    public void removeHead() {
        if (first == null)
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        Node second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeTail() {
        if (first == null)
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        //gets node before tail node
        Node previous = getPrevious(last);
        last = previous;
        last.next = null;
        size--;
    }

    public int getSize() {
//        var current = first; O(n)
//        int _size = 0;
//        while (current != null) {
//            current = current.next;
//            _size++;
//        }
        //O(1)
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        int index = 0;

        while (current != null) {
            array[index] = current.value;
            current = current.next;
            index++;
        }
        return array;
    }

//    public int[] reverse() {
//        var current = last;
//        for(int i = size;i<size;i--){
//
//        }
//    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

}
