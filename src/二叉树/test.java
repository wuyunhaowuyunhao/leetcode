package 二叉树;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        Integer[] a = list.toArray(new Integer[list.size()]);
        System.out.println(a);
    }
}
