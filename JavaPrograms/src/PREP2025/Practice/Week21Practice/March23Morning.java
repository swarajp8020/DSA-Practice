package PREP2025.Practice.Week21Practice;
/// Capacity To Ship Packages Within D Days
public class March23Morning {
    public static int shipWithinDays(int[] weights, int totalDays) {
        int leftCapacity = 0;
        int rightCapacity = 0;
        for (int weight : weights) {
            leftCapacity = Math.max(leftCapacity, weight);
            rightCapacity += weight;
        }
        int minimumCapacity = rightCapacity;
        while (leftCapacity <= rightCapacity) {
            int midCapacity = leftCapacity + (rightCapacity - leftCapacity) / 2;
            int requiredDays = calculateDays(weights, midCapacity);
            if (requiredDays <= totalDays) {
                minimumCapacity = midCapacity;
                rightCapacity = midCapacity - 1;
            } else {
                leftCapacity = midCapacity + 1;
            }
        }
        return minimumCapacity;
    }
    private static int calculateDays(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;
        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                days++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }
        return days;
    }
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days)); // 15
    }
}
