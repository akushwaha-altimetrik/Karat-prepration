class  RemoveTrail{
   boolean get(char c){
        if(c=='a' || c=='e' || c=='i'  || c=='o' || c=='u')
        return true ;
        else
        return false;
      
    }
   
    public String trimTrailingVowels(String s) {
        if(s==null || s.length()==0 || !get(s.charAt(s.length()-1)) ){
         return s;
        }
       
        boolean istrue=false;
         
        while(!istrue && s.length()>0){
             
            if(!get(s.charAt(s.length()-1))){
              istrue=true;
            }else{
                s=s.substring(0,s.length()-1);
            }
            
        }
        return s;
    }
}
