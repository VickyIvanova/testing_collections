package com.company;
import java.util.*;
public class Main {
    private static final int k_elements = 100 * 100;
    public static void main(String[] args) {
        List ls = new ArrayList();
        for (int i = 0; i < k_elements; i++) {
            ls.add(i);
        }
        testListBeginning(ls);
        testListBeginning(new LinkedList(ls));
        testListMiddle(ls);
        testListMiddle(new LinkedList(ls));
        testListEnd(ls);
        testListEnd(new LinkedList(ls));
    }
    public static void testListBeginning(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
            list.remove(0);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("в начало " +
                list.getClass().getSimpleName() + " " + time);
    }
    public static void testListMiddle(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(k_elements / 2, new Object());
            list.remove(k_elements / 2);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("в середину " +
                list.getClass().getSimpleName() + " " + time);
    }
    public static void testListEnd(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(new Object());
            list.remove(k_elements);
        }
        time = System.currentTimeMillis() - time;
        System.out.println("в конец " +
                list.getClass().getSimpleName() + " " + time);
    }
}