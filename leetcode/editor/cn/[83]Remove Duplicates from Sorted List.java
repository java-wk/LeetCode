//package editor.cn;
////Given a sorted linked list, delete all duplicates such that each element appea
////r only once.
////
//// Example 1:
////
////
////Input: 1->1->2
////Output: 1->2
////
////
//// Example 2:
////
////
////Input: 1->1->2->3->3
////Output: 1->2->3
////
//// Related Topics 链表
//// 👍 405 👎 0
//
//
////leetcode submit region begin(Prohibit modification and deletion)
//
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//    }
//}
//
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode current = head;
//        while (current != null && current.next != null) {
//            if (current.next.val == current.val) {
//                current.next = current.next.next;
//            } else {
//                current = current.next;
//            }
//        }
//        return head;
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
