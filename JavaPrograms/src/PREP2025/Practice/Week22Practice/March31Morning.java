package PREP2025.Practice.Week22Practice;
/// Jump Game
public class March31Morning {
    public static boolean canJump(int[] jumpArray) {

        int maximumReachableIndex = 0;

        for (int currentIndex = 0; currentIndex < jumpArray.length; currentIndex++) {

            if (currentIndex > maximumReachableIndex) {
                return false;
            }

            maximumReachableIndex = Math.max(
                    maximumReachableIndex,
                    currentIndex + jumpArray[currentIndex]
            );
        }

        return true;
    }

    public static void main(String[] args) {

        int[] jumpArray = {2,3,1,1,4};

        System.out.println(canJump(jumpArray)); // true
    }
}
