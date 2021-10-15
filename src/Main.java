import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//     Array array = new Array(5);
//     array.runMethods(array);
        var linkedList = new LinkedList();
        linkedList.addToTail(12);
        linkedList.addToTail(22);
        linkedList.addToTail(32);
        linkedList.addToTail(42);
        //linkedList.addFirst(50);

//        System.out.println(linkedList.getIndex(12));
        linkedList._reverse();
        System.out.println(Arrays.toString(linkedList.toArray()));
    }
}
