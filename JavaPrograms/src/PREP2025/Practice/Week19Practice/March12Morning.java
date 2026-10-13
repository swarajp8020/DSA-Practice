package PREP2025.Practice.Week19Practice;
/// Container With Most Water
public class March12Morning {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
    static void main(String[] args) {
        March12Morning sol = new March12Morning();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max Water: "
                + sol.maxArea(height));
    }
}
