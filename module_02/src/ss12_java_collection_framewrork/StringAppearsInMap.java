package ss12_java_collection_framewrork;

import java.util.*;

public class StringAppearsInMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to test:");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String[] arr = str.split("");
        String key = "";
        int value;
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (treeMap.containsKey(key)) {
                value = treeMap.get(key);
                treeMap.remove(key);
                treeMap.put(key, value + 1);
            } else {
                treeMap.put(key, 1);
            }
        }
        Set set = treeMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            key = (String) iterator.next();
            System.out.println("Từ " + key + ", Số lượng từ: " + treeMap.get(key) + "lần");
        }

    }
}
