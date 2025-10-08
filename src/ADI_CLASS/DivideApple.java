package ADI_CLASS;

public class DivideApple {
    static int fun(int num, int numA, int start){
        if(((start+numA-1)%num)==0){
            return num;
        }
        return (start+numA-1)%num;
    }
    static void main(String[] args) {
        System.out.println(fun(5,7,4));
    }
}