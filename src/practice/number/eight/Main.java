package practice.number.eight;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> hashMap = new HashMap<>();
        hashMap.put("Dog", new Dog());
        hashMap.put("Cat", new Cat());
        hashMap.put("Owl", new Owl());
        System.out.println(hashMap);
    }
}
