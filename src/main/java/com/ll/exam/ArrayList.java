package com.ll.exam;

public class ArrayList {
    private int size;
    private int[] datum;

    public ArrayList() {
        size = 0;
        datum = new int[2];
    }

    public int size() {
        return size;
    }

    public void add(int data) {
        sizeUpIfFull();

        datum[size] = data;
        size++;
    }

    private void sizeUpIfFull() {
        if ( isFull() ) {
            sizeUp();
        }
    }

    private void sizeUp() {
        int[] newDatum = new int[datum.length * 2];

        for ( int i = 0; i < datum.length; i++ ) {
            newDatum[i] = datum[i];
        }

        datum = newDatum;
    }

    private boolean isFull() {
        return size == datum.length;
    }

    public int get(int index) {
        return datum[index];
    }

    public void removeAt(int index) {
        for ( int i = index + 1; i < size; i++ ) {
            datum[i - 1] = datum[i];
        }

        size--;
    }

    public int getArrayLength() {
        return datum.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");

        for ( int i = 0; i < size; i++ ) {
            System.out.printf("%d : %d\n", i, datum[i]);
        }
    }
}
