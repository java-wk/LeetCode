////package editor.cn;
//////Merge two sorted linked lists and return it as a new sorted list. The new list
////// should be made by splicing together the nodes of the first two lists.
//////
////// Example:
//////
//////
//////Input: 1->2->4, 1->3->4
//////Output: 1->1->2->3->4->4
//////
////// Related Topics 链表
////// 👍 1294 👎 0
////
////
//////leetcode submit region begin(Prohibit modification and deletion)
////
////
/////**
//// * Definition for singly-linked list.
//// * public class ListNode {
//// *     int val;
//// *     ListNode next;
//// *     ListNode() {}
//// *     ListNode(int val) { this.val = val; }
//// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//// * }
//// */
////class ListNode {
////    int val;
////    ListNode next;
////
////    ListNode() {}
////    ListNode(int val) { this.val = val; }
////    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
////}
////
//class Solution {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
////        if (l1 == null) return l2;
////        else if (l2 == null) return l1;
////        else if (l1.val < l2.val) {
////            l1.next = mergeTwoLists(l1.next, l2);
////            return l1;
////        } else {
////            l2.next = mergeTwoLists(l1, l2.next);
////            return l2;
////        }
////
////
////
//        ListNode prehead = new ListNode(-1);
//        ListNode prev = prehead;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                prev.next = l1;
//                l1 = l1.next;
//            } else {
//                prev.next = l2;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
//        prev.next = l1 == null ? l2 : l1;
//        return prehead.next;
//
//    }
//}
////
////
//////leetcode submit region end(Prohibit modification and deletion)
