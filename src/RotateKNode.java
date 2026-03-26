class RotateKNode{
  public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        return head;
        Map<Integer,ListNode> map=new HashMap<>();
        ListNode node=head;
        int i=1;
        while(node!=null){
            map.put(i,node);
             System.out.println(i+"-"+node.val);
            node=node.next;
            i++;
        }
        i--;
        if(k>i){
            k=k%i;
        }
        ListNode leftNode=map.get(i-k);
        System.out.println(map.get(i-k).val);
         ListNode f=leftNode.next;
          //System.out.println("f-"+f.next.val);
         leftNode.next=null;  
         ListNode s=map.get(1);
         ListNode result=f.next=s;
         // ListNode left= map.get(i-k+1).next=map.get(1); 
          System.out.println(result.val);
          return result;
    }
}
