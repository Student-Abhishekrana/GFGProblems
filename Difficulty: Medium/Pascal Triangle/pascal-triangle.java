class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        
        ans.add(1);
        
        for(int i=1; i<n; i++){
            ans.add(0);
            for(int j=i; j>0; j--){
                int prev =ans.get(j-1);
                int curr =ans.get(j);
                ans.set(j,prev+curr);
            }
        }
        return ans;
    }
}