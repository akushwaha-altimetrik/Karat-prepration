class PlusOne{
  public int[] plusOne(int[] digits) {
        int l=digits.length;
        int a[]=digits;
        boolean b=false;
        if(digits[l-1]==9){
            b=true;
        }
        
        int in=0;
        int i=0;
        if(b==true){
             a=new int[l+1];
             a[l]=0;
             in=1;
             i=l-1;
        }else{
            a=new int[l]; 
             i=l-1;
            a[i]=digits[i]+1;
            i--;
        }
       
         while(i>=0)
         {
            if(i==0){
                     if((digits[i]+in)>9)
                     a[i]=1;
                     else
                      a[i]=digits[i]+in;
            }else{
                     a[i]=digits[i]+in;
            }
               
            
            if((digits[i]+in)>10){
                in=1;
            }else{
                in=0;
            }
            i--;
         }
         return a;
    }
}
