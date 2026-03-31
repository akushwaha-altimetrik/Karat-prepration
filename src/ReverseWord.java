class ReverseWord {
    public String reverseWords(String s) {
        String s1[]=s.split(" ");
        String result="";
        for(int j=s1.length-1;j>=0;j--){
           if(s1[j].trim()!="")
            result=result+s1[j]+" ";

        }
    return result.trim();
    }
}
