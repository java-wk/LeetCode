//package editor.cn;
////Given an array where elements are sorted in ascending order, convert it to a h
////eight balanced BST.
////
//// For this problem, a height-balanced binary tree is defined as a binary tree i
////n which the depth of the two subtrees of every node never differ by more than 1.
////
////
//// Example:
////
////
////Given the sorted array: [-10,-3,0,5,9],
////
////One possible answer is: [0,-3,9,-10,null,5], which represents the following he
////ight balanced BST:
////
////      0
////     / \
////   -3   9
////   /   /
//// -10  5
////
//// Related Topics 树 深度优先搜索
//// 👍 603 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//import java.util.Random;
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
//    Random rand = new Random();
//    public TreeNode sortedArrayToBST(int[] nums) {
//
////        return helper(nums, 0, nums.length - 1);
////    }
////
////    public TreeNode helper(int[] nums, int left, int right) {
////        if (left > right) {
////            return null;
////        }
////
////        // 总是选择中间位置左边的数字作为根节点
////        int mid = (left + right) / 2;
////
////        TreeNode root = new TreeNode(nums[mid]);
////        root.left = helper(nums, left, mid - 1);
////        root.right = helper(nums, mid + 1, right);
////        return root;
//
//        return helper(nums, 0, nums.length - 1);
//    }
//
//    public TreeNode helper(int[] nums, int left, int right) {
//        if (left > right) {
//            return null;
//        }
//
//        // 总是选择中间位置右边的数字作为根节点
//        int mid = (left + right + 1) / 2;
//
//        TreeNode root = new TreeNode(nums[mid]);
//        root.left = helper(nums, left, mid - 1);
//        root.right = helper(nums, mid + 1, right);
//        return root;
//
//
////        return helper(nums, 0, nums.length - 1);
////    }
////
////    public TreeNode helper(int[] nums, int left, int right) {
////        if (left > right) {
////            return null;
////        }
////
////        // 选择任意一个中间位置数字作为根节点
////        int mid = (left + right + rand.nextInt(2)) / 2;
////
////        TreeNode root = new TreeNode(nums[mid]);
////        root.left = helper(nums, left, mid - 1);
////        root.right = helper(nums, mid + 1, right);
////        return root;
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
