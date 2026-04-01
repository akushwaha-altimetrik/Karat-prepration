class AddTowNumbers{
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
             ListNode result=new ListNode(); 
            ListNode list=result;
            int rm=0;
           
            while(l1!=null && l2!=null){
                int v=l1.val+l2.val+rm;
                l1=l1.next;
                l2=l2.next;
                ListNode n1=new ListNode();
                
                if(v>9){
                    n1.val=v%10;
                    rm=v/10;
                }else{
                   n1.val=v;
                    rm=0;
                }
                if(list==null){
                    
                    list=n1;
                  
                }else{
                    list.next=n1;
                    
                }
               list=list.next;
            }
            ListNode rl=null;
            if(l1==null && l2!=null){
                rl=l2;
            }else if(l2==null && l1!=null){
                rl=l1;
            }
            
            while(rl!=null){
                 int v=rl.val+rm;
                rl=rl.next;
                 ListNode n1=new ListNode();
                if(v>9){
                     n1.val=v%10;
                    rm=v/10;
                }else{
                    n1.val=v;
                    rm=0;
                }
                list.next=n1;
                list=list.next;
               
            }
            if(rm>0)
            list.next=new ListNode(rm);
           
        
       return result.next;
        
    }
}
