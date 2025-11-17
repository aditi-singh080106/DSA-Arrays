// Input: nums = [1,0,0,0,1,0,0,1], k = 2
// Output: true
// Explanation: Each of the 1s are at least 2 places away from each other.


class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0 , j = 0 , n = nums.length ;
        while(i<n&&j<n){
            if(nums[i]!=1) i++;
            else break;
        }
        j=i+1;
        while(j<n){
           if(nums[j]==0) j++;
           else{
            int len = j-i-1;
            i=j;
            j++;
            if(len<k) return false;            
           }
        } 
        return true;
    }
}
