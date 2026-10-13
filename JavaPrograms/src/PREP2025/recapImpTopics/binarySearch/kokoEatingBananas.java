package PREP2025.recapImpTopics.binarySearch;

public class kokoEatingBananas {
    static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println(kokoEatingBananas(piles, h));
    }
    static int kokoEatingBananas(int[] piles, int h){
        int low = 1;
        int high = max(piles);
        int ans = high;
        while (low <= high) {
            int speed = low + (high - low)/2;
            if (canEat(piles, h, speed)) {
                ans = speed;
                high = speed - 1;
            } else low = speed + 1;
        }
        return ans;
    }
    static boolean canEat(int[] piles, int h, int speed){
        int hoursUsed = 0;
        for (int pile: piles){
            hoursUsed += (pile+speed-1)/speed;
            if (hoursUsed > h) return false;
        }
        return true;
    }
    static int max(int[] arr){
        int m = 0;
        for (int x: arr)m = Math.max(m, x);
        return m;
    }
}
