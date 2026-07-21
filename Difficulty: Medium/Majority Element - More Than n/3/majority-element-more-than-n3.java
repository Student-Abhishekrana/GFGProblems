class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n =arr.length;
        
        HashMap<Integer, Integer> map =new HashMap<>();
        
        for(int i=0; i<n; i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
           
        }
        
        map.forEach((key,value)->{
            if(value > n/3){
                ans.add(key);
            }
        });
        
        Collections.sort(ans);
        return ans;
    }
}