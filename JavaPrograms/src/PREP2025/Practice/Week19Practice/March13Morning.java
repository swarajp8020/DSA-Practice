package PREP2025.Practice.Week19Practice;
/// Trapping Rain Water
public class March13Morning {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] >= leftMax)
                    leftMax = height[left];
                else
                    water += leftMax - height[left];
                left++;
            } else {
                if(height[right] >= rightMax)
                    rightMax = height[right];
                else
                    water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }
     static void main(String[] args) {
        March13Morning sol = new March13Morning();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Water: "
                + sol.trap(height));
    }
}
