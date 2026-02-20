package com.ironhack.int_list_interface;

public class Main {
    public static void main(String[] args) {
        IntArrayList array = new IntArrayList();
        for (int i = 0; i < 11; i++) {
            array.add(i + 1);
        }

        // Check if the last element is inserted correctly
        System.out.println(array.get(10));

        IntVector vector = new IntVector();
        for (int i = 0; i < 21; i++) {
            vector.add(i + 1);
        }

        // Check if the last element is inserted correctly
        System.out.println(vector.get(20));
    }
}
