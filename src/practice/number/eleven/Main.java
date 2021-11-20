package practice.number.eleven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();

        List<Thread> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Thread(new HorseTread()));
        }
        for (int i = 0; i < n; i++) {
            list.get(i).start();
        }
    }
}
