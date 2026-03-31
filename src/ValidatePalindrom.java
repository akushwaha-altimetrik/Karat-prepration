class ValidatePalindrom {
    public boolean isPalindrome(String s) {
       String result= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j=result.length()-1;
        boolean isTrue=true;
        while(i<j){
            if(result.charAt(i)!=result.charAt(j)){
                isTrue=false;
                break;
            }
            i++;j--;
        }
        return isTrue;
    }
}
