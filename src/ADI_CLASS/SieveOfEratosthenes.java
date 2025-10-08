package ADI_CLASS;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    static List<Integer> fun(int n){
        List<Integer> ans = new ArrayList<>();
        boolean[] isPrime = new boolean[n+1];
        for(int i = 2; i<=n; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i<=n; i++){
            if(isPrime[i]){
                for(int j = i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i<=n; i++){
            if(isPrime[i]){
                ans.add(i);
            }
        }
        return ans;
    }
    static void main(String[] args) {
        System.out.println(fun(100));
    }
}
