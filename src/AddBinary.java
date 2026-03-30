class AddBinary{
  public String addBinary(String a, String b) {
        if(a==null || a.length()==0 )
        return b;
        else if(b==null || b.length()==0 )
        return a;
        int remai=0;
        String result="";
        String m="";
        String n="";
        if(a.length()<=b.length()){
            m=b;
            n=a;
        }else{
            m=a;
            n=b;
        }
        int i=m.length()-1;
        int j=n.length()-1;
        while(i>=0 && j>=0){
           int sum =Integer.parseInt(""+m.charAt(i)) +Integer.parseInt(""+n.charAt(j))+remai;
           i--;j--;
            if(sum==2){
                remai=1;
                result=0+result;
            }else if(sum==3){
                result=1+result;
                remai=1;
            }else{
                result=sum+result;
                remai=0;
            }
        }
        if(i>=0 ){
             while(i>=0){
                int sum =Integer.parseInt(""+m.charAt(i))+remai;
                i--;
                if(sum>1){
                     remai=1;
                     result=0+result;
                 }else{
                     result=sum+result;
                     remai=0;
                }

             }
        }
     if(remai==1)
     result=remai+result;
    return result;
    }
}
