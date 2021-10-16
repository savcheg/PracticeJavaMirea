package practice.number.seven;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    }
    void stackVersion() {
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();

        for (int i = 0; i < 5; i++) {
            first.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            second.add(in.nextInt());
        }
        System.out.println(first + " " + second);
    }
//    void queueVersion() {
//        Queue<Integer> first = new Queue<>();
//        Queue<Integer> second = new Queue<>();
//
//        for (int i = 0; i < 5; i++) {
//            first.add(in.nextInt());
//        }
//        for (int i = 0; i < 5; i++) {
//            second.add(in.nextInt());
//        }
//        System.out.println(first + " " + second);
//    }
}
