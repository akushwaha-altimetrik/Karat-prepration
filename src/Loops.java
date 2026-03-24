class Loops{
     static void print(int a,int b,int n){
      int next=1;
        int prev=0+a;
        for(int i=0;i<n;i++){
          prev+=next*b;
            next*=2;
            System.out.print(prev+" ");
        }
        System.out.println();
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           print(a, b, n);
        }
        in.close();
    }
}
