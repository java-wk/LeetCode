//package editor.cn;
////Given a binary tree and a sum, determine if the tree has a root-to-leaf path s
////uch that adding up all the values along the path equals the given sum.
////
//// Note: A leaf is a node with no children.
////
//// Example:
////
//// Given the below binary tree and sum = 22,
////
////
////      5
////     / \
////    4   8
////   /   / \
////  11  13  4
//// /  \      \
////7    2      1
////
////
//// return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
////
//// Related Topics 树 深度优先搜索
//// 👍 438 👎 0
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
//    public boolean hasPathSum(TreeNode root, int sum) {
//
////        //DFS
////        if(root == null){
////            return false;
////        }
////        if(root.left == null && root.right == null){
////            return root.val == sum;
////        }
////        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//
//
//        if (root == null) {
//            return false;
//        }
//        Queue<TreeNode> queNode = new LinkedList<TreeNode>();
//        Queue<Integer> queVal = new LinkedList<Integer>();
//        queNode.offer(root);
//        queVal.offer(root.val);
//        while (!queNode.isEmpty()) {
//            TreeNode now = queNode.poll();
//            int temp = queVal.poll();
//            if (now.left == null && now.right == null) {
//                if (temp == sum) {
//                    return true;
//                }
//                continue;
//            }
//            if (now.left != null) {
//                queNode.offer(now.left);
//                queVal.offer(now.left.val + temp);
//            }
//            if (now.right != null) {
//                queNode.offer(now.right);
//                queVal.offer(now.right.val + temp);
//            }
//        }
//        return false;
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
