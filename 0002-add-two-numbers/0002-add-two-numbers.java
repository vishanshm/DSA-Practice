class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode ans = new ListNode();
    ListNode temp = ans;
    int carry = 0;
    while (temp != null) {
      if (l1 != null) {
        carry += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        carry += l2.val;
        l2 = l2.next;
      }
      temp.val = carry % 10;
      carry /= 10;
      if (carry > 0 || l1 != null || l2 != null) {
        temp.next = new ListNode();
      }
      temp = temp.next;
    }
    return ans;
  }
}
