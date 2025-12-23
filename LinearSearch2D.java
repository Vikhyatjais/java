public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56}
        };
        int target = 34;
        int[] ans = linearSearch2D(arr, target);
        System.out.println("Row: " + ans[0] + " Column: " + ans[1]);
    }

    static int[] linearSearch2D(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    
}
