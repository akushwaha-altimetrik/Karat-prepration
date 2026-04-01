class AddTowNumbers{
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         
            ListNode list=null;
            int rm=0;
            ListNode result=null; 
            while(l1!=null && l2!=null){
                int v=l1.val+l2.val+rm;
                l1=l1.next;
                l2=l2.next;
                ListNode n1=new ListNode();
                
                if(v>9){
                    n1.val=0;
                    rm=1;
                }else{
                   n1.val=v;
                    rm=0;
                }
                if(list==null){
                    
                    list=n1;
                    result=list;
                  
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
                    n1.val=0;
                    rm=1;
                }else{
                    n1.val=v;
                    rm=0;
                }
            }
           
        
       return result;
        
    }
}
