//package editor.cn;
////Given an integer rowIndex, return the rowIndexth row of the Pascal's triangle.
////
////
//// Notice that the row index starts from 0.
////
////
////In Pascal's triangle, each number is the sum of the two numbers directly above
//// it.
////
//// Follow up:
////
//// Could you optimize your algorithm to use only O(k) extra space?
////
////
//// Example 1:
//// Input: rowIndex = 3
////Output: [1,3,3,1]
//// Example 2:
//// Input: rowIndex = 0
////Output: [1]
//// Example 3:
//// Input: rowIndex = 1
////Output: [1,1]
////
////
//// Constraints:
////
////
//// 0 <= rowIndex <= 40
////
//// Related Topics 数组
//// 👍 183 👎 0
//
//
//import java.util.ArrayList;
//import java.util.List;
//
////leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public List<Integer> getRow(int rowIndex) {
//        List<Integer> res = new ArrayList<>(rowIndex + 1);
//        int numRows = rowIndex + 1;
//        for (int index = 0; index < numRows; index++){
//            if (index == 0){
//                res.add(1);
//            }else {
//                long eachValOfRow = (long) res.get(index - 1) * (long) (numRows - index) / index;
//                res.add((int) eachValOfRow);
//            }
//        }
//        return res;
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
