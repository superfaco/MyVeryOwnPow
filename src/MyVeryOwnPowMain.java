public class MyVeryOwnPowMain {

    public static void main(String[] args){
        //System.out.println(pow(1, 1000000000000000000L));
        System.out.println(fastPow(2,50));
    }

    static double pow(long a, long b){
        double c = 1;
        for(int i = 0; i < b; i++){
            c = c * a;
        }
        return c;
    }

    static long fastPow(long a, long b){
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a;
        }
        if(b == 2){
            return a * a;
        }

        long c = 1;

        c = fastPow(fastPow(a, b / 2), 2);
        if(b % 2 == 1){
            c *= a;
        }

        return c;
    }
}
