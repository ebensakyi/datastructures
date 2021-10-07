public class LinkedList {
    public class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

//    private LinkedList(Node first,Node last){
//        this.first =first;
//        this.last =last;
//    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (first == null) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
//        System.out.println("["+node+"->"+node.next+"->"+last);

    }

    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
//        System.out.println("["+first+"->"+node.next+"->"+last);
    }

    public void _addFirst(int item) {
        var node = new Node(item);
        if (first == null) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void _addLast(int item) {
        var node = new Node(item);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }

    }

    public void deleteFirst() {

    }

    public void deleteLast() {

    }

    public void contains() {

    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
}
