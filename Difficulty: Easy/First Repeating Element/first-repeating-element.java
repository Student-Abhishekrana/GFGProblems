class Solution {
    public int firstRepeated(int[] arr) {
        // code here
       HashMap<Integer,Integer> map =new HashMap<>();
       

        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }else{
                ans =Math.min(ans,map.get(arr[i]));
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans + 1;
    }
}
