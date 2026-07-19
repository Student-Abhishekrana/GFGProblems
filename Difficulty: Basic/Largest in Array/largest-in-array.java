class Solution {
    public static int largest(int[] arr) {
        // code here
        int largest =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest =arr[i];
            }
        }
        return largest;
    }
}
