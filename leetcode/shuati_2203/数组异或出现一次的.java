package shuati_2203;

import java.util.HashMap;

public class 数组异或出现一次的 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int temp = map.get(array[i]);
                temp++;
                map.put(array[i], temp);
            } else {
                map.put(array[i], 1);
            }
        }
        boolean first = true;
        for (Integer key : map.keySet()) {
            if (map.get(key) != 1) {
                continue;
            } else {
                if (first) {
                    num1[0] = key;
                    first = false;
                } else {
                    num2[0] = key;
                }
            }
        }
        String a = "";
        String[] split = a.split(",");
    }
}
