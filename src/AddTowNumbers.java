class AddTowNumbers{
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
             ListNode result=new ListNode(); 
            ListNode list=result;
            int rm=0;
           
            while(l1!=null || l2!=null){
                int sum=rm;
                if(l1!=null){
                    sum+=l1.val;
                     l1=l1.next;
                }
                if(l2!=null){
                    sum+=l2.val;
                     l2=l2.next;

                }
               
               

                list.next=new ListNode(sum%10);
               // System.out.println(list.val);
                list=list.next;
                rm=sum/10;
               
            }
           
            if(rm>0)
            list.next=new ListNode(rm);
           
        
       return result.next;
        
    }
}
