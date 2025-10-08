package ADI_CLASS;

public class GreatestCommonDivisor {
    static int fun(int n, int m){
        if(n==0) return m;
        return fun(m%n,n);
    }
    static int fun2(int n, int m){
        return n*m/fun(n,m);
    }
    static void main(String[] args) {
        System.out.println(fun(4,12));
        System.out.println("LCM is : " + fun2(12, 18));
    }
}