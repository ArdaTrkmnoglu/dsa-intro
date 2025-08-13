package dsa_intro.DSA_files;

public class arrays {

    int size;
    int capacity = 10;
    Object[] array;

    public arrays() {
        this.array = new Object[capacity];
    }

    public arrays(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {

        if (size >= capacity) {
            expand();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {

        if (size >= capacity) {
            expand();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size-i-1); j++) {
                    array[i+j] = array[i+j+1];
                }
                array[size-1] = null;
                size--;
                if (size < (int)(capacity/2)) {
                    shrink();
                }
            }
        }

    }

    public int search(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }

        return -1;
    }

    private void expand() {

        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {

        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

        String string = "";

        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }

        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }

        return string;
    }

    public static void main(String[] args) {

        arrays arr = new arrays(5);

        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");

        arr.insert(0, "E");
        arr.delete("E");

        arr.add("F");
        arr.add("G");

        arr.delete("D");
        arr.delete("F");

        int srcIndex = arr.search("C");
        if (srcIndex == -1) {
            System.out.println("Item not found.");
        } else {
            System.out.println("Item found at index " + srcIndex + ".");
        }

        System.out.println(arr);
        System.out.println("size: " + arr.size);
        System.out.println("capacity: " + arr.capacity);
        System.out.println("empty: " + arr.isEmpty());
    }
}
