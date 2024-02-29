class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] arr=new Boolean[candies.length];
     for(int i=0;i<candies.length;i++)
     {
        int x=candies[i]+extraCandies;
        arr[i]=true;
        for(int j=0;j<arr.length;j++)
        {
            if(x<candies[j])
            {
                arr[i]=false;
                
            }
        }
         
     }
        List<Boolean> res=new ArrayList<>();
        for(Boolean value:arr){
            res.add(value);
        }
        return res;
    
    }
}
