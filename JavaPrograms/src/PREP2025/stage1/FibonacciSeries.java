package PREP2025.stage1;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n= 10;
        int a=0, b=1;

        System.out.println("PREP2025.stage1.Fibonacci Series:" +a+" "+b);
        for (int i=2;i<n;i++){
            int next = a+b;
            System.out.println(" "+next);
            a=b;
            b=next;

        }
    }
}
