class ValidatePalindrom {
    public boolean isPalindrome(String s) {
        if (s==null || s.length()<2)
        return true; 
        String result=result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s==null || s.length()<2)
        return true; 
        System.out.println(result);
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
