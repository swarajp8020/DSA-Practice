
public static void main(String[] a) {
    int[] num = {0,22,33,45,22};
    int target = 15;
    int ans = linearSearch(num, target);
    System.out.println(ans);
}
//Search the target & return true or false
static boolean linearSearch3(int[] arr, int target){
    if (arr.length == 0){
        return false;
    }
    // run for loop
    for (int element : arr) {
        if (element == target) {
            return true;
        }
    }
    //this line will execute if none of the index is found
    //hence target not found
    return false;
}

//Search the target & return element
static int linearSearch2(int[] arr, int target){
    if (arr.length == 0){
        return -1;
    }
    // run for loop
    for (int element : arr) {
        if (element == target) {
            return element;
        }
    }
    //this line will execute if none of the index is found
    //hence target not found
    return Integer.MAX_VALUE;
}

// search in array: return the index if item found
//otherwise if item not found return -1
static int linearSearch(int[] arr, int target){
    if (arr.length == 0){
        return -1;
    }
    // run for loop
    for (int index = 0; index < arr.length; index++) {
        //check for element at every index if its == target
        int element = arr[index];
        if(element == target){
            return index;
        }
    }
    //this line will execute if none of the index is found
    //hence target not found
    return -1;
}
