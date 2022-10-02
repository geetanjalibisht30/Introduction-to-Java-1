interface Adding{
    private static int add (int a, int b){
        return a+b;
    }

    static void calc(int a,int  b){
        System.out.println(add(a,b));

    }

}

public class Ans1 {
        public static void main(String[] args){
            Adding.calc(4,5);
        }

}

