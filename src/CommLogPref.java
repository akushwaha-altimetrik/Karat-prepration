class CommLogPref{
  public static void main(String []argh){
    String []str=new String[]{"flower","flow","flight"};
    longestCommonPrefix(str);
  }
  public String longestCommonPrefix(String[] strs) {
        
        if(strs.length ==0){
            return "";
        }
        
        int length = strs[0].length();
        String result = "";
        
        for(int i =0; i<strs.length; i++){
            if(length > strs[i].length()){
                length = strs[i].length();
            }
        }
        
        for(int i = length ; i> 0 ; i--){
            result = strs[0].substring(0, i);
            for(int j=0; j<strs.length;j++){
                if(!result.equals(strs[j].substring(0,i))){
                    result = "";
                    break;
                }   
            }
            if(result.length() != 0){
                return result;
            } 
        } 
        return result;    
    }
}
