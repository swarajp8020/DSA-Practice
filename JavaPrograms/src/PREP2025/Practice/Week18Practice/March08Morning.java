package PREP2025.Practice.Week18Practice;

public class March08Morning {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0, right = 0;

        for(int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        while(left < right) {

            int mid = left + (right - left) / 2;

            if(canShip(weights, days, mid))
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    private boolean canShip(int[] weights, int days, int capacity) {

        int dayCount = 1;
        int currentLoad = 0;

        for(int w : weights) {

            if(currentLoad + w > capacity) {
                dayCount++;
                currentLoad = 0;
            }

            currentLoad += w;
        }

        return dayCount <= days;
    }

    public static void main(String[] args) {

        March08Morning s = new March08Morning();

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        System.out.println("Minimum Capacity: "
                + s.shipWithinDays(weights, days));
    }
}
