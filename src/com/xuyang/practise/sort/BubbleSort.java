package com.xuyang.practise.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuyang on 16/5/19.
 */
public class BubbleSort {

    public static void sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Integer left = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                Integer right = list.get(j);
                if (left.compareTo(right) >= 0) {
                    list.set(i, right);
                    list.set(j, left);
                }
            }
        }
    }

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        BubbleSort.sort(list);
        System.out.println(list);
    }
}
