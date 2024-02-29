class Solution {
    public int mostWordsFound(String[] sentences) {
      int[] arr=new int[sentences.length];
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
         int words=sentences[i].split("\\s+").length;
          if(max<words)
          {
              max=words;
          }
        }
        return max;
    }
}