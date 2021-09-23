public class Array {
    private int[] items;
    private int count = 0;

    public Array(int size) {
        items = new int[size];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;

        }
        items[count] = item;
        count++;

    }

    public void removeAt(int index) {
        if (index < 0 || index > count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexAt(int item){
        for(int i =0;i<count;i++)
            if(items[i]==item)
                return i;
        return -1;
    }

    public void print() {
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < count; i++)
            arr.append(items[i]).append(",");
        System.out.println("[" + arr + "]");
    }


    public void runMethods(Array numbersArr){
        numbersArr.insert(100);
        numbersArr.insert(200);
        numbersArr.insert(300);
        numbersArr.insert(400);
        numbersArr.insert(500);
        numbersArr.insert(600);
        numbersArr.insert(700);
        numbersArr.insert(800);

        System.out.println(numbersArr.indexAt(2000));;
        numbersArr.removeAt(2);
        numbersArr.print();
    }
}
