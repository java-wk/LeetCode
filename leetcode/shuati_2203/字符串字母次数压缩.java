package shuati_2203;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 字符串字母次数压缩 {

    public String getString(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int max = map.values().stream()
                .max(Comparator.comparingInt(o -> o)).orElse(0);
        String[] ss = new String[max + 1];
        for (Character key : map.keySet()) {
            int count = map.get(key);
            if (ss[count] != null) {
                ss[count] = ss[count] + key + count;
            } else {
                ss[count] = String.valueOf(key + count);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = ss.length - 1; i > 0; i--) {
            String s = ss[i];
            if (s != null) {
                sb.append(s);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        字符串字母次数压缩 压缩 = new 字符串字母次数压缩();
        String string = 压缩.getString("abcdeabcdabcdabcdabAA");
        System.out.println(string);
    }

}
