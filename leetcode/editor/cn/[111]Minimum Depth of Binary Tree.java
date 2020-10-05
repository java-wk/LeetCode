//package editor.cn;
////Given a binary tree, find its minimum depth.
////
//// The minimum depth is the number of nodes along the shortest path from the roo
////t node down to the nearest leaf node.
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
//// return its minimum depth = 2.
//// Related Topics 树 深度优先搜索 广度优先搜索
//// 👍 376 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
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
//    class QueueNode {
//        TreeNode node;
//        int depth;
//
//        public QueueNode(TreeNode node, int depth) {
//            this.node = node;
//            this.depth = depth;
//        }
//    }
//
//    public int minDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        Queue<QueueNode> queue = new LinkedList<QueueNode>();
//        queue.offer(new QueueNode(root, 1));
//        while (!queue.isEmpty()) {
//            QueueNode nodeDepth = queue.poll();
//            TreeNode node = nodeDepth.node;
//            int depth = nodeDepth.depth;
//            if (node.left == null && node.right == null) {
//                return depth;
//            }
//            if (node.left != null) {
//                queue.offer(new QueueNode(node.left, depth + 1));
//            }
//            if (node.right != null) {
//                queue.offer(new QueueNode(node.right, depth + 1));
//            }
//        }
//
//        return 0;
//
//
//////        DFS
////        if (root == null) {
////            return 0;
////        }
////
////        if (root.left == null && root.right == null) {
////            return 1;
////        }
////
////        int min_depth = Integer.MAX_VALUE;
////        if (root.left != null) {
////            min_depth = Math.min(minDepth(root.left), min_depth);
////        }
////        if (root.right != null) {
////            min_depth = Math.min(minDepth(root.right), min_depth);
////        }
////
////        return min_depth + 1;
////
//
//
//
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
