package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println(tree.minimum_steps(8,8,4,4,3,2));
        System.out.println(tree.minimum_steps(8, 8, 4, 4, 4, 5)); // 3
        System.out.println(tree.minimum_steps(8, 8, 0, 0, 7, 7)); // 6
        System.out.println(tree.minimum_steps(8, 8, 0, 0, 0, 7)); // 5
        System.out.println(tree.minimum_steps(20, 10, 0, 4, 9, 15)); // 8
        System.out.println(tree.minimum_steps(100, 10, 4, 4, 9, 99)); // 48
        System.out.println(tree.minimum_steps(8, 8, 4, 4, 4, 4)); // 0
        System.out.println(tree.minimum_steps(100, 100, 50, 50, 57, 57)); // 6
    }

}
