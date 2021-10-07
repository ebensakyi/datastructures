public class Main {
    public static void main(String[] args) {
//     Array array = new Array(5);
//     array.runMethods(array);
        var linkedList = new LinkedList();
        linkedList.addLast(12);
        linkedList.addLast(22);
        linkedList.addLast(32);
        linkedList.addLast(42);
        //linkedList.addFirst(50);

        System.out.println(linkedList.indexOf(12));

    }
}
