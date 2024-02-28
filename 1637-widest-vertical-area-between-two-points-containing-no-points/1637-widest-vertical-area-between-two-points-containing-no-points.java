class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
       
        // ans=Arrays.sort(points.Comparator.comparingInt(a->a[0]));
        // List<Integer> res=new ArrayList<>();
        // for(int[] subArray:points)
        // {
        // res.add(subArray[0]);
        // }
        // Collections.sort(res);
        int[] arr1=new int[points.length];
        for(int i=0;i<points.length;i++)
        {
           arr1[i]=points[i][0]; 
        }
        Arrays.sort(arr1);
        int len=arr1.length;
         int[] ans=new int[len];
        //diff
            
        for(int j=0;j<=len-2;j++)
        {
            ans[j]=arr1[j+1]-arr1[j];
        }
        
        int max=0;
        for(int k=0;k<ans.length;k++){
           if(max<=ans[k])
           {
               max=ans[k];
           }
        }
        return max;
    }
}