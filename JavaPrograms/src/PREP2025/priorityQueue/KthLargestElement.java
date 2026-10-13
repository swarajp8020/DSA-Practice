package PREP2025.priorityQueue;

import java.util.PriorityQueue;

/// ELI5 Explanation
/// Imagine you have a bag of exam marks:
/// [3, 2, 1, 5, 6, 4]
/// And I ask:
/// “Tell me the 2nd highest mark.”
/// You could sort everything and pick the 2nd from last.
/// But PREP2025.sorting the whole list is expensive.
/// Instead, think like this:
/// Keep a small box that only stores the top k biggest numbers.
/// Whenever a new number comes:
/// If it’s bigger than the smallest in the box, replace it.
/// At the end, the smallest number inside that box is the answer.
/// That box is called a min-heap of size k.
/// Pattern Identification
/// This is a classic:
/// 👉 Top K pattern using Min Heap
/// Whenever you see:
/// • kth largest
/// • kth smallest
/// • top k elements
/// Think:
/// ✔ Heap, not PREP2025.sorting
/// Logic
/// Create a min heap
/// Insert elements one by one
/// If heap size > k → remove smallest
/// At the end, heap top = kth largest
// Interview Explanation (4 lines)
//I use a min-heap of size k to track the k largest elements.
//I insert numbers one by one and remove the smallest when size exceeds k.
//This keeps only the top k elements efficiently.
//Finally, the heap top gives the kth largest element.
//Complexity
//Time: O(n log k)
//Space: O(k)
public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums) {
            minHeap.add(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    static void main() {
        int[] arr = {8,5,7,2,9,3};
        int k = 3;
        System.out.println(findKthLargest(arr, k));
    }
}
