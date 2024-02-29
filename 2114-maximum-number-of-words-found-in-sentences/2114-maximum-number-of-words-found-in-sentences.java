class Solution {
    public int mostWordsFound(String[] sentences) {
      int[] arr=new int[sentences.length];
        int max=0;
        for(String ans:sentences)
        {
         int words=ans.split("\\s+").length;
          if(max<words)
          {
              max=words;
          }
        }
        return max;
    }
}