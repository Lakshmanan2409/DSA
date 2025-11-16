package PatternProgs;

public class square {
    public static void main(String[] args) {
        int n=95;
        double p=2;
        System.out.println(squareRoot(n,p));
    }

    static double squareRoot(int n, double p) {
            double root=0.0;
            int s=0,m = 0,e=n;
            while(s<=e){
                m=s+(e-s)/2;
                if(m*m==n)
                    return m;
                if(m*m>n)
                    e=m-1;
                else
                    s=m+1;
            }
            root=m-1;
            System.out.println(root);
            double inc=0.1;
            for(int i=0;i<p;i++){
                while(root*root<n){
                    root+=inc;
                }
                root-=inc;
                inc/=10;
            }
            return root;
    }
}
