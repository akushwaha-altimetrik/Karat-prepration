class IntersectOfTowLinkedList{
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode result=null;
        Set<ListNode> set=new HashSet<ListNode>();
        ListNode node=headA;
        while(node!=null){
            set.add(node);
            node=node.next;
        }
        node=headB;
        while(node!=null){
          if(set.contains(node)){
            result=node;
            break;
          }
            node=node.next;
        }
        return result;
    }
}
