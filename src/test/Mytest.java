package test;

import java.util.ArrayList;
import java.util.List;

public class Mytest {

    private static void test0(String s){
        s = "sfadrfaesd";
    }
    private static void test1(List<Integer> list){
        list.add(3);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        test1(list);
        System.out.println(list);
    }
}
