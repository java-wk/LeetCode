//package editor.cn;
////Given a binary tree, find its maximum depth.
////
//// The maximum depth is the number of nodes along the longest path from the root
//// node down to the farthest leaf node.
////
//// Note: A leaf is a node with no children.
////
//// Example:
////
//// Given binary tree [3,9,20,null,null,15,7],
////
////
////    3
////   / \
////  9  20
////    /  \
////   15   7
////
//// return its depth = 3.
//// Related Topics 树 深度优先搜索
//// 👍 712 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.util.LinkedList;
//import java.util.Queue;
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
//    public int maxDepth(TreeNode root) {
//        //递归
////        if (root == null) {
////            return 0;
////        } else {
////            int leftHeight = maxDepth(root.left);
////            int rightHeight = maxDepth(root.right);
////            return Math.max(leftHeight, rightHeight) + 1;
////        }
//
//        //广度优先
//        if (root == null) {
//            return 0;
//        }
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.offer(root);
//        int ans = 0;
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            while (size > 0) {
//                TreeNode node = queue.poll();
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//                size--;
//            }
//            ans++;
//            System.out.println("ans"+ ans);
//        }
//        return ans;
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
