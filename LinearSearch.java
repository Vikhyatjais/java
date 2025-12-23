public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,4,1,18,12,3,9,78,99,34,56};
        int target = 34;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        for(int index=0; index<arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
    
}
