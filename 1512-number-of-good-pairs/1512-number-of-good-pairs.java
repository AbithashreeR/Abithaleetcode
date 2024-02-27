class Solution {
    public int numIdenticalPairs(int[] nums) {
     int length=nums.length;
     int[] ans=new int[length];
        int count=0;
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if((nums[i]==nums[j]) && (i<j))
                {
                   count++;
                }
            }
        }
        return count;
    }
}