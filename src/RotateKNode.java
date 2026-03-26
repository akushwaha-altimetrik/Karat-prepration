class RotateKNode{
  public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k<1 )
        return head;
        Map<Integer,ListNode> map=new HashMap<>();
        ListNode node=head;
        int i=1;
        while(node!=null){
            map.put(i,node);
            node=node.next;
            i++;
        }
        i--;
        if(k>i){
            k=k%i;
        }
        if(k==i || k==0)
        return head;
        ListNode leftNode=map.get(i-k);
         ListNode f=leftNode.next;
         leftNode.next=null; 
         map.get(i).next=map.get(1);
          
          return f;
    }}
