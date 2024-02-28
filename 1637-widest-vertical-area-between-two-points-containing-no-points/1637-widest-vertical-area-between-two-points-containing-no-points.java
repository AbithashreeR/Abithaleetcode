class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
       
        // ans=Arrays.sort(points.Comparator.comparingInt(a->a[0]));
        List<Integer> res=new ArrayList<>();
        for(int[] subArray:points)
        {
        res.add(subArray[0]);
        }
        Collections.sort(res);
        int len=res.size();
         int[] ans=new int[len];
        //diff
            
        for(int j=0;j<=len-2;j++)
        {
            ans[j]=res.get(j+1)-res.get(j);
        }
        
        int max=0;
        for(int i=0;i<ans.length;i++){
           if(max<=ans[i])
           {
               max=ans[i];
           }
        }
        return max;
    }
}