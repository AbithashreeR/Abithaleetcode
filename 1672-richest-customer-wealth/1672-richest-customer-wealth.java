class Solution {
    public int maximumWealth(int[][] accounts) {
     int[] arr=new int[accounts.length];
        int sum=0;
      for(int i=0;i<accounts.length;i++)
      {
          for(int j=0;j<accounts[i].length;j++)
          {
              sum=sum+accounts[i][j];
          }
          arr[i]=sum;
          sum=0;
      }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}