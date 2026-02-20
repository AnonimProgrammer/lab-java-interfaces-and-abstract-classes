package com.ironhack.int_list_interface;

public class IntVector implements IntList {
    private int count = 0;
    private int[] vectorData = new int[20];

    @Override
    public void add(int number) {
        if (count == vectorData.length) {
            resize();
        }
        vectorData[count++] = number;
    }

    private void resize() {
        int newSize = vectorData.length * 2;
        int[] newVector = new int[newSize];

        System.arraycopy(vectorData, 0, newVector, 0, vectorData.length);
        vectorData = newVector;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= count) {
            throw new IndexOutOfBoundsException();
        }
        return vectorData[id];
    }
}
