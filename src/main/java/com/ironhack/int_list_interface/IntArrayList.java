package com.ironhack.int_list_interface;

public class IntArrayList implements IntList {
    private int count = 0;
    private int[] arrayData = new int[10];

    @Override
    public void add(int number) {
        if (count == arrayData.length) {
            resize();
        }
        arrayData[count++] = number;
    }

    private void resize() {
        int newSize = (int) (arrayData.length * 1.5);
        int[] newArray = new int[newSize];

        System.arraycopy(arrayData, 0, newArray, 0, arrayData.length);
        arrayData = newArray;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= count) {
            throw new IndexOutOfBoundsException();
        }
        return arrayData[id];
    }
}
