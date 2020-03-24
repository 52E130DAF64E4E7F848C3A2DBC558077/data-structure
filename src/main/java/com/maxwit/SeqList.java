package com.maxwit;

/**
 * Hello world!
 */
public class SeqList {
    int LEN = 5;
    int size = 0;
    Integer[] a = new Integer[LEN];

    public static void main(String[] args) {
        SeqList seqList = new SeqList();
        for (int i = 0; i < 5; i++) {
            seqList.insert(i * 2);
        }

        seqList.traversal();
    }

    void insert(int x) {
        a[size++] = x;
    }


    void traversal() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}
