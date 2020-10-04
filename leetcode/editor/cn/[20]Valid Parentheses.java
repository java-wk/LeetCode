//package editor.cn;
////Given a string s containing just the characters '(', ')', '{', '}', '[' and ']
////', determine if the input string is valid.
////
//// An input string is valid if:
////
////
//// Open brackets must be closed by the same type of brackets.
//// Open brackets must be closed in the correct order.
////
////
////
//// Example 1:
////
////
////Input: s = "()"
////Output: true
////
////
//// Example 2:
////
////
////Input: s = "()[]{}"
////Output: true
////
////
//// Example 3:
////
////
////Input: s = "(]"
////Output: false
////
////
//// Example 4:
////
////
////Input: s = "([)]"
////Output: false
////
////
//// Example 5:
////
////
////Input: s = "{[]}"
////Output: true
////
////
////
//// Constraints:
////
////
//// 1 <= s.length <= 104
//// s consists of parentheses only '()[]{}'.
////
//// Related Topics 栈 字符串
//// 👍 1892 👎 0
//
//
//import java.util.*;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public boolean isValid(String s) {
//
//
//        /*
//        Stack<Character> stack = new Stack<>();
//
//        if (s.length()==0) {
//            return true;
//        }
//        if (s.length() % 2 != 0){
//            return false;
//        }
//        stack.push(s.charAt(0));
//        for (int i = 1; i < s.length(); i++) {
//            Character peek = stack.peek();
//        }
//
//
//    }
//
//    private static Character getValue(Character c){
//        switch (c){
//            case '{':return '}';
//            case '[':return ']';
//            case '(':return ')';
//            default;
//        }*/
//




//        int n = s.length();
//        if (n % 2 == 1) return false;
//
//        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
//            put(')', '(');
//            put(']', '[');
//            put('}', '{');
//        }};
//
//        Stack<Character> stack = new Stack<Character>();
////        Deque<Character> stack = new LinkedList<Character>();
//        for (int i = 0; i < n; i++) {
//            char ch = s.charAt(i);
//            if (pairs.containsKey(ch)) {
//                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) return false;
//                stack.pop();
//            } else stack.push(ch);
//        }
//        return stack.isEmpty();
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
