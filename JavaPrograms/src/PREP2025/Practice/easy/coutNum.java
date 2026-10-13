package PREP2025.Practice.easy;

public class coutNum {
    public static void main(String[] args) {
        int n=124433;
        int count=0;

        while (n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}

