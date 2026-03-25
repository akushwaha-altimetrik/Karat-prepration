class RomanNum{
  public static void main(String[] args) {
    intToRoman(3749);
  }
 public String intToRoman(int num) {
        char[] symbol = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
    	int[] value = {1000, 500, 100, 50, 10, 5, 1}; 
    	StringBuilder res = new StringBuilder();
    	
    	
    	for(int i = 0; i < value.length; i++) {
    		int check = num / value[i];
    		if(check == 4) {
    			if(res.length() > 0 && res.charAt(res.length()-1) == symbol[i-1]) {
    				res.deleteCharAt(res.length()-1);
    				res.append(symbol[i]).append(symbol[i-2]);
    			} else {    				
    				res.append(symbol[i]).append(symbol[i-1]);
    			}
    		} else {
    			for(int append = 0; append < check; append++) {
    				res.append(symbol[i]);
    			}
    		}
    		num %= value[i];
    	}
    	
        return res.toString();
    }
}
