class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head, prev = null, nextNode = null;
        while(temp != null){
            ListNode kthNode = findkthnode(temp, k);
            if (kthNode == null){
                if(prev != null)prev.next = temp;
                break;
            }nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if(temp == head)head = kthNode;
            else prev.next = kthNode;
            prev = temp;
            temp = nextNode;
        }return head;
    }
    private ListNode findkthnode(ListNode temp, int k){
        while(temp != null && --k != 0){
            temp = temp.next;
        }if(temp == null)return null;
        return temp;
    }
    private ListNode reverse(ListNode head){
        ListNode temp = null, prev = null;
        while(head != null){
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }return prev;
    }
}