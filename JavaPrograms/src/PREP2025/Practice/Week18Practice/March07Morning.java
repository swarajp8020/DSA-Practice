package PREP2025.Practice.Week18Practice;

public class March07Morning {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        for(int pile : piles)
            right = Math.max(right, pile);

        while(left < right) {

            int mid = left + (right - left) / 2;

            int hours = 0;

            for(int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if(hours <= h)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    public static void main(String[] args) {

        March07Morning s = new March07Morning();

        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println("Minimum Speed: "
                + s.minEatingSpeed(piles, h));
    }
}
