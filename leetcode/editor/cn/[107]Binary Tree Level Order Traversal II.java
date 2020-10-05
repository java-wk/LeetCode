//package editor.cn;
////Given a binary tree, return the bottom-up level order traversal of its nodes'
////values. (ie, from left to right, level by level from leaf to root).
////
////
////For example:
////Given binary tree [3,9,20,null,null,15,7],
////
////    3
////   / \
////  9  20
////    /  \
////   15   7
////
////
////
////return its bottom-up level order traversal as:
////
////[
////  [15,7],
////  [9,20],
////  [3]
////]
////
//// Related Topics 树 广度优先搜索
//// 👍 342 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.util.LinkedList;
//import java.util.List;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int x) { val = x; }
// * }
// */
//class Solution {
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> levelOrder = new LinkedList<List<Integer>>();
//        if (root == null) {
//            return levelOrder;
//        }
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            List<Integer> level = new ArrayList<Integer>();
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                level.add(node.val);
//                TreeNode left = node.left, right = node.right;
//                if (left != null) {
//                    queue.offer(left);
//                }
//                if (right != null) {
//                    queue.offer(right);
//                }
//            }
//            levelOrder.add(0, level);
//        }
//        return levelOrder;
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
