package DataStructuresAndAlgorithms;

import java.util.ArrayList;

public class CreateArray {

    int size;
    int capacity = 10;
    Object[] array;

    public CreateArray() {
        this.array = new Object[capacity];
    }

    public CreateArray(int capacity) {
        this.capacity = capacity;

        this.array = new Object[capacity];

    }

    public void add(Object data) {
        if (this.size >= this.capacity) {

            grow();
        }

        array[size] = data;
        size++;

    }

    public void insert(int index, Object data) {

    }

    public void delete(Object data) {

    }

    public int search(Object data) {

        return -1;
    }

    private void grow() {

    }

    private void shrink() {

    }

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public String toString() {

        String string = "";

        for (int i = 0; i < size; i++) {
            string += array[i] + ",";
        }

        if (string != "") {
            string = string.substring(0, string.length() - 2);
        }
        return string;
    }
}
