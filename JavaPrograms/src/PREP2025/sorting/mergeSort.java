package PREP2025.sorting;

import java.util.Arrays;
//Merge Sort Merge Step (in human words):
//Make a temp array as a workspace.
//Compare both halves.
//Pick the smaller and insert in temp.
//Move the pointer of whichever element you used.
//When one side ends, dump the other.
//Copy temp back.
public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 4, 3};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) { // meaning only 1 element is left
            return;
        }
        int mid = left + (right - left) / 2; //Why not (left + right)/2? Because it can overflow on huge PREP2025.arrays, but it works fine for DSA.
        mergeSort(arr, left, mid); // meaning only 1 element is left
        mergeSort(arr, mid + 1, right); // sort right half

        merge(arr,left,mid, right);// then merge
    }
    static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;       // pointer for left half
        int j = mid+1; // pointer for right half
        int k = 0; // pointer for right half[]
        // Step 1: Compare and pick smaller
        while (i<= mid && j<=right){
            if (arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] =arr[j++];
            }
        }
        // Step 2: Copy leftovers (only one of these will run)
        while (i<=mid) temp[k++] =arr[i++];
        while (j<=right) temp[k++] = arr[j++];
        // Step 3: Copy sorted temp[] back into original array
        for (int x = 0; x < temp.length; x++) {
            arr[left+x] = temp[x];
        }
    }

}
//WHY DO WE CREATE temp[]?
//Because merging requires you to combine two sorted halves into a NEW sorted sequence.
//Imagine this:
//Left half:
//[2, 6]
//Right half:
//[3, 5]
//Question:
//Where do you put the merged sorted result while comparing?
//You cannot overwrite arr directly, because you'll destroy values you still need to compare.
//
//So you make a small “workspace”:
//
//temp = []
//
//
//You fill this sorted workspace first:
//temp = [2, 3, 5, 6]
//
//And after merging is complete, only then you copy it back into the main array.
//
//This pattern happens in:
//
//merge sort
//
//merging k sorted lists
//
//external PREP2025.sorting
//
//streaming sorted data
//
//So yes, this temp is absolutely required.
//
//💡 WHY i = left, j = mid + 1, k = 0?
//
//Because you are merging two sorted halves:
//
//arr[left ... mid]      --> LEFT sorted part
//arr[mid+1 ... right]   --> RIGHT sorted part
//
//
//So you create two pointers:
//
//Pointer i
//
//Starts at the first element of left sorted half
//i = left
//
//Pointer j
//
//Starts at first element of right sorted half
//j = mid + 1
//
//Pointer k
//
//Starts at beginning of output array temp
//k = 0
//
//This is how you merge two sorted lists simultaneously.
//
//💡 WHY 3 WHILE LOOPS?
//1️⃣ Compare and merge until one side finishes
//while (i <= mid && j <= right)
//
//
//This runs as long as BOTH lists have items left.
//
//2️⃣ Copy leftover elements from left half
//while (i <= mid)
//
//
//If right side finishes first, this finishes copying the left items.
//
//3️⃣ Copy leftover elements from right half
//while (j <= right)
//
//
//If left side finishes first, this finishes copying the right items.
//
//One of these two leftover loops ALWAYS runs.
//
//💡 HOW TO WRITE MERGE FROM PURE LOGIC?
//
//Here is the mental model you MUST store:
//
//🧠 MERGE SORT MERGE = MERGING TWO QUEUES
//
//Left box:
//[L1, L2, L3]
//
//Right box:
//[R1, R2, R3]
//
//Output box:
//empty
//
//Your job: take the smaller front element each time.
//
//Step-by-step:
//
//Compare front of Left and Right.
//
//Pull out the smaller one → put in output temp.
//
//Move pointer forward in that list.
//
//Repeat until one box is empty.
//
//Dump the leftover box.
//
//Copy output back.
//
//That's the entire merging concept.
//
//💡 WHY MERGE SORT FEELS HARD?
//
//Because you are juggling:
//
//Array splitting
//
//Recursion
//
//Multiple pointers
//
//Multiple while loops
//
//Temporary storage
//
//Copying back
//
//It's the first algorithm that demands structural thinking, not just “swap, move, shift”.
//
//You felt this when you said:
//
//“I peek 10–15 times while writing merge — makes me sad.”
//
//But bro — that's literally EVERYONE on merge sort.
//Even senior devs cannot write merge sort without looking.
//
//Try this:
//
//Ask ANY senior in your office to write merge sort on paper.
//You'll see them pause, think, and probably mess up the merge step.
//
//You’re not dumb — you're normal.
//
//💡 HOW TO BUILD LOGIC FOR MERGE (so you NEVER forget)
//
//Here’s the simplest visualization you'll ever see:
//
//LEFT:  [2, 6]
//RIGHT: [3, 5]
//
//i → 2
//j → 3
//
//temp = []
//
//
//Compare:
//
//2 < 3 → temp = [2], i++
//
//6 < 3 → false, temp = [2, 3], j++
//
//6 < 5 → false, temp = [2, 3, 5], j++
//
//right finished → dump leftover left → temp = [2,3,5,6]
//
//Copy back to arr.
//
//💡 SUMMARY YOU MUST REMEMBER
//Merge Sort Merge Step (in human words):
//
//Make a temp array as a workspace.
//
//Compare both halves.
//
//Pick the smaller and insert in temp.
//
//Move the pointer of whichever element you used.
//
//When one side ends, dump the other.
//
//Copy temp back.
//
//If you remember this logic,
//you can write merge sort without memorizing code.
//
//💬 YOU ASKED:
//
//“How can I write this end-to-end purely from my thoughts?”
//
//Start by writing these 6 human steps on paper.
//
//Then convert each step into code like this:
//
//🔹 Step 1 → create temp
//🔹 Step 2 → while (i <= mid && j <= right)
//🔹 Step 3 → temp[k++] = arr[i] or arr[j]
//🔹 Step 4 → i++ or j++
//🔹 Step 5 → leftover loops
//🔹 Step 6 → copy back to arr
//
//Do this 3–4 times and your brain will lock it.