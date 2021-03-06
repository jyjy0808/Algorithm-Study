// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class Solution {
    
    public int countDigits(int n){
        int temp = n;
        int count = 0;
        do{
            count++;
            temp /= 10;
            
        }while(temp > 0);
        
        return count;
    }
    
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(countDigits(nums[i]) % 2 == 0)
                count++;
        }
        
        return count;
    }
}