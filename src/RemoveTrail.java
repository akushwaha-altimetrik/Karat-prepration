class  RemoveTrail{
   Set<Character> set=new HashSet<>();
   
    public String trimTrailingVowels(String s) {
         set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        if(s==null || s.length()==0 || !set.contains(s.charAt(s.length()-1)) ){
         return s;
        }
       
        boolean istrue=false;
         
        while(!istrue && s.length()>0){
             
            if(!set.contains(s.charAt(s.length()-1))){
              istrue=true;
            }else{
                s=s.substring(0,s.length()-1);
            }
            
        }
        return s;
    }
}
