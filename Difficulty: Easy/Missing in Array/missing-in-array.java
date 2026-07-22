class Solution {
    int missingNum(int arr[]) {
        // code here
        int n =arr.length+1;
        int missingNumber =0;
        int totalNumber =0;
        for(int i=1; i<=n; i++){
            totalNumber ^=i;
        }
        for(int num :arr){
            missingNumber ^=num;
        }
        return totalNumber^missingNumber;
    }
}