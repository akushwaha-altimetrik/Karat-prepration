class Merg2SortArr{
  public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
   public static ListNode mergeTwoLists(ListNode A, ListNode B) {
    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;
    while (A != null || B != null) {
      int temp = -1;
      if (A != null && B != null) {
        if (A.val < B.val) {
          temp = A.val;
          A = A.next;
        }
        else {
          temp = B.val;
          B = B.next;
        }
      }
      else if (A != null && B == null) {
        temp = A.val;
        A = A.next;
      }
      else {
        temp = B.val;
        B = B.next;
      }
      curr.next = new ListNode(temp);
      curr = curr.next;
    }
    return dummy.next;
  }
}
