
class Format{
  
    static  String getSpace(int n){
            String spac="";
            while(n>0){
            spac+=" ";
                n--; 
            }
            return spac;
        }
        static String getZero(String s){
            String s1="";
            int i=s.length();
            while(i<3){
                s1+="0";
                i++;
            }
            return s1;
        }
    public static void main(String[] args) {
       
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String zeros=getZero(""+x);
                String space=getSpace(15-s1.length());
                if(x<100)
                System.out.println(s1+space+zeros+x);
                else 
System.out.println(s1+space+x);                 //java           100 
                //Complete this line
            }
            System.out.println("================================");

    }
}
