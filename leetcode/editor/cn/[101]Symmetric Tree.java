//package editor.cn;
////Given a binary tree, check whether it is a mirror of itself (ie, symmetric aro
////und its center).
////
//// For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
////
////
////    1
////   / \
////  2   2
//// / \ / \
////3  4 4  3
////
////
////
////
//// But the following [1,2,2,null,3,null,3] is not:
////
////
////    1
////   / \
////  2   2
////   \   \
////   3    3
////
////
////
////
//// Follow up: Solve it both recursively and iteratively.
//// Related Topics 树 深度优先搜索 广度优先搜索
//// 👍 1060 👎 0
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
//    public boolean isSymmetric(TreeNode root) {
//        return check(root, root);
//    }
//
//    public boolean check(TreeNode p, TreeNode q) {
//        if (p == null && q == null) {
//            return true;
//        }
//        if (p == null || q == null) {
//            return false;
//        }
//        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
